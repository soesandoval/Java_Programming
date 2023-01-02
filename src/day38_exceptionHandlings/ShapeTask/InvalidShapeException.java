package day38_exceptionHandlings.ShapeTask;

public class InvalidShapeException  extends RuntimeException{


    public InvalidShapeException(String message){
        super(message);
    }

}
