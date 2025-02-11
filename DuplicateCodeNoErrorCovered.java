package duplicate;

public class DuplicateCodeNoErrorCovered {

    public String doIt(String first, String second) {

        var result = new StringBuilder();

        for (var i = 0; i < first.length(); i++) {
            result.append(first.charAt(i));
        }

        result.append(" ");

        for (var i = 0; i < second.length(); i++) {
            result.append(second.charAt(i));
        }

        for (var i = 0; i < first.length(); i++) {
            result.append(first.charAt(i));
        }

        result.append(" ");

        for (var i = 0; i < second.length(); i++) {
            result.append(second.charAt(i));
        }

        return result.toString();
    }
}
