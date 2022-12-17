package Day30_Inheritance.TypesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class President extends Person{

    private LocalDate electedDate;

    public President(String name, int age, char gender, LocalDate electedDate) {
        super(name, age, gender );
        this.electedDate = electedDate;
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }


    public void lie(){
        System.out.println(getName() +  " is lying to the public ");
    }


}
