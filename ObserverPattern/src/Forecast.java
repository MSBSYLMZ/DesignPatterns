public class Forecast extends Display{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        super.update(temperature, humidity, pressure);
        String output = String.format("Forecast got updated new values: Temperature: %f  Humidity %f  Pressure %f", temperature, humidity, pressure);
        System.out.println(output);
    }
}
