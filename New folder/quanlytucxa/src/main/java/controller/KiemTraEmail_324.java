
package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class KiemTraEmail_324{
    Pattern pattern;
    Matcher matcher;
private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";// cấu trúc 1 email thông thường
 
    public KiemTraEmail_324() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
 
    // Class kiểm định dạng email
    public boolean validate(final String hex) {
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
 
    // main và test
    public static void main(String[] args) {
        KiemTraEmail_324 validator = new KiemTraEmail_324();
    }
}  
