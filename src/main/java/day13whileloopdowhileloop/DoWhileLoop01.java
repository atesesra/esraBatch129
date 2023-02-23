package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //1)while-loop
        int i=1;
        while(i<1){
            System.out.println("Sen bir while loopsun...");
            i++;
        }                                                    // Zero Execution mumkundur-while body hic calismadi

        //2)do-while-loop
        int k=1;
        do{
            System.out.println("Sen bir do while loops sun");
           k++;
        }while(k<1);                                        //Zero Execution mumkun degildir.dowhile loop body en az bir kez calisir



    }
}
