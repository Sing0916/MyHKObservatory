package singcc.myhkobservatory.model;

public class FndResponse {
    String generalSituation;
    WeatherForecast[] weatherForecast;
    String updateTime;
    SeaTemp seatemp;
    SoilTemp[] soilTemps;

    public SeaTemp getSeatemp() {
        return seatemp;
    }

    public void setSeatemp(SeaTemp seatemp) {
        this.seatemp = seatemp;
    }

    public SoilTemp[] getSoilTemps() {
        return soilTemps;
    }

    public void setSoilTemps(SoilTemp[] soilTemps) {
        this.soilTemps = soilTemps;
    }

    public WeatherForecast[] getWeatherForecast() {
        return weatherForecast;
    }

    public void setWeatherForecast(WeatherForecast[] weatherForecast) {
        this.weatherForecast = weatherForecast;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getGeneralSituation() {
        return generalSituation;
    }

    public void setGeneralSituation(String generalSituation) {
        this.generalSituation = generalSituation;
    }
}
