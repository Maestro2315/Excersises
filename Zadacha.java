
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

//?????????????? ?????????? ????????????. ??????-???? ?????????????????? ?????????? ???? ?????????? 10. ???????????????? ?????????????????? ?????????? ???? ????????????.
//???????????????? ?? ???????????? 5 ??????????. ?????????????????? ???????????? ???????????????????? ???????????? ???????????????????? ????????????????????/???? ???????????????????? ??????????????
//???????????????? ?? ???????????? ?????? ???????????? ???????????? ?? ????????????, ?????????????????? ???????????? ???? ???????????????? ?? ??????????????????
//?????????????????? ??????-???? ???????????? ??????????.
//?????????????????? ??????-???? ??????????, ???????????????????? ???????????? ??????????????, ?????????????????? ?????? ???????????? (???? ???????????????????? ????????????)
//?????????? ?????? ????????????, ???????????????????????? ?? ?????????? "??"
//?????????? ???????????????????? ??????????, ?????????????????????? ?? ???????????????? ??????????????, ?????? ?????????????????????? ???? ????????????????
//?????????? ???????????????????? ??????????, ???????????????????? ?? ?????????? ?????????? ???????????????? ??????????????????
//?????????????????????? ???????????????? ???????? ?????????????? LinkedList, ?????????????? ?????????? ?????????????????? ?????? ???? ???? ????????????????, ?????? ?? ?????????????????? ????????????
//?????????????? ?????? ???????????? ?? ???????????? ?? ???????????????? ??????????????. ??.??. ???????? ???????? ???????????? "????????", "??????????", "????????????", ???? ?????? ???????????? ?????????????? "????????", "??????????", "????????????"