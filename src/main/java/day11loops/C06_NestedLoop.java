package day11loops;

public class C06_NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <4 ; i++) {
            System.out.println("Week:  "+i);
            for (int j = 0; j <5 ; j++) {
                System.out.println("Day:  "+j);
                if (j==3){
                    System.out.println("...");
                }

            }

        }





    }
}
