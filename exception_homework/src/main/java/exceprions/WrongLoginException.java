package exceprions;

import java.io.IOException;

public class WrongLoginException extends IOException {
    private String title;

    public WrongLoginException(String message, String title) {
        super(message);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
