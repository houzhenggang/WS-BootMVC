package siva.bootmvc.model;

import java.util.List;

import lombok.Data;

@Data
public class Product {

	private Integer productId;
	private String productName;
	private Double productCost;
	private String productModel;
	private String productDescription;
	private String productColor;
	// checkbox
	private List<String> productGrade;
	// multi-select dropdown
	private List<String> productBrand;
}
