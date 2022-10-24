import java.util.ArrayList;

public class WeatherData {
    float temperature;
    float humidity;
    float pressure;

    ArrayList<Display> subscribers = new ArrayList<>();

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        measurementsChanged();
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        for (Display d: subscribers) {
            d.update(temperature, humidity, pressure);
        }
        
    }

    public void subscribe(Display d) {
        subscribers.add(d);
    }

    public void unsubscribe(Display d) {
        subscribers.remove(d);
    }



}
