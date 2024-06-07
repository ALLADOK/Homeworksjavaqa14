package ru.netology.repo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.opp.Product;
import ru.netology.opp.ShopRepository;

public class ShopRepositoryTest {


    @Test
    public void test() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Хлеб", 10);
        Product product2 = new Product(2, "Молоко", 20);
        Product product3 = new Product(3, "Масло", 30);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);


        Product[] actual = repo.findAll();
        Product[] expected = {product1, product2, product3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        ShopRepository repo = new ShopRepository();
        Product product1 = new Product(1, "Хлеб", 10);
        Product product2 = new Product(2, "Молоко", 20);
        Product product3 = new Product(3, "Масло", 30);

        repo.add(product1);
        repo.add(product2);
        repo.add(product3);


        Assertions.assertThrows(Exception.class, () -> {
            repo.remove(200);

        });
    }
}
