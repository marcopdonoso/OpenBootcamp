package com.marcopdonoso;

public class SmartPhone extends SmartDevices{

    String network;
    Integer phoneNumber;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, String network, int phoneNumber) {
        super(brand, model);
        this.network = network;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "network='" + network + '\'' +
                ", phoneNumber=" + phoneNumber +
                "} " + super.toString();
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
