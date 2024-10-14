package extentreport.version0;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class pdf {

    public static void main(String[] args) {

        try {
            // Paths to the HTML and PDF files
            String htmlSource = System.getProperty("user.dir") + "\\test-output\\testReport.html";
            String pdfDest = System.getProperty("user.dir") + "\\test-output\\testReport.pdf";

            // Converter properties to enable CSS processing and specify base URI for external resources
            ConverterProperties properties = new ConverterProperties();
            properties.setBaseUri(System.getProperty("user.dir") + "\\test-output");

            // Convert HTML to PDF
            HtmlConverter.convertToPdf(new FileInputStream(htmlSource), new FileOutputStream(pdfDest), properties);

            System.out.println("PDF generated successfully with HTML and CSS!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
