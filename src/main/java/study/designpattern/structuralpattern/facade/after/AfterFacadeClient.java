package study.designpattern.structuralpattern.facade.after;

public class AfterFacadeClient {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("facadepattern@study.com");
        emailMessage.setTo("structuralpattern@study.com");
        emailMessage.setSubject("Test Mail from Java Program");
        emailMessage.setText("message");
        emailSender.sendEmail(emailMessage);
    }
}
