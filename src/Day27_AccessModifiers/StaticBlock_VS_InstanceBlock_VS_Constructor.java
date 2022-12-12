package Day27_AccessModifiers;

public class StaticBlock_VS_InstanceBlock_VS_Constructor {

    public StaticBlock_VS_InstanceBlock_VS_Constructor(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block"); // depends on the object
    }

    static {
        System.out.println("Static Block"); // does not depend on an object
    }


    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock_VS_InstanceBlock_VS_Constructor();
        new StaticBlock_VS_InstanceBlock_VS_Constructor();




    }
}
