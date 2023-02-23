package practiceDTNT.practice.practice07;

import static practiceDTNT.practice.practice07.MyExceptions.str;

public class RunnerExceptions {
    public static void main(String[] args) {

      MyExceptions my=new MyExceptions(str);
      try {
          int x = 100, y = 5;
          float ortalama = (float) x / (float) y;

          if (ortalama < 50) {
              throw new IllegalArgumentException("Ortalama cok dusuk");
          }
      }catch (Exception e){
          System.out.println("Sorunun kaynag ne"+ e.getMessage());
          e.printStackTrace();
      }finally{
          System.out.println(str);
      }


    }
}
