package JavaUnitConverter;

public enum WeightUnit {
    KILOGRAM(1), POUND(1), OUNCE(1);

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    private double num;
    WeightUnit(double num){
        this.num = num;
    }
}
