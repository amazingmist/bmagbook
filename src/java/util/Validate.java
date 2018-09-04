package util;

public class Validate {

    public static boolean checkName(String name) {
        return name.matches("[\\p{L}\\s]{3,50}");
    }

    public static boolean checkEmailOrPhone(String emailOrPhone) {
        if (!emailOrPhone.matches("\\w+@\\w+[.]\\w{2,5}")) {
            if (!emailOrPhone.matches("\\d{9,12}")) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkPassword(String password) {
        return password.matches("\\w{4,30}");
    }
}
