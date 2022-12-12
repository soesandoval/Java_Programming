package Day17_CustomClassMethods;

public class Dog {

    public String name; //instance variable
    public String breed;
    public String size;
    public int age;
    public String color;
    public char gender;



    public void SetInfo(String name, String breed, char gender, String size, int age, String color){
       this.name = name; // this keyword is used for calling the instance variable name\
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size= size;
        this.color = color;
    }


    public  void eat(){
        System.out.println(name + " is eating.");
    }
    public void drink(){
        System.out.println(name + " is drinking water.");
    }


    public String toString() { // to avoid getting a hashcode
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
