package kr.co.candhinc.product.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.candhinc.product.service.MainProductService;

@Controller
@RequestMapping("/Product")
public class MainProductCtrl {
	
	/**
	 * Main Service
	 */
	@Resource(name="MainProductService")
	private MainProductService service;
	/**
	 * Sampling Service 
	 */
	@Resource(name="SamplingProductService")
	private MainProductService SamplingService;
	
	/**
	 * redirect Sampling list Page
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String ProductMainForm() {
		System.out.println("Ctrl Product Main");
		return "redirect:/";
	}

}
