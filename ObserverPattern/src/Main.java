public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        Statistics statistics = new Statistics();
        Forecast forecast = new Forecast();

        weatherData.subscribe(currentConditions);
        weatherData.subscribe(statistics);
        weatherData.subscribe(forecast);

        weatherData.setPressure(14.3f);
        System.out.println("I will change the temperature as well ");
        weatherData.setTemperature(36.0f);
    }
}