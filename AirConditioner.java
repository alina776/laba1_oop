package device;

public class AirConditioner extends ClimateDevice {
    private int targetTemperature; // °C
    private String mode;           // Режим работы
    private String fanSpeed;       // Скорость вентилятора

    public AirConditioner(String brand, int powerConsumption, int targetTemperature, String mode, String fanSpeed) {
        super(brand, powerConsumption);
        this.targetTemperature = targetTemperature;
        this.mode = mode;
        this.fanSpeed = fanSpeed;
    }

    public int getTargetTemperature() { return targetTemperature; }
    public void setTargetTemperature(int targetTemperature) {
        if (targetTemperature >= 16 && targetTemperature <= 30) {
            this.targetTemperature = targetTemperature;
        }
    }

    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }

    public String getFanSpeed() { return fanSpeed; }
    public void setFanSpeed(String fanSpeed) { this.fanSpeed = fanSpeed; }

    public String changeTemperature(int delta) {
        int newTemp = this.targetTemperature + delta;
        if (newTemp >= 16 && newTemp <= 30) {
            this.targetTemperature = newTemp;
            return "Температура изменена до " + this.targetTemperature + "°C.";
        }
        return "Ошибка: температура выходит за допустимый диапазон (16-30°C).";
    }

    public String switchMode(String newMode) {
        this.mode = newMode;
        return "Кондиционер переведен в режим: " + this.mode + ".";
    }

    public String adjustAirflow(String speed) {
        this.fanSpeed = speed;
        return "Скорость вентилятора установлена на уровень: " + this.fanSpeed + ".";
    }
}