package ExCePtIon_Exc;

public class Exception_Exception {
    // пример перехвата и обработки исключения в блоке try — catch метода
    public static void main(String[] args) {
        try {
            throw new Exception();
        }catch (Exception e){
            System.out.println("Упс, что-то пошло не так =(");
        }
    }

    // пример перехвата и обработки исключения с использованием собственных исключений

//    public class CustomException extends Exception{
//       public CustomException(final String message) {
//           super(message);
//       }
//       try {
//           throw new CustomException("Упс, что-то пошло не так =(");
//           }catch (CustomException e){
//           System.out.println(e.getMessage());
//       }
//   }
}
