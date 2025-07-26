package step2.Methods;

public class AverageCalculator {
    public static void main(String[] args) {
        System.out.println(getAvg(new double[]{1.0, 2.0, 3.0, 4.0}));
    }
    public static double getAvg(double[] numbers){
        if(numbers.length != 0) {
            double sum = 0;
            double avg = 0;
            for (double i : numbers) {
                sum += i;
            }
            return avg = sum / numbers.length;
        }
        return  -1;
    }
}
