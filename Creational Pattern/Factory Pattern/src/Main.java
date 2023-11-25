import leo.pattern.factory.ReportFactory;
import leo.pattern.factory.ReportTemplate;
import leo.pattern.factory.ReportType;

public class Main {
    public static void main(String[] args) {
        ReportTemplate reportTemplate = ReportFactory.getTemplateReport(ReportType.ORDER);
        reportTemplate.reportData();
    }
}