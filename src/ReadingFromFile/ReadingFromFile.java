package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        String separator = File.separator;
        // для того чтобы не писать E:\\text\\
        // слеш на разных операционных в разные стороны, и чтобы эта прога работала на всех
        // операционках и  пишется separator
//        String path = separator + "e" + separator + "Test";

//        File file = new File("E://Test.txt");
//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//        scanner.close();//для освобождения ресурсов, и чтобы поток не оставался открытым!

//        File file = new File("E:Test2.txt");
//        Scanner scanner = new Scanner(file);
//        String line = scanner.nextLine();
//        String[] words = line.split(" "); //split разделяет строку на пробелах
//        System.out.println(Arrays.toString(words));

        File file = new File("E:Test3.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" "); //split разделяет строку на пробелах
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbersString));
    }

}
