package kr.co.candhinc.product.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Product")
public class MainCtrl {
	
	//@Resource(name="productService")
	//private ProductService service;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String ProductMainForm() {
		System.out.println("Ctrl Product Main");
		return "product/index";
	}

}
