package kr.co.candhinc.product.service;

import java.util.List;

import kr.co.candhinc.product.model.vo.ProductVO;

/**
 * 
 * @author duckheewon
 * 
 * Get List Product 
 * Get Detail product
 * 
 */
public interface MainProductService {
	
	/**
	 * Get Product List
	 * @return
	 */
	public List<ProductVO> list();
	

}
