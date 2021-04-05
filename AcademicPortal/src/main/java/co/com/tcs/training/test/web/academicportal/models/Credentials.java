package co.com.tcs.training.test.web.academicportal.models;

public class Credentials {
    private String user;
    private String pass;


    public Credentials(String user, String pass, String codPlan) {
        this.user = user;
        this.pass = pass;

    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }


}
