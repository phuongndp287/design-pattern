package leo.pattern.dependencyinjection.di;

import leo.pattern.dependencyinjection.di.Alert;

public class ServerAlertService {
    private Alert alert;

    public ServerAlertService() {
    }

    // Inject by constructor
    public ServerAlertService(Alert alert) {
        this.alert = alert;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }

    public void sendAlert() {
        alert.sendAlert();
    }
}
