package practiceDTNT.practice.practice07;

public class MyExceptions extends Exceptions{
    static final String str="Sen Degerlisin";

    public MyExceptions(String str){
        super(str);
        System.out.println("Oyun oynadi");
    }

    public MyExceptions() {
        super(str);
    }
}
