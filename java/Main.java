import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class Main {
    public static void main (String[] args){
        API.dataExtract();
        String url = API.extractURL();
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
