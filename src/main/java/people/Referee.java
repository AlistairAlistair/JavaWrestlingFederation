package people;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Referee extends Employee {

    public Referee(String name, int age, int employeeNumber, int salary) {
        super(name, age, employeeNumber, salary);
    }

    public String threeCount(){
        return "One, two, three!!";
    }

    public String countOut(){
        return "One, two, three, four, five, six, seven, eight, nine, ten!";
    }



}
