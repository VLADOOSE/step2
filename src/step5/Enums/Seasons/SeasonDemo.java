package step5.Enums.Seasons;

public class SeasonDemo {
    public static void main(String[] args) {
        for(Season i : Season.values()){
            System.out.println(i.toString());
        }
    }
}
