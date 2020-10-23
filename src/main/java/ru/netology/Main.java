package ru.netology;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager(new ProductRepository());
        manager.add(new Book(1, "Book1", 100, "Bro", 300, 2020));


//      manager.removeById(2);
//      System.out.println("main done"); // for demo only

//      try {
//        System.out.println("before remove");
//        manager.removeById(2);
//        System.out.println("after remove");
//      } catch (ArrayIndexOutOfBoundsException e) {
//        e.printStackTrace();
//        System.out.println("specific catch");
//      } catch (RuntimeException e) {
//        System.out.println("runtime catch");
//      } catch (Exception e) {
//        System.out.println("catch");
//      } finally {
//        System.out.println("finally");
//      }
    try {
        System.out.println("before remove");
        manager.removeById(2);
        System.out.println("after remove");
    } catch (Throwable e) {

    }

    System.out.println("main done"); // for demo only
    }
}
