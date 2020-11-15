package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunMain {
    public static void main(String[] args) {
        String regexUser = "^[a-zA-z0-9]{6,}$";
        String regexPassword = "^\\d{8,}$";
        String strUser = "DoanQuocCuong28032001";
        String strPassword = "28032001";
        Pattern patternUser = Pattern.compile(regexUser);
        Pattern patternPassword = Pattern.compile(regexPassword);

        Matcher matcher;

        matcher = patternUser.matcher(strUser);
        System.out.println("Check user: " +matcher.find());
        matcher = patternPassword.matcher(strPassword);
        System.out.println("Check password: " +matcher.find());
        // cách 2 không cần khai báo pattern
        //System.out.println("Check password: " +patternPassword.matcher(strPassword).find());
    }
}
