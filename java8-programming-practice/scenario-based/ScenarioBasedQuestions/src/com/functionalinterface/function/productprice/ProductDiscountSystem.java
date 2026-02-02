package com.functionalinterface.function.productprice;
/*
 * 3.Convert product price into discounted price.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProductDiscountSystem {
	public static void main(String[] args) {

		List<Products> product = new ArrayList<>();
		product.add(new Products("Laptop", 101, 50000));
		product.add(new Products("Jeans", 102, 2600));

		// Function to convert price to discounted price
		Function<Products, Double> discountFunction = p -> p.price - (p.price * 0.10);

		// Loop through product
		product.forEach(p -> {
			System.out.println("Product Name: " + p.productName);
			System.out.println("Original Price: " + p.price);
			System.out.println("Discounted Price: " + discountFunction.apply(p));
			System.out.println("-------------------------------------------------");
		});
	}

}
