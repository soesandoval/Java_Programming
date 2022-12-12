package Day08_Ternaries_And_Switch;

public class Elevator {
    public static void main(String[] args){

        int floorNumber=  2;

        String result ="Invalid floor";

        if(floorNumber>=1 && floorNumber<=3){
            result="Floor " + floorNumber + " is selected. Companies: ";

                    if(floorNumber==1){
                        result+= "Lobby, Verizon, Starbucks";
                    }
                    if(floorNumber==2) {
                        result += "Cydeo, NASA, Intelsat ";
                    }
                    if(floorNumber==3){
                        result+="Lyft, BofA, Stake house";
                    }
        }
        System.out.println(result);


    }
}
