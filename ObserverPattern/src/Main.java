public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        Statistics statistics = new Statistics();
        Forecast forecast = new Forecast();

        currentConditions.subscribe(weatherData);
        statistics.subscribe(weatherData);
        forecast.subscribe(weatherData);

        weatherData.setPressure(14.3f);
        System.out.println("I will change the temperature as well ");
        weatherData.setTemperature(36.0f);

        System.out.println("I will remove the Statistics observation");
        statistics.unsubscribe(weatherData);

        weatherData.setHumidity(89.2f);
    }
}