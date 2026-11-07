package device;

public class SmartInverterAirConditioner extends AirConditioner {
    private boolean wifiConnected;
    private int filterWearPercent;      
    private double compressorFrequency; 

    public SmartInverterAirConditioner(String brand, int powerConsumption, int targetTemperature, 
                                       String mode, String fanSpeed, boolean wifiConnected, 
                                       int filterWearPercent, double compressorFrequency) {
        super(brand, powerConsumption, targetTemperature, mode, fanSpeed);
        this.wifiConnected = wifiConnected;
        this.filterWearPercent = filterWearPercent;
        this.compressorFrequency = compressorFrequency;
    }

    public boolean isWifiConnected() { return wifiConnected; }
    public void setWifiConnected(boolean wifiConnected) { this.wifiConnected = wifiConnected; }

    public int getFilterWearPercent() { return filterWearPercent; }
    public void setFilterWearPercent(int filterWearPercent) {
        if (filterWearPercent >= 0 && filterWearPercent <= 100) {
            this.filterWearPercent = filterWearPercent;
        }
    }

    public double getCompressorFrequency() { return compressorFrequency; }
    public void setCompressorFrequency(double compressorFrequency) {
        if (compressorFrequency >= 0) this.compressorFrequency = compressorFrequency;
    }

    public String connectToWifi(String networkName) {
        this.wifiConnected = true;
        return "Устройство подключено к Wi-Fi сети: " + networkName;
    }

    public String runSelfDiagnosis() {
        return "Самодиагностика завершена. Ошибок не обнаружено. Износ фильтра: " + filterWearPercent + "%.";
    }

    public String resetFilterTimer() {
        this.filterWearPercent = 0;
        return "Счетчик износа фильтра сброшен. Фильтр очищен.";
    }
}