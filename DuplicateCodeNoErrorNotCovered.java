package duplicate;

public class DuplicateCodeNoErrorNotCovered {

    public int doIt(Integer[] first, Integer[] second) {

        var result = 0;

        for (Integer integer : first) {
            result += integer;
        }

        for (Integer integer : second) {
            result += integer;
        }

        for (Integer integer : first) {
            result += integer;
        }

        for (Integer integer : second) {
            result += integer;
        }

        return result;
    }
}