package singcc.myhkobservatory.model;

public class WeatherForecast {
    String forecastDate;
    String week;
    int ForecastIcon;
    Inner forecastMaxtemp;
    Inner forecastMintemp;
    Inner forecastMaxrh;
    Inner forecastMinrh;

    public class Inner {
        int value;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public String getForecastDate() {
        return forecastDate;
    }

    public void setForecastDate(String forecastDate) {
        this.forecastDate = forecastDate;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public int getForecastIcon() {
        return ForecastIcon;
    }

    public void setForecastIcon(int forecastIcon) {
        ForecastIcon = forecastIcon;
    }

    public Inner getForecastMaxtemp() {
        return forecastMaxtemp;
    }

    public void setForecastMaxtemp(Inner forecastMaxtemp) {
        this.forecastMaxtemp = forecastMaxtemp;
    }

    public Inner getForecastMintemp() {
        return forecastMintemp;
    }

    public void setForecastMintemp(Inner forecastMintemp) {
        this.forecastMintemp = forecastMintemp;
    }

    public Inner getForecastMaxrh() {
        return forecastMaxrh;
    }

    public void setForecastMaxrh(Inner forecastMaxrh) {
        this.forecastMaxrh = forecastMaxrh;
    }

    public Inner getForecastMinrh() {
        return forecastMinrh;
    }

    public void setForecastMinrh(Inner forecastMinrh) {
        this.forecastMinrh = forecastMinrh;
    }
}
