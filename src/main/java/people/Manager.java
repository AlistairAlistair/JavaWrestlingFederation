package people;

import java.util.ArrayList;

public class Manager extends Performer{
    private ArrayList<Wrestler> wrestlers;

    public Manager(String name, int age, int employeeNumber, int salary, String catchPhrase, Boolean heelStatus) {
        super(name, age, employeeNumber, salary, catchPhrase, heelStatus);
        this.wrestlers = new ArrayList<Wrestler>();
    }

    public ArrayList<Wrestler> getWrestlers() {
        return wrestlers;
    }

    public void setWrestlers(ArrayList<Wrestler> wrestlers) {
        this.wrestlers = wrestlers;
    }

    public int numberOfWrestlers() {
        return this.wrestlers.size();
    }

    public boolean stableIsEmpty(){
        return numberOfWrestlers() == 0;
    }


    public void addWrestlerToStable(Wrestler wrestler) {
        this.wrestlers.add(wrestler);
    }
}
