import junit.framework.TestCase;

public class Test extends TestCase {
    public void testWeatherReports() {
        Date d1 = new Date(1, 1, 2024);
        TemperatureRange today1 = new TemperatureRange(32, 24);
        TemperatureRange normal1 = new TemperatureRange(30, 22);
        TemperatureRange record1 = new TemperatureRange(36, 18);
        WeatherRecord wr1 = new WeatherRecord(d1, today1, normal1, record1, 5.2);

        AWeatherList list1 = new Empty();
        AWeatherList list2 = new Cons(wr1, list1);

        Date d2 = new Date(2, 1, 2024);
        TemperatureRange today2 = new TemperatureRange(29, 21);
        TemperatureRange normal2 = new TemperatureRange(30, 22);
        TemperatureRange record2 = new TemperatureRange(35, 17);
        WeatherRecord wr2 = new WeatherRecord(d2, today2, normal2, record2, 12.0);

        AWeatherList list3 = new Cons(wr2, list2);
    }
}