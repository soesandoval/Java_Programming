package day36_polymorpishm;

public class Square {

    private double side;

    public Square(double side){
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public boolean equals(Object obj){

        if(!(obj instanceof Square)){
            System.err.println("Invalid object, it must be square");
            System.exit(1);
        }

        if(side == ((Square) obj).side){
            return true;
        }

        return false;

    }

}
