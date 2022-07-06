public class WeatherForecaster {
    private final int pressure;
    private final int humidity;

    WeatherForecaster(int pressure, int humidity) {
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public String rainProb() {
        if (pressure == 1 && humidity == 3) {
            return "Muy alta";
        } else if (pressure == 1 && humidity == 2) {
            return "Alta";
        } else if ((pressure == 1 && humidity == 1) || (pressure == 2 && humidity == 2)) {
            return "Media";
        } else {
            return "Baja";
        }
    }

    public String sunProb() {
        if (pressure == 1 && humidity == 3) {
            return "Baja";
        } else if ((pressure == 1 && humidity == 2) || (pressure == 2 && humidity == 3) || (pressure == 2 && humidity == 2)) {
            return "Media";
        } else {
            return "Alta";
        }
    }

    public String coldProb() {
        if ((pressure == 1 && humidity == 3) || (pressure == 1 && humidity == 2) || (pressure == 2 && humidity == 3)) {
            return "Alta";
        } else if ((pressure == 2 && humidity == 2)) {
            return "Madia";
        } else {
            return "Baja";
        }
    }
}
