package Day32_FinalKeyword.PersonTask;

import java.time.LocalDate;

public class TestCydeoStudent {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Daniel", 'M', LocalDate.of(1989, 11, 1), "A1", "Alumni Developer", 2);

        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.breathe();

    }
}
