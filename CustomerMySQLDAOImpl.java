package in.abc.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.abc.bo.CustomerBO;

public class CustomerMySQLDAOImpl implements ICustomerDAO {

	private DataSource dataSource;
	
	static {
		System.out.println("CustomerMySQLDAOImpl.class file is loading...");
	}

	public CustomerMySQLDAOImpl(DataSource dataSource) {
		System.out.println("CustomerMySQLDAOImpl :: 1 param constructor...");
		this.dataSource = dataSource;
	}

	@Override
	public int insert(CustomerBO bo) {

		try (Connection connection = dataSource.getConnection()) {
			System.out.println("connection established succesfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return 0;
	}

}
