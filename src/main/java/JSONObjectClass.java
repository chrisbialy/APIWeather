import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONObjectClass {

    public JSONArray getJArray(String inline) throws ParseException {

        CollectData collectData = new CollectData();

          /*  System.out.println("\nJSON data in string format");
            System.out.print(inline);
            sc.close();*/

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(inline);
        JSONArray jsonArr = new JSONArray();
        jsonArr.add(jsonObject);

        collectData.getData(jsonArr);
        return jsonArr;
    }
}
