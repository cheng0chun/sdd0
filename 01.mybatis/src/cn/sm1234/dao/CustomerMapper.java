package cn.sm1234.dao;

import cn.sm1234.domain.Customer;

public interface CustomerMapper {

	/**
	 * 添加客户
	 */
	public void saveCustomer(Customer customer);
}
