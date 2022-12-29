package day37_exceptions;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
     setSize(size);
     setNumberOfPepperoniTopping(numberOfPepperoniTopping);
     setNumberOfCheeseTopping(numberOfCheeseTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public double calcCost() {
        double totalPrice = 0;

        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.err.println("Invalid size: " + size);


                return totalPrice;
        } // USED TO CALCULATE PRICE AND RETURN AS DOUBLE

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pizza)){ // if the specified object is not pizza
            System.err.println("Invalid object");
            System.exit(1);

        }

        if(size == ((Pizza) obj).size){
            if(numberOfPepperoniTopping == ((Pizza)obj).getNumberOfPepperoniTopping()){
                return  true;

            }
        }
        return false;
    }






}
