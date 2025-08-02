package step5.Enums.Seasons;

public enum Season {
    WINTER(-17.3), SPRING(12.5), SUMMER(19.8), FALL(8.2);

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    private double temp;
    Season(double temp){
        this.temp = temp;
    }

    @Override
    public String toString(){
        return "Season: " + name() + " Avg Temp: " + getTemp();
    }

}
