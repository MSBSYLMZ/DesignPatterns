public class CurrentConditions extends Display{
    public void update(float temperature, float humidity, float pressure) {
        super.update(temperature, humidity, pressure);
        String output = String.format("Current Condiditons got updated new values: Temperature: %f  Humidity %f  Pressure %f", temperature, humidity, pressure);
        System.out.println(output);
    }
}
