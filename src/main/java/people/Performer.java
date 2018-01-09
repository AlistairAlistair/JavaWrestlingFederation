package people;

public class Performer extends Employee {
    public String catchPhrase;
    public Boolean heelStatus;

    public Performer(String name, int age, int employeeNumber, int salary, String catchPhrase, Boolean heelStatus) {
        super(name, age, employeeNumber, salary);
        this.catchPhrase = catchPhrase;
        this.heelStatus = heelStatus;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public Boolean getHeelStatus() {
        return heelStatus;
    }

    public void setHeelStatus(Boolean heelStatus) {
        this.heelStatus = heelStatus;
    }
}
