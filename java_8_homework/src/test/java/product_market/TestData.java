package product_market;

import utils.Product;

import java.util.List;

public interface TestData {
    List<String> ALL_PRODUCT_NAMES_EXPECTED_RESULT = List.of("milk", "beer", "water");
    List<String> ALL_SORTED_PRODUCT_NAMES_EXPECTED_RESULT = List.of("beer", "milk", "water");
    List<Product> ALL_PRODUCT_PRICES_EXPECTED_RESULT = List.of(new Product("milk", 15), new Product("beer", 22));
    List<Product> ALL_PRODUCT_PRICES_BELOW_ZERO = List.of();
    List<String> ALL_PRODUCT_PRICES_IN_STRING_EXPECTED_RESULT = List.of("15", "22", "8");
}
