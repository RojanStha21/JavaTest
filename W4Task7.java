package S3Workshop_4;

import java.util.regex.Pattern;

public class W4Task7 {

    public boolean sendEmail(String email) {
        if (!isValidEmail(email)) return false;
        return true;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }
}

