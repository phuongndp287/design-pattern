package leo.pattern.dependencyinjection.di;

public class MailAlert implements Alert {
    @Override
    public void sendAlert() {
        System.out.println("Send Alert For Email");
    }
}
