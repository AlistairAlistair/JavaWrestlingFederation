package people;

import java.util.ArrayList;

public class Wrestler extends Employees {
    private String alias;
    private String homeTown;
    private int weightClass;
    private int height;
    private String finishingMove;
    private String catchPhrase;
    private Boolean heelStatus;

    public Wrestler(String name, int age, int employeeNumber, int salary, String alias, String homeTown, int weightClass, int height, String finishingMove, String catchPhrase, Boolean heelStatus) {
        super(name, age, employeeNumber, salary);
        this.alias = alias;
        this.homeTown = homeTown;
        this.weightClass = weightClass;
        this.height = height;
        this.finishingMove = finishingMove;
        this.catchPhrase = catchPhrase;
        this.heelStatus = heelStatus;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getWeightClass() {
        return weightClass;
    }

    public void setWeightClass(int weightClass) {
        this.weightClass = weightClass;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFinishingMove() {
        return finishingMove;
    }

    public void setFinishingMove(String finishingMove) {
        this.finishingMove = finishingMove;
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
