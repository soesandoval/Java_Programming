package week10_review;

public class Data {

    public  int a;

    public static int b;



    public Data(int a){
        this.a=0;

        b=100;

    }



    static {
        b=100;
    }


}
class Test{
    public static void main(String[] args) {
        Data data1 = new Data(20);
        Data data2 = new Data(30);


        System.out.println(data1.a);

        System.out.println(data1.b);


        System.out.println(data2.a);
        System.out.println(data2.b);;


    }



}