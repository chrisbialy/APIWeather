import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class APIConnection {

    private String apiBase = "http://api.openweathermap.org/data/2.5/weather?q=";
    private String units = "metric";
    private String apiKey = "";
    private String inline = "";

    public void callAPI(String location) throws IOException, ParseException {

        JSONObjectClass jsonObjectClass = new JSONObjectClass();

        URL url = new URL (apiBase + URLEncoder.encode(location, "utf-8") + "&appid=" + apiKey + "&mode=json&units=" + units);


        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responsecode = conn.getResponseCode();


        if (responsecode != 200) {
            if  (responsecode == 404) {
                throw new RuntimeException("HttpResponseCode: " + responsecode + " city not found");
            }

        } else {
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                inline += sc.nextLine();
            }
        }


        jsonObjectClass.getJArray(inline);
    }
}