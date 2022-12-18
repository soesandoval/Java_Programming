package day33_abstraction;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String ID, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, ID, jobTitle, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }
}
