package day20passbyvalueoverloading;

public class SuleymanHocaPassByValue02 {
    public static void main(String[] args) {
        String name="Tom Hanks";
        String updatedName=updateName(name,"Jr");
        System.out.println(name);
        System.out.println(updatedName);
        name=updateName(name,"Jr");
        System.out.println(name);

    }

    private static String updateName(String name, String add) {
        name=name+" "+add;
        return name;
    }

}
