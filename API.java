import java.util.Scanner;

public class API {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city: ");
        String city = scanner.next();

        int temp = WeatherAPI.getTemperature(city.toLowerCase());
        if (temp == 0) {
            System.out.println("Data not available");
        } else {
            System.out.println("Temprature of " + city + " is: " + temp);
        }
        scanner.close();
    }
}
