package Book.LoggerLessons;

import java.io.IOException;
import java.util.logging.*;

public class LoggerLesson {
    /**
     * Logger как println але более разумны!
     *
     * @param args
     * @throws IOException
     */
//    private static final Logger logger = Logger.getGlobal();

// для создания или извлечения регистратора
//    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        //элементарное протоколирование
//        Logger.getGlobal().info("File ->Open menu item selected");

//        logger.setLevel(Level.FINER);
//        logger.finer("message");
//      ||
//        logger.log(Level.FINER, "message");


//        logger.log(Level.FINER,"finer");
//        logger.log(Level.INFO,"info");
//        logger.log(Level.WARNING,"warning");

        //обработчики протоколов
//        Handler consoleHandler1 = new ConsoleHandler();  // вывод на консоль
//        Handler fileHandler = new FileHandler();  // вывод в файл

//        Logger logger = Logger.getLogger("com.mycompany.myprog");
//        logger.setLevel(Level.INFO);
//        logger.setUseParentHandlers(false);
//        var handler = new ConsoleHandler();

//        var handler = new FileHandler("%h/MyJavaLog.log");
//
//        handler.setFilter(new MyFilter());
//        handler.setFormatter(new MyFormatter());
//        logger.addHandler(handler);
//
//        logger.info("info");
//        logger.info("info Pavel");



    }

//    static class MyFilter implements Filter {  // для того чтобы фильтровать по названию например
//        @Override
//        public boolean isLoggable(LogRecord record) {
//            return record.getMessage().endsWith("Pavel");
//        }
//    }
//
//    static class MyFormatter extends Formatter {
//        @Override
//        public String format(LogRecord record) {
//            return record.getLevel() + ": " + record.getMessage();
//        }
//    }
}

//        Handler consoleHandler = new FileHandler("%h/MyJavaLog.log");

//        fileHandler.setFilter(new MyFilter());
//        consoleHandler.setFilter(new MyFilter());
//        consoleHandler.setFormatter(new MyFormatter());

//        logger.setUseParentHandlers(false); // чтобы не дублировал в консоль!
//
//        logger.addHandler(consoleHandler);
//        logger.addHandler(fileHandler);

//        logger.info("info");
//        logger.info("info Pavel");




