package JavaUnitConverter;

public enum LengthUnit {
    METER (1), KILOMETER (1), MILE (1);

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    private double num;
    LengthUnit(double num){
        this.num = num;
    }


}
