package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.TShirt;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test
    void shouldRemoveByIdIfExists() {
        ProductRepository repository = new ProductRepository();
        Product first = new Book(1, "Book1", 100, "Author1", 300, 2020);
        Product second = new TShirt(3, "Tshirt1", 100, "black", "m");
        int idToRemove = 1;
        repository.save(first);
        repository.save(second);
        repository.removeById(idToRemove);
        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdIfNotExists() {
        ProductRepository repository = new ProductRepository();
        Product first = new Book(1, "Book1", 100, "Author1", 300, 2020);
        Product second = new TShirt(3, "Tshirt1", 100, "black", "m");
        int idToRemove = 2;
        repository.save(first);
        repository.save(second);
        repository.removeById(idToRemove);
        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{first, second};
        assertArrayEquals(expected, actual);
    }
}