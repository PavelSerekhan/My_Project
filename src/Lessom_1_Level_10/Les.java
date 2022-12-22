package Lessom_1_Level_10;

public class Les {


    public static void main(String[] args) throws ClassNotFoundException {
//        Class s = int.class;
//        Class s = Class.forName("java.lang.String");
//        String name = s.getName();
//        System.out.println(name);

        int a = 5;
        int b = 4;
//        System.out.println(a == b);
        String str = "Egor";
        String str1 = new String("Egor");
        System.out.println(str == str1);

        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

    }
}
