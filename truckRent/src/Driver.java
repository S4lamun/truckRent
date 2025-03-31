import java.util.ArrayList;

public class Driver {
    private String name;
    private String surname;
    ArrayList <Character> licenses;
    ArrayList <SpecialLicenses> specialLicenses;

    public Driver(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        licenses = new ArrayList<Character>();
        specialLicenses = new ArrayList<SpecialLicenses>();
    }

    public void addLicence(char licence) {

        if (!licenses.contains(licence)) {
            licenses.add(licence);
        }
    }

    public void addSpecialLicense(SpecialLicenses license)
    {
        if (!specialLicenses.contains(license))
        {
            specialLicenses.add(license);
        }
    }
}
