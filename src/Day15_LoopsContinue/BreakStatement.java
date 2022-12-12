package Day15_LoopsContinue;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }

        System.out.println("================================");

        for (char i = 'A'; i <= 'Z' ; i++) {

            if(i=='J'){
                break;
            }

            System.out.println(i);

        }


        System.out.println("==================================");

        for (;;){
            System.out.println("Hello");
            break;
        }



    }
}
