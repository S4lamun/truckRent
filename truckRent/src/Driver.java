import java.util.ArrayList;

public class Driver {
    private String name;
    private String surname;
    ArrayList <Licenses> licenses; // like categories - A, B, C, C+E etc
    ArrayList <SpecialLicenses> specialLicenses; // like ADR etc

    public Driver(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
        licenses = new ArrayList<Licenses>();
        specialLicenses = new ArrayList<SpecialLicenses>();
    }

    public void addLicence(Licenses licence) {

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
