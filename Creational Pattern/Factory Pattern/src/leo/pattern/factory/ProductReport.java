package leo.pattern.factory;

public class ProductReport implements ReportTemplate{
    @Override
    public void reportData() {
        System.out.println("Report function for Product");
    }
}
