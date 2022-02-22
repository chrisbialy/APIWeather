import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data

public class Display  {

    private String name;
    private String temp;
    private String pressure;
    private String humidity;
    private String speed;
    private String deg;
    private String windDirection = "";
    private Date localDate;


    public String getDegValue(String deg) {
        this.deg = deg;
        Integer deg2 = Integer.valueOf(deg);


    /*
    * if (deg2 == 310 || deg2 == 320) {
    windDirection = "NW";
}

if (deg2 == 290 || deg2 == 300) {
    windDirection = "W/NW";
}

if (deg2 == 260 || deg2 == 270 deg2 == 280) {
    windDirection = "W";
}

if (deg2 == 240 || deg2 == 250) {
    windDirection = "W/SW";
}

if (deg2 == 220 || deg2 == 230) {
    windDirection = "SW";
}

if (deg2 == 200 || deg2 == 210) {
    windDirection = "S/SW";
}

if (deg2 == 170 || deg2 == 180 || deg2 == 190) {
    windDirection = "S";
}

if (deg2 == 150 || deg2 == 160) {
    windDirection = "S/SE";
}

if (deg2 == 130 || deg2 == 140) {
    windDirection = "SE";
}

if (deg2 == 110 || deg2 == 120) {
    windDirection = "E/SE";
}

if (deg2 == 80 || deg2 == 90 || deg2 == 100) {
windDirection = "E";
}

if (deg2 == 60 || deg2 == 70) {
windDirection = "E/NE";
}

if (deg2 == 40 || deg2 == 50) {
windDirection = "NE";
}

if (deg2 == 20 || deg2 == 30) {
windDirection = "N/NE";
}
*/



        switch (deg2) {
            case 350:
            case 360:
            case 010:
                windDirection = "N";
                break;
            case 330:
            case 340:
                windDirection = "N/NW";
                break;
            case 310:
            case 320:
                windDirection = "NW";
                break;
            case 290:
            case 300:
                windDirection = "W/NW";
                break;
            case 260:
            case 270:
            case 280:
                windDirection = "W";
                break;
            case 240:
            case 250:
                windDirection = "W/SW";
                break;
            case 220:
            case 230:
                windDirection = "SW";
                break;
            case 200:
            case 210:
                windDirection = "S/SW";
                break;
            case 170:
            case 180:
            case 190:
                windDirection = "S";
                break;
            case 150:
            case 160:
                windDirection = "S/SE";
                break;
            case 130:
            case 140:
                windDirection = "SE";
                break;
            case 110:
            case 120:
                windDirection = "E/SE";
                break;
            case 80:
            case 90:
            case 100:
                windDirection = "E";
                break;
            case 60:
            case 70:
                windDirection = "E/NE";
                break;
            case 40:
            case 50:
                windDirection = "NE";
                break;
            case 20:
            case 30:
                windDirection = "N/NE";
                break;
            default:
                windDirection = "default";
        }
        return windDirection;
    }



    public Display(String name, String temp, String pressure, String humidity, String speed, String windDirection, Date localDate) {
        this.name = name;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.speed = speed;
        this.windDirection = windDirection;
        this.localDate = localDate;
    }


    @Override
    public String toString() {

        return "The Weather forecast date: " + localDate +
                "\nCity: " + name +
                "\nTemperature: " + temp + "°C" +
                "\nPressure: " + pressure + " hpa" +
                "\nHumidity: " + humidity + "%" +
                "\nWind Speed: " + speed + " meter/sec" +
                "\nWind Direction: " + windDirection;
    }

}
