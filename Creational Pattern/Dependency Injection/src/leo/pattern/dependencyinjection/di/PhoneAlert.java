package leo.pattern.dependencyinjection.di;

import leo.pattern.dependencyinjection.di.Alert;

public class PhoneAlert implements Alert {
    @Override
    public void sendAlert() {
        System.out.println("Send Alert For Phone");
    }
}
