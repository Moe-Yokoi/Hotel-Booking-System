package com.sample.dao;


import java.util.List;


import org.springframework.data.repository.CrudRepository;


import com.sample.entity.CustomerInfo;

public interface CustomerInfoRepository extends CrudRepository<CustomerInfo, Long>{
	
	@Override
	public List<CustomerInfo> findAll();

	public CustomerInfo getOne(long bookingNumber);

	

	
	
	
	
	

}
