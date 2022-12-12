package Day07_IfStatements;

public class NetIncomeCalculator {
    public static void main(String[] args) {

        int salary= 115000;
        double taxRate= 0;
        boolean isMarried= false;

        if(salary>=130000){
            taxRate=0.35;
        }
        if (salary>=100000 && salary<130000){
            taxRate=0.30;
        }
        if(salary>=80000 && salary<100000){
            taxRate=0.25;
        }
        if (salary<80000){
            taxRate= 0.20;
        }
if (isMarried){
    taxRate -= 0.05;
}
double totalTax = salary * taxRate;
double netIncome = salary *(1-taxRate);

        System.out.println("Salary= " + salary);
        System.out.println("Total Tax= "+totalTax );
        System.out.println("Net Income= " + netIncome);


    }
}
