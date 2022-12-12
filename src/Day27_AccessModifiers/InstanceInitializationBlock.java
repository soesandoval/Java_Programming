package Day27_AccessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

   /* {
        name = "James";
        age = 20;

    } */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj = new InstanceInitializationBlock("Sofia", 20);
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("Lorenso",22);

        System.out.println(obj1.name);
        System.out.println(obj1.age);
    }



}
