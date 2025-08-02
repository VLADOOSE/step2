package step5.Generics.Pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<String, String>("Object", "Def");
        System.out.println(pair.toString());
        pair.setFirst("AnotherObject");
        pair.setSecond("AnotherDef");
        System.out.println(pair.getFirst() + " " + pair.getSecond() + "\n" + pair.toString());
    }
}
