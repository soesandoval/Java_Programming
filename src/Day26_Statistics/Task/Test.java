package Day26_Statistics.Task;

public class Test {

       public static void main(String[] args) {


              Student student1 = new Student("Yusuf", 21, 'M', "A15");
              Student student2 = new Student("Glenio", 24, 'M', "B35");
              Student student3 = new Student("Sumeyee", 22, 'F', "D45");
              Student student4 = new Student("Mehmet", 25, 'M', "E25");
              Student student5 = new Student("Sebastian", 23, 'M', "E55");

              StudentsGroup group1 = new StudentsGroup(" Java turtles", 1);

              Student [] students = {student2, student3, student4, student5};


              group1.addStudent(student1);
              group1.addStudent(student2);
              group1.addStudent(student3);
              group1.addStudent(student4);
              group1.addStudent(student5);
              group1.addStudent(students);

              group1.addStudent("Sofia", 20, 'F',"A345");


              System.out.println(group1);

              group1.removeStudent("A345");

              System.out.println(group1);


              for (Student  each : group1.students) {
                     System.out.println(each.name + " : " + each.ID);
              }

              System.out.println("----------------------------------------------");


              StudentsGroup group2 = new StudentsGroup("Java Cats" , 2);

              Student student6 = new Student("Lorenso", 28, 'M', "A155");
              Student student7 = new Student("Karen", 54, 'F', "B355");
              Student student8 = new Student("Summer", 23, 'F', "D455");
              Student student9 = new Student("Muhammed", 27, 'M', "E255");
              Student student10 = new Student("Roberto", 34, 'M', "E555");

              group2.addStudent(new Student[]{student6, student7,student8,student9,student10});


              StudentsGroup group3 = new StudentsGroup("Java Magic" , 3);


              Student student11 = new Student("Quince", 58, 'M', "A2255");
              Student student12= new Student("Hailey", 34, 'F', "B3355");
              Student student13= new Student("Luka", 33, 'F', "D4455");
              Student student14= new Student("Liam", 17, 'M', "E2255");
              Student student15 = new Student("Ahmed", 24, 'M', "E5555");

              group3.addStudent(new Student[]{student11, student12,student13,student14,student15});

              StudentsGroup group4 = new StudentsGroup("Java Tigers" , 4);

              Student student16 = new Student("Martha", 58, 'F', "A345");
              Student student17= new Student("Naimaa", 43, 'F', "D7456");
              Student student18= new Student("Katy", 44, 'F', "B55678");
              Student student19= new Student("Mathew", 27, 'M', "E9726");
              Student student20 = new Student("Bryan", 24, 'M', "E274653");

              group4.addStudent(new Student[]{student16, student17,student18,student19,student20});


              StudentsGroup[] groups = { group1,group2, group3,group4};

              for (StudentsGroup each : groups) {
                     System.out.println("Group name: " + each.groupName + each.students );

                     for (Student student : each.students) {
                            System.out.println("Student: " + student.name);
                     }
              }






       }
}
