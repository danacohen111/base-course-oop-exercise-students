package Entities;

public class Coordinates {
   private Double longitude;
   private Double latitude;

    public Coordinates(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getCoordinatesDescription() {
        return this.getLatitude() +", " + this.getLongitude();
    }
}
