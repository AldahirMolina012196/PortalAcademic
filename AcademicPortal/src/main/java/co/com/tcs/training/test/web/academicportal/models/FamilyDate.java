package co.com.tcs.training.test.web.academicportal.models;

public class FamilyDate {
    private String identification;
    private String name;
    private String firstLastName;
    private String secondLastName;

    public FamilyDate(String identification, String name, String firstLastName, String secondLastName) {
        this.identification = identification;
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
    }

    public String getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }
}
