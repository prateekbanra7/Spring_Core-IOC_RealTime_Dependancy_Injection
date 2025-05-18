package in.abc.controller;

import in.abc.dto.CustomerDTO;
import in.abc.service.ICustomerMgmtService;
import in.abc.vo.CustomerVo;

public class CustomerController {

	ICustomerMgmtService service;
	
	static {
		System.out.println("Controller.class file is loading...");
	}

	public CustomerController(ICustomerMgmtService service) {
		System.out.println("MainController:: one param constructor...");
		this.service = service;
	}
	
	public String processResult(CustomerVo vo) {
		CustomerDTO dto = new CustomerDTO();
		service.calculateSimpleInterest(dto);
		return "";
	}
}
