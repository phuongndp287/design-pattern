package leo.pattern.factory;

public class OrderReport implements ReportTemplate{
    @Override
    public void reportData() {
        System.out.println("Report function for Order");
    }
}
