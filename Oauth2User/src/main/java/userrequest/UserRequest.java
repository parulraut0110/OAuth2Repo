package userrequest;

import java.awt.Desktop;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class UserRequest {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException, IOException {
        String servletUrl = "https://OAuth2Client:8543/OAuth2Client/request?user=Aditi";

        URL url = new URI(servletUrl).toURL();
		
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
             Desktop.getDesktop().browse(new URI(servletUrl));
        } else {
             System.out.println("Opening browser is not supported on this platform.");
        }
		
	}

}
