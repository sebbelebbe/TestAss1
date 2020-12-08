package convert;

public class DegreesConverter {
    public double ConvertToCelsius(double temp) {
        double res = (temp -32) * 5/9;
        return res;

    }

    public double convertToFahrenheit(double temp) {
        double res = temp * (9/5) + 32;
        return res;

    }
}
