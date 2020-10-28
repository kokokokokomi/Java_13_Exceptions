package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.TShirt;
import ru.netology.exception.NotFoundException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    Product first = new Book(1, "Book1", 100, "Author1", 300, 2020);
    Product second = new TShirt(3, "Tshirt1", 100, "black", "m");

    @BeforeEach
    void setup() {
        repository.save(first);
        repository.save(second);
    }

    @Test
    void shouldRemoveByIdIfExists() {
        int idToRemove = 1;
        repository.removeById(idToRemove);
        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{second};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdIfNotExists() {
        int idToRemove = 10;
        assertThrows(NotFoundException.class, () -> repository.removeById(idToRemove));
    }
}