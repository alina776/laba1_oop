package device;

public class ClimateDevice {
    private String brand;
    private int powerConsumption;
    private boolean isTurnedOn;

    public ClimateDevice(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isTurnedOn = false;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getPowerConsumption() { return powerConsumption; }
    public void setPowerConsumption(int powerConsumption) {
        if (powerConsumption > 0) this.powerConsumption = powerConsumption;
    }

    public boolean isTurnedOn() { return isTurnedOn; }
    public void setTurnedOn(boolean turnedOn) { this.isTurnedOn = turnedOn; }

    public String turnOn() {
        this.isTurnedOn = true;
        return "Прибор " + brand + " включен.";
    }

    public String turnOff() {
        this.isTurnedOn = false;
        return "Прибор " + brand + " выключен.";
    }

    public String getEnergyInfo() {
        String status = isTurnedOn ? "работает" : "выключен";
        return "Прибор " + brand + " (" + status + "). Мощность: " + powerConsumption + " Вт.";
    }
}