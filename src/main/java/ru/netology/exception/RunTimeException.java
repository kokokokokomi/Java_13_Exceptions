package ru.netology.exception;
import ru.netology.domain.Product;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

public class RunTimeException {
    private String message;
    private Throwable cause;
    //boolean writableStackTrace;
    public RunTimeException() { }

    public RunTimeException(String message, Throwable cause) {
        this.message = message;
        this.cause = cause;
        //this.writableStackTrace = writableStackTrace;
    }
}
