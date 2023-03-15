import java.util.*;
public class Designer extends Person {
    private String typeOfDesign;

    public Designer(String name, Date birthDate, String typeOfDesign) {
        super(name, birthDate);
        this.typeOfDesign = typeOfDesign;
    }

    public String getSpecialty() {
        return this.typeOfDesign;
    }
}
