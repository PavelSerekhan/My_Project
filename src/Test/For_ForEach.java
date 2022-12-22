package Test;

//цикл состоит из 3 выражений: инициализация, условие, инкремент
public class For_ForEach {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Value " + i);
//        }
//        int outerVar = 0;
//        for (; outerVar < 10;){
//            outerVar += 2;
//            System.out.println("Value " + outerVar);
//        }
        String[] names = {"John", "Sara", "Jack"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
        for (String name : names){
            System.out.println("Name = " + name);
            
        }
    }
}
