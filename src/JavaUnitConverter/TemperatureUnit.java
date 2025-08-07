package JavaUnitConverter;

public enum TemperatureUnit {
    CELSIUS(1), FAHRENHEIT(1), KELVIN(1);
    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    private double num;
    TemperatureUnit(double num){
        this.num = num;
    }
}
