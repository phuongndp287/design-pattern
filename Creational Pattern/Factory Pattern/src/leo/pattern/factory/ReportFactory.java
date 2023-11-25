package leo.pattern.factory;

public class ReportFactory {
    private ReportFactory() {
    }

    public static ReportTemplate getTemplateReport(ReportType reportType) {
        switch (reportType) {
            case ORDER:
                return new OrderReport();
            case PRODUCT:
                return new ProductReport();
            default:
                throw new IllegalArgumentException("Report Type is error");
        }
    }
}
