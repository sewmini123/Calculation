import java.util.Scanner;
public class CalculateNew {
    int Number;
    int Number1;
    int Number2;

    public void Cal() {
        this.Number = Number;
        this.Number1 = Number1;
        this.Number2 = Number2;
    }


    public int getValue(){
        return Number ;
    }

    public void setValue(int Number){
        this.Number = Number;
    }

    public int getValue1(){
        return Number1 ;
    }

    public void setValue2(int Number1){
        this.Number1 = Number1;
    }
    public int getValue2(){
        return Number2 ;
    }

    public void setValue1(int Number2){
        this.Number2 = Number2;
    }

    public int getCalculate(){
        return Number +Number1+Number2 ;
    }
    public int getCalculate1(){
        return Number -Number1;
    }
    public int getCalculate2(){
        return Number *Number2;
    }
    public int getCalculate3(){
        return Number /Number1;
    }


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Number=");
        int number = sc.nextInt();

        System.out.println("Number=");
        int number1 = sc.nextInt();

        System.out.println("Number=");
        int number2 = sc.nextInt();

        CalculateNew cn = new CalculateNew();
        cn.setValue(number);
        cn.setValue1(number1);
        cn.setValue2(number2);

         int Add = cn.getCalculate();
         int Sub=cn.getCalculate1();
         int Mul=cn.getCalculate2();
         int Div=cn.getCalculate3();

        System.out.println("ADDITION=" + Add);
        System.out.println("SUBSTRACT=" + Sub);
        System.out.println("MULTILPY=" + Mul);
        System.out.println("DIVISION=" + Div);
    }
}
