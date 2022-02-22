import org.json.simple.parser.ParseException;
import java.io.IOException;

public class MainGET {
    public static void main(String[] args) throws IOException, ParseException {

        APIConnection apiConnection = new APIConnection();
        apiConnection.callAPI("Resko");
    }
}
