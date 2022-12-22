package Test;

public class StackTrace {
//    public static void main(String[] args) {
//        test();
//    }
//    public static void test(){
//        Thread current = Thread.currentThread();
//        StackTraceElement[] methods = current.getStackTrace();
//
//        for (var info : methods){
//            System.out.println(info.getClassName());
//            System.out.println(info.getMethodName());
//            System.out.println(info.getFileName());
//            System.out.println(info.getLineNumber());
//
//            System.out.println(info.getModuleName());
//            System.out.println(info.getModuleVersion());
//            System.out.println();
//        }
//    }

    public static final String OUTPUT_FORMAT =
            "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //напишите тут ваш код
        for (StackTraceElement info : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, info.getMethodName(),
                    info.getLineNumber(), info.getClassName(),
                    info.getFileName());
        }

    }
    static void makeScrewdriver() {
        addJuice();
    }
    static void addJuice() {
        addVodka();
    }
    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
