
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Zadacha {

    private final List<String> list = new ArrayList<>(10);

    public Zadacha() {
        fill();
    }

    public int beb() {

        int emptyLines = 0;
        for (String item : list) {
            if (item.isEmpty()) {
                emptyLines++;
            }
        }
        return emptyLines;
    }

    public int getBlankLinesCount() {
        int blankCount = 0;
        for (String item : list) {
            if (item.isBlank()) {
                blankCount++;
            }
        }
        return blankCount;
    }

    public List<String> getLinesStartingWith() {
        List<String> result = new ArrayList<>();
        for (String item : list) {

            if (item.startsWith("A")) {
                result.add(item);
            }
        }
        return result;
    }

    private void fill() {
        list.add("HaveFan");
        list.add("haveFan");
        list.add("Havefan");
        list.add("OlgaZanita");
        list.add("OlgaNeZanita");
        list.add("");
        list.add("");
        list.add("           \t ");

    }

    public int getLineOccurrences(String line) {
        int lineCount = 0;
        for (String item : list) {
            if (item.equalsIgnoreCase(line)) {
                lineCount++;
            }
        }
        return lineCount;
    }

    public int getLineWithSecondLine(String subString) {
        int count = 0;
        for (String item : list) {
            if (item.toLowerCase(Locale.ROOT).contains(subString.toLowerCase(Locale.ROOT))) {
                count++;
            }
        }
        return count;
    }

    public List<String> getList() {
        return list;
    }

    public List<String> getClone() {
        return new LinkedList<>(list);
    }

//    public String revert(String firstWord, String lastWord) {
//        char[] lastletters = lastWord.toCharArray();
//        char[] firstletters = new char[lastletters.length];
//        int count = lastletters.length;
//        StringBuilder stringBuilder = new StringBuilder();
//        int count2 = 0;
//        for (char letter : lastletters) {
//
//        }
//    }
}

//Создать новый список. Кол-во элементов будет не более 10. Основные обращения будут на чтение.
//Положить в список 5 строк. Некоторые должны отличаться только некоторыми заглавными/не заглавными буквами
//Положить в список две пустые строки и строку, состоящую только из пробелов и табуляций
//Посчитать кол-во пустых строк.
//Посчитать кол-во строк, содержащих только пробелы, табуляции или пустые (не содержащие текста)
//Найти все строки, начинающиеся с буквы "А"
//Найти количество строк, совпадающих с заданной строкой, вне зависимости от регистра
//Найти количество строк, содержащих в любом месте заданную подстроку
//Минимальным размером кода создать LinkedList, который будет содержать все те же элементы, что и имеющийся список
//Вывести все строки в списке в обратном порядке. Т.е. если были строки "икея", "акула", "купить", то код должен вывести "яеки", "алука", "ьтипук"