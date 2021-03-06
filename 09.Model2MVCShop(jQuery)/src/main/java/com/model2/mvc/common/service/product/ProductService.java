package com.model2.mvc.common.service.product;

import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;

public interface ProductService {
	
	//??ǰ?߰?
	public void addProduct(Product product) throws Exception;
	
	public Product getProduct(int prodNo) throws Exception;
	
	public Map<String, Object>	getProductList(Search search) throws Exception;
	
	public void updateProduct(Product product) throws Exception;

}
