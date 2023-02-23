package day16multidimensionalarrays;

public class C04_MultidimensionalArrays {
    public static void main(String[] args) {

        // Bir multidimensional arraydeki en buyuk ve en kucuk elemanin tplamini veren kodu yaziniz.

        int arr[][]={{2,5,1},{83,75}};

        int maxElements= arr[0][0] ;// 2
        int minElements= arr[0][0] ;// 2

        for (int[] w : arr) {
            for (int k: w){
                maxElements=Math.max(maxElements,k);
                minElements=Math.min(minElements,k);
            }
        }
        System.out.println("maxElements = " + maxElements);
        System.out.println("minElements = " + minElements);
        System.out.println("Toplam = " + (minElements+maxElements));







    }
}
