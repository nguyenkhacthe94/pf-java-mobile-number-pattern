import java.util.regex.*;

public class MobileExample {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)]-[(]0[0-9]{9}[)]$";

    public MobileExample() {pattern = Pattern.compile(PHONE_NUMBER_REGEX);}

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
