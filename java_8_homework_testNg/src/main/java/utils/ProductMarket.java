package utils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProductMarket {
    private String name;
    private String address;
    private List<Product> products;

    public ProductMarket(String name, String address, List<Product> products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductMarket that = (ProductMarket) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, products);
    }

    @Override
    public String toString() {
        return "ProductMarket{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", products=" + products +
                '}';
    }

    public static List<String> getProdNames (List<Product> productList) {
        return productList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getSortedProdNames (List<Product> productList) {
        return productList.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Product> getAllPricesOverTen (List<Product> productList) {
        return productList.stream()
                .filter(Product -> Product.getPrice() > 10)
                .collect(Collectors.toList());
    }

    public static List<Product> getAllPricesBelowZero (List<Product> productList) {
        return productList.stream()
                .filter(Product -> Product.getPrice() < 0)
                .collect(Collectors.toList());
    }

    public static List<String> getAllPricesString (List<Product> productList) {
        return productList.stream()
                .map(Product -> Integer.toString(Product.getPrice()))
                .collect(Collectors.toList());
    }
}
