package Office_Hours.Practice_12_23_2020;

public class Tester extends Employee {

    public final static boolean isCool;

    static{
        isCool = true;
    }

    public Tester(String name, String jobTitle, String ID, char gender, double salary, boolean isFullTime) {
        super(name, jobTitle, ID, gender, salary, isFullTime);
    }


}
