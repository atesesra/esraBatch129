package day05typecastingstringmanipulations;

public class SwapValues {
    //Swap:Yer degistirmek.1.Kap:Patates 2.Kap:Domates ==>1.Kap:Domates 2.Kap:Patates

    public static void main(String[] args) {

        int a=12;
        int b=5;
        int temp =0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp=a;          //1.Yol
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x=12;
        int y=5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x=x+y;        //2.Yol Interview
        y=x-y;
        x=x-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);



    }//Main Body


}//Class Body
