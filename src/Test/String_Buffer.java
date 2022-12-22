package Test;
/*Чтобы справиться с созданием временного мусора из-за модификаций объекта String,
 можно использовать класс StringBuffer.

 StringBuffer — изменяемый класс, поэтому при StringBuffer — потокобезопасный класс.
 Его методы синхронизированы, а экземпляры могут быть использованы несколькими потоками
 одновременно.     При работе с ним не возникает такого
  же количества мусора в памяти, как со String.
  потокобезопасность — преимущество класса, а другой — недостаток.Синхронизированные методы
  работают медленнее не сихнронизированных.
  Когда использовать: При работе со строками, которые часто будут модифицироваться в
  многопоточной среде

 */
public class String_Buffer {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer();
//        sb.append(":");
//        sb.append(2);
//        sb.append(false);
//        System.out.println(sb);

        String str1 = "LOLO";
        String str2 = new String("LOLO");

        System.out.println(str1.equals(str2)); // сравнение по объекту!!!!
        System.out.println(str1 == str2);  // сравнение по ссылке!!!




//        String numbers = "0123456789";
//        StringBuffer sb = new StringBuffer(numbers);
//        System.out.println(sb.substring(3)); // substring вернет строку начиная с позиции 3
//        System.out.println(sb.substring(3,8));
//        System.out.println(sb.replace(3,5,"ABCDE"));
//
//        sb = new StringBuffer(numbers);
//        System.out.println(sb.reverse());
//        sb.reverse();
//
//        sb = new StringBuffer(numbers);
//        System.out.println(sb.delete(5,9));
//        System.out.println(sb.deleteCharAt(1));
//        System.out.println(sb.insert(1,"one"));
    }
}
