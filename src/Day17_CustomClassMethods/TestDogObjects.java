package Day17_CustomClassMethods;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

                dog1.name = "Max";
                dog1.breed = "Husky";
                dog1.gender ='M';
                dog1.age = 4;
                dog1.size ="Large";
                dog1.color ="Grey";

                Dog dog2 = new Dog();
                dog2.name ="Loki";
                dog2.breed = "Golden retriever";
                dog2.gender = 'F';
                dog2.age =2 ;
                dog2.size = "Small";

                Dog dog3 = new Dog();
                dog3.name ="Mali";
                dog3.breed="shepherd mix";
                dog3.gender='F';
                dog3.size="Small";
                dog3.age= 6;
                dog3.color= "white and black";

                Dog dog4 = new Dog();

                dog4.SetInfo("Loki" , "Chow chow", 'F', "large" , 4, "black");

        System.out.println(dog1); // prints out hash code instead of actual data// if you add a string it will not bc data is added

        System.out.println(dog2); // dog name: name

        System.out.println(dog4);


        dog3.drink();
        dog1.eat();





    }
}
