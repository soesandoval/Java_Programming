package day38_exceptionHandlings;

public class BreakTimeException extends RuntimeException {


    public BreakTimeException(){
        super(" It is break time ");

    }

    public BreakTimeException(String message){
        super(message);
    }

}
