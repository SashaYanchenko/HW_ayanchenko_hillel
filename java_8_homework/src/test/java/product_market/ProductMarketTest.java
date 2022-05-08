package product_market;

import org.junit.jupiter.api.*;
import utils.Product;
import utils.ProductMarket;

import java.util.List;

import static product_market.TestData.*;

public class ProductMarketTest {
    public static ProductMarket productMarket;


    @BeforeAll
    public static void setUp() {
        Product product1 = new Product("milk", 15);
        Product product2 = new Product("beer", 22);
        Product product3 = new Product("water", 8);
        productMarket = new ProductMarket("Market", "Street", List.of(product1, product2, product3));
    }

    @Test
    public void testIsAllNames() {
        List<String> actualResult = productMarket.getProdNames(productMarket.getProducts());
        Assertions.assertEquals(ALL_PRODUCT_NAMES_EXPECTED_RESULT, actualResult,"Failed: Different names");
    }

    @Test
    public void testIsAllSortedNames() {
        List<String> actualResult = productMarket.getSortedProdNames(productMarket.getProducts());
        Assertions.assertEquals(ALL_SORTED_PRODUCT_NAMES_EXPECTED_RESULT, actualResult,"Failed: Names are not sorted");
    }

    @Test
    public void testIsAllPricesOverTen() {
        List<Product> actualResult = productMarket.getAllPricesOverTen(productMarket.getProducts());
        Assertions.assertEquals(ALL_PRODUCT_PRICES_EXPECTED_RESULT, actualResult, "Failed: Different prices");
    }

    @Test
    public void testIsAllPricesBelowZero() {
        List<Product> actualResult = productMarket.getAllPricesBelowZero(productMarket.getProducts());
        Assertions.assertEquals(ALL_PRODUCT_PRICES_BELOW_ZERO, actualResult, "Failed: There are some prices below 0");
    }

    @Test
    public void testIsAllPricesInString() {
        List<String> actualResult = productMarket.getAllPricesString(productMarket.getProducts());
        Assertions.assertEquals(ALL_PRODUCT_PRICES_IN_STRING_EXPECTED_RESULT, actualResult, "Failed: NOT String");
    }
}
