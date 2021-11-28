package emailverification.email;

public interface EmailSender {

    void sendEmail(String to, String email);
}