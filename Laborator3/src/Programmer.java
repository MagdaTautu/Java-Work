import java.util.*;
public class Programmer extends Person {
    private String p_language;

    public Programmer(String name, Date birthDate, String language) {
        super(name, birthDate);
        this.p_language = language;
    }

    public String getLanguage() {
        return this.p_language;
    }
}
