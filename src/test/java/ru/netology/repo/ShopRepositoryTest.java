package ru.netology.repo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.opp.NotFoundException;
import ru.netology.opp.Product;
import ru.netology.opp.ShopRepository;

public class ShopRepositoryTest {
    Product product1 = new Product(1, "Хлеб", 10);
    Product product2 = new Product(2, "Молоко", 20);
    Product product31 = new Product(3, "Масло", 30);


    @Test
    public void test() {
        ShopRepository repo = new ShopRepository();

        Assertions.assertThrows(Exception.class, () -> {
            repo.removeById(-100);
        });
    }

    @Test
    public void test1() {
        ShopRepository repo = new ShopRepository();

        Assertions.assertThrows(RuntimeException.class, () -> {
            repo.findById(3);

        });
    }
}
