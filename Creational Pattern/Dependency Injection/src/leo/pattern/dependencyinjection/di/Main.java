package leo.pattern.dependencyinjection.di;

import leo.pattern.dependencyinjection.di.Alert;
import leo.pattern.dependencyinjection.di.MailAlert;
import leo.pattern.dependencyinjection.ioc.IocInjector;

public class Main {
    public static void main(String[] args) {
        // Inject by constructor
        Alert phoneAlert = (Alert) IocInjector.getInstance("phoneAlert");
        ServerAlertService phoneAlertService = new ServerAlertService(phoneAlert);
        phoneAlertService.sendAlert();

        // Inject by setter
        Alert mailAlert = (Alert) IocInjector.getInstance("mailAlert");
        ServerAlertService mailAlertAlertService = new ServerAlertService();
        mailAlertAlertService.setAlert(mailAlert);
        mailAlertAlertService.sendAlert();
    }
}