package Day32_FinalKeyword.PersonTask;

import java.time.LocalDate;

public final class CydeoStudent extends Person {


    private final String ID;
    private  String batchName;
    private  int batchNumber;
    private final static String programmingLanguage;

    public CydeoStudent(String name, char gender, LocalDate dateOfBirth, String ID, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        if(getAge() < 18){
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.ID = ID;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static {
        programmingLanguage ="Java";
    }

    public void setBatchName(String batchName) {

        if(!(batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("Alumni developer"))){
            System.err.println("Invalid batch name: " + batchName);
            System.exit(1);
        }
        this.batchName = batchName;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0 ){
            System.err.println("Invalid batch number"+ batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public String getID() {
        return ID;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }


    public void eat() {
        System.out.println(getName() + " is eating ");
    }

    public void drink() {
        System.out.println(getName() + " is drinking ");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                "ID='" + ID + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}
