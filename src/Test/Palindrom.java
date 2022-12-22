package Test;
//Палиндро́м-слово одинаково читающееся в обоих направлениях

public class Palindrom {
    public static void main(String[] args) {
        boolean isPalindrome = isPalindrome("Tenet");
        System.out.println(isPalindrome);

    }
    public static boolean isPalindrome(String string){
        string = string.toLowerCase();
        StringBuilder builder = new StringBuilder();
        builder.append(string);
        builder.reverse();
        return (builder.toString()).equals(string);

    }
}
