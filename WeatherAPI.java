public class WeatherAPI {
    public static int getTemperature(String city) {
        if (city.equals("delhi")) {
            return 35;
        } else if (city.equals("mumbai")) {
            return 30;
        }
        return 0;
    }
}
