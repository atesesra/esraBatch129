package ssStringManipulation;

public class C06_StringManipulation {
    public static void main(String[] args) {
        //Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazınız

        String str="Java cok guzel";
        Boolean sonuc=str.contains("h");
        System.out.println(sonuc);

        //2.yol
        boolean sonuc2=str.indexOf("h")!=-1;
        System.out.println(sonuc2);













    }
}
