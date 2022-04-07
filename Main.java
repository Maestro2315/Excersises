import java.util.List;

public class Main {

    public static void main(String[] args) {
        Zadacha zadacha = new Zadacha();
        System.out.println(zadacha);
//        int count = zadacha.getLineOccurrences("HaveFan");
//        System.out.println(count);
        int count = zadacha.getLineWithSecondLine("f");
        System.out.println(count);
        List<String> list = zadacha.getList();
        System.out.println(list);
        System.out.println(zadacha.getClone());
    }
}