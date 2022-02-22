import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.time.LocalDate;
import java.util.Date;


public class CollectData {

    public void getData(JSONArray jsonArr) {

        //Get data for Results array
        for (int i = 0; i < jsonArr.size(); i++) {
            //Store the JSON objects in an array
            //Get the index of the JSON object and print the values as per the index
            JSONObject jsonObject = (JSONObject) jsonArr.get(i);
            JSONArray jsonArray = new JSONArray();
            jsonArray.add(jsonObject.get("main"));
            jsonArray.add(jsonObject.get("wind"));

            String name = (String) jsonObject.get("name");
            String temp = "";
            String pressure = "";
            String humidity = "";
            String speed = "";
            String deg = "";
            Date localDate = new Date();


            for (int j = 0; j < jsonArray.size(); j++) {

                JSONObject mainObject = (JSONObject) jsonArray.get(j);

                if (mainObject.containsKey("temp")) {
                    temp = mainObject.get("temp").toString();
                }

                if (mainObject.containsKey("pressure")) {
                    pressure = mainObject.get("pressure").toString();
                }

                if (mainObject.containsKey("humidity")) {
                    humidity = mainObject.get("humidity").toString();
                }

                if (mainObject.containsKey("speed")) {
                    speed = mainObject.get("speed").toString();
                }

                if (mainObject.containsKey("deg")) {
                    deg = mainObject.get("deg").toString();
                }

            }
            Display display = new Display(name, temp,pressure,humidity,speed,deg,localDate);
            display.getDegValue(deg);
            System.out.println(display);

        }
    }
}

