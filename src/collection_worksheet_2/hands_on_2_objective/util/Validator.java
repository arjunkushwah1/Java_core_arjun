package collection_worksheet_2.hands_on_2_objective.util;

import java.util.regex.Pattern;

public class Validator
{
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        String regex = "^[\\w.-]+@[\\w.-]+\\.\\w+$";
        boolean matches = Pattern.matches(regex, email);

        if (matches) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidId(String id) {
        if (id == null) {
            return false;
        }

        if (id.trim().length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isPositiveInteger(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}
