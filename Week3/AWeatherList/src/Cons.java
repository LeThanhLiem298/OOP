public class Cons extends AWeatherList {
    private WeatherRecord first;
    private AWeatherList rest;

    public Cons(WeatherRecord first, AWeatherList rest) {
        this.first = first;
        this.rest = rest;
    }
}