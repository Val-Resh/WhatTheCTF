import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class Main {
    public static void main (String[] args){
        API api = new API();
        api.dataExtract();
        String url = api.extractURL();
        if (Desktop.isDesktopSupported())
        {
            try {
                Desktop.getDesktop().browse(URI.create(url));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
