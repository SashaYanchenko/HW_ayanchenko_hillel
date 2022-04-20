import utils.Product;
import utils.ProductMarket;

import java.util.List;

import static utils.ProductMarket.*;

public class RunCode {

    public static void main(String[] args) {
        Product prod1 = new Product("beer", 28);
        Product prod2 = new Product("milk", 22);
        Product prod3 = new Product("butter", 32);
        Product prod4 = new Product(" 1/2 bread", 9);
        Product prod5 = new Product("candies - 1 kg", 83);
        Product prod6 = new Product("water", 18);
        Product prod7 = new Product("oil", 35);
        Product prod8 = new Product("biscuits - 1 kg", 90);
        Product prod9 = new Product("bubble gum", 8);
        Product prod0 = new Product("cheese", 55);

        List<Product> productList = List.of(prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9, prod0);
        ProductMarket ATB = new ProductMarket("ATB", "Peace avenue", productList);

        System.out.println(getProdNames(productList));
        System.out.println("__________");
        System.out.println(getSortedProdNames(productList));
        System.out.println("__________");
        System.out.println(getAllPricesOverTen(productList));
        System.out.println("__________");
        System.out.println(getAllPricesBelowZero(productList));
        System.out.println("__________");
        System.out.println(getAllPricesString(productList));
        System.out.println("__________");
    }
}
