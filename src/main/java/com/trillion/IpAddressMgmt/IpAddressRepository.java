package com.trillion.IpAddressMgmt;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IpAddressRepository extends CrudRepository<IpAddress, Long> {

	//List<IpAddress> findByLastName(String lastName);

	IpAddress findById(long id);
}
