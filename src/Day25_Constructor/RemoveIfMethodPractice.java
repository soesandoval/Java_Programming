package Day25_Constructor;

import Day17_CustomClassMethods.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].SetInfo("Max", "Husky", 'M',  "Medium", 4,"Gray");
        dogs[1].SetInfo("Chloe", "Golden Retriever", 'F' , "Large", 8,"Gold");
        dogs[2].SetInfo("Molly", "Beagle", 'F', "Small", 5,"White");
        dogs[3].SetInfo("Oliver", "Bulldog", 'M',  "Small", 2,"Black");
        dogs[4].SetInfo("Bella", "Bichon Frise", 'F', "Small", 3,"White");
        dogs[5].SetInfo("Loki", "Chow Chow", 'M',  "Medium", 7,"Gold");


        ArrayList<Dog>  smallDogs = new ArrayList<>();

        for (Dog dog : dogs)    {
            if(dog.size.equalsIgnoreCase("small")){
                smallDogs.add(dog);
            }
        }

        System.out.println(smallDogs);


        System.out.println("=================OR===========WITHOUT LOOP==============");

        ArrayList<Dog>  smallDogs1 = new ArrayList<>(Arrays.asList(dogs));


        smallDogs1.removeIf(p -> !p.size.equalsIgnoreCase("small"));

        System.out.println(smallDogs1);

        System.out.println("============================================");

        ArrayList<Dog> youngDogs =  new ArrayList<>();


        for (Dog dog : dogs) {
            if (dog.age <= 4){
                youngDogs.add(dog);
            }
        }

        System.out.println(youngDogs);

        System.out.println("===============OR========WITHOUT LOOP==========");

        ArrayList<Dog> youngDogs1 =  new ArrayList<>(Arrays.asList(dogs));

        youngDogs1.removeIf(p-> p.age > 4);

        System.out.println(youngDogs1);

        System.out.println("=================================================");

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));

        femaleDogs.removeIf(p-> p.gender == 'M');

        System.out.println(femaleDogs);

        System.out.println("===============================================");

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));

        maleDogs.removeIf(p-> p.gender == 'F');

        System.out.println(maleDogs);

        System.out.println("==========================================");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs2[0].SetInfo("Max", "Husky", 'M',  "Medium", 4,"Gray");
        dogs2[1].SetInfo("Chloe", "Golden Retriever", 'F' , "Large", 8,"Gold");
        dogs2[2].SetInfo("Molly", "Beagle", 'F', "Small", 5,"White");
        dogs2[3].SetInfo("Oliver", "Bulldog", 'M',  "Small", 2,"Black");
        dogs2[4].SetInfo("Bella", "Bichon Frise", 'F', "Small", 3,"White");
        dogs2[5].SetInfo("Loki", "Chow Chow", 'M',  "Medium", 7,"Gold");


        ArrayList<Dog> List = new ArrayList<>(Arrays.asList(dogs2));

        List.removeIf(p-> p.size.equalsIgnoreCase("small"));

        dogs2 = List.toArray(new Dog[List.size()]);

        System.out.println(Arrays.toString(dogs2));



    }
}


