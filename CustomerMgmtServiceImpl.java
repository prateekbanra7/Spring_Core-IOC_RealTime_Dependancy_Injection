package in.abc.service;

import in.abc.bo.CustomerBO;
import in.abc.dao.ICustomerDAO;
import in.abc.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;
	
	static {
		System.out.println("CustomerMgmtServiceImpl.class file is loading...");
	}

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl :: one param constructor...");
		this.dao = dao;
	}

	@Override
	public String calculateSimpleInterest(CustomerDTO dto) {
		dao.insert(new CustomerBO());
		return null;
	}

}
