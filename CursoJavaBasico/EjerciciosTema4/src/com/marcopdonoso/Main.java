package com.marcopdonoso;

public class Main {
    public static void main(String[] args) {

        SmartDevices phone1 = new SmartPhone();
        SmartDevices phone2 = new SmartPhone("Apple","iPhone XS","4G",652381265);

        SmartDevices watch1 = new SmartWatch();
        SmartDevices watch2 = new SmartWatch("Apple","SmartWatch 3","Silicon",true);

        phone1.setBrand("Samsung");
        phone1.setModel("Galaxy S21");

        watch1.setBrand("Huawei");
        watch1.setModel("Watch 3");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(watch1);
        System.out.println(watch2);
    }
}
