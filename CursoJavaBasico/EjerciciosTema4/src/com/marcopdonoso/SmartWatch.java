package com.marcopdonoso;

public class SmartWatch extends SmartDevices{

    String watchBandMaterial;
    Boolean heartRate;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, String watchBandMaterial, boolean heartRate) {
        super(brand, model);
        this.watchBandMaterial = watchBandMaterial;
        this.heartRate = heartRate;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "watchBandMaterial='" + watchBandMaterial + '\'' +
                ", heartRate=" + heartRate +
                "} " + super.toString();
    }

    public String getWatchBandMaterial() {
        return watchBandMaterial;
    }

    public void setWatchBandMaterial(String watchBandMaterial) {
        this.watchBandMaterial = watchBandMaterial;
    }

    public boolean isHeartRate() {
        return heartRate;
    }

    public void setHeartRate(boolean heartRate) {
        this.heartRate = heartRate;
    }
}
