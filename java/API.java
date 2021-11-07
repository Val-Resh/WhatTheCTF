import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class API {
    DateFormatting date = new DateFormatting();
    private String link = "https://ctftime.org/api/v1/events/?limit=1&start=" + date.startDate + "&finish=" + date.endDate;
    private String data;
    private URL url;

        public void dataExtract() {
            try {
                url = new URL(link);
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    data += scanner.nextLine();
                }
                scanner.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public String extractURL() {
           int startIndex = data.indexOf("\"url\":");
           int startURL = data.indexOf("\"", startIndex + 5) + 1;
           int endURL = data.indexOf(("\""), startURL);
           return data.substring(startURL, endURL);
        }
}
