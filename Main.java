package main;

import device.SmartInverterAirConditioner;

public class Main {
    public static void main(String[] args) {
        SmartInverterAirConditioner myAc = new SmartInverterAirConditioner(
            "Daikin", 1400, 25, "Охлаждение", "Средняя", false, 30, 55.0
        );

        System.out.println("=== ТЕСТИРОВАНИЕ МЕТОДОВ КЛИМАТИЧЕСКОГО ПРИБОРА (ClimateDevice) ===");
        System.out.println(myAc.turnOn());
        System.out.println(myAc.getEnergyInfo());
        System.out.println(myAc.turnOff());
        
        myAc.turnOn();
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ МЕТОДОВ КОНДИЦИОНЕРА (AirConditioner) ===");
        System.out.println(myAc.changeTemperature(-3));
        System.out.println(myAc.switchMode("Обогрев"));
        System.out.println(myAc.adjustAirflow("Высокая"));
        System.out.println();

        System.out.println("=== ТЕСТИРОВАНИЕ МЕТОДОВ УМНОГО КОНДИЦИОНЕРА (SmartInverterAirConditioner) ===");
        System.out.println(myAc.connectToWifi("Home_Network_5G"));
        System.out.println(myAc.runSelfDiagnosis());
        System.out.println(myAc.resetFilterTimer());
        System.out.println(myAc.runSelfDiagnosis());
    }
}