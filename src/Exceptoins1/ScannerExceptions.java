package Exceptoins1;

/**
 * создаем свое исключение, надо наследовать Exception
 */
public class ScannerExceptions extends Exception{
    public ScannerExceptions(String descriptions) {
        super(descriptions);
    }
}
