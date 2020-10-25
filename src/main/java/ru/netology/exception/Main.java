package ru.netology.exception;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

public class Main {
    void print(int id) {
        if (id == 0) {
            throw new NotFoundException("Element with id: " + id + " not found");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        ProductManager manager = new ProductManager(new ProductRepository());
        manager.add(new Book(1, "Book1", 100, "Bro", 300, 2020));

      try {
        System.out.println("before remove");
        manager.removeById(2);
        System.out.println("after remove");
      } catch (NotFoundException e) {
        e.printStackTrace(); //вывести информацию о том, что не так
        System.out.println("specific catch");
        System.out.println(e.getMessage());
      } catch (RuntimeException e) {
        System.out.println("runtime catch");
      } catch (Exception e) {
        System.out.println("catch");
      } finally {
        System.out.println("finally");
      }
    //try {
    //    System.out.println("before remove");
    //    manager.removeById(2);
    //    System.out.println("after remove");
    //} catch (Throwable e) {
    //}

    System.out.println("main done"); // for demo only
    }
}
