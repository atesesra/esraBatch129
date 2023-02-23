package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps03 {
    /*
    Meshur Regex'ler
1) Tum rakamlar ==> [0-9]
2) Tum kucuk harfler ==> [a-z]
3) Tum buyuk harfler ==> [A-Z]
4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
6) Tum noktalama isaretleri ==> \\p{Punct}
7) Tum sesli harfler ==> [aeiouAEIOU]
   x, q, w harfleri ==> [xqw]

8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]
     */

    public static void main(String[] args) {

        //Example 1: Size verilen bir cumlede kullanilan harflerin gorunum saysisini gosteren kodu yaziniz.
        //           "Java is Java." ==> J=2, a=4, v=2, i=1, s=1
        HashMap<String, Integer> lettersMap = new HashMap<>();

        String sentence = "Java is Java.";

        sentence = sentence.replaceAll("[^a-zA-Z]", "");
        System.out.println(sentence);// JavaisJava

        String[] lettersArray = sentence.split("");
        System.out.println(Arrays.toString(lettersArray));// [J, a, v, a, i, s, J, a, v, a]

        for(String w : lettersArray){

            Integer numOfOccurrence = lettersMap.get(w);

            if(numOfOccurrence==null){

                lettersMap.put(w,1);

            }else{

                lettersMap.replace(w, numOfOccurrence+1);

            }

        }
        System.out.println(lettersMap);
    }
}