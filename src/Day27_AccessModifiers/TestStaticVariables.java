package Day27_AccessModifiers;

public class TestStaticVariables {

    public static void main(String[] args) {

      //  new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("==========================");

        System.out.println(AccessModifiers.publicDate);
        System.out.println(AccessModifiers.protectedData);
        System.out.println(AccessModifiers.defaultDate);

        AccessModifiers.defaultAccess();
        AccessModifiers.access();
// AccessModifier.privateAccess(); not accessible in different package

    }
}
