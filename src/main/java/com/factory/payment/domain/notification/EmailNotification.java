package com.factory.payment.domain.notification;
import com.factory.payment.config.notification.TwilioConfig;
import com.factory.payment.dtos.payment.DtoPaymentResponse;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import java.util.Properties;

public class EmailNotification implements INotification {

    static TwilioConfig twilioConfig = new TwilioConfig();

    @Override
    public String sendNotification(DtoPaymentResponse data) {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(twilioConfig.getMailHost());
        mailSender.setPort(twilioConfig.getMailPort());
        mailSender.setUsername(twilioConfig.getMailUsername());
        mailSender.setPassword(twilioConfig.getPasswordEmail());
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        SimpleMailMessage message = getSimpleMailMessage(data);

        mailSender.send(message);

        return "Email ✉ enviado correctamente a waderhe@gmail.com";
    }


    private static SimpleMailMessage getSimpleMailMessage(DtoPaymentResponse data) {
        String subject = "Pago procesado exitosamente";
        String body = String.format(
                "Pago procesado exitosamente:\n\n" +
                        "Estado: %s\n" +
                        "Mensaje: %s\n" +
                        "Tipo de pago: %s\n" +
                        "Monto inicial: $%.2f\n" +
                        "Monto final: $%.2f",
                data.getState(),
                data.getMessage(),
                data.getPaymentType(),
                data.getInitialAmount(),
                data.getFinalAmount()
        );

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("waderhe@gmail.com");
        message.setSubject(subject);
        message.setText(body);
        message.setFrom(twilioConfig.getMailUsername());
        return message;
    }
}