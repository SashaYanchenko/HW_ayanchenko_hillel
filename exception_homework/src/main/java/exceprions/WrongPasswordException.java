package exceprions;

import java.io.IOException;

public class WrongPasswordException extends IOException {
    private String title;

    public WrongPasswordException(String message, String title) {
        super(message);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
