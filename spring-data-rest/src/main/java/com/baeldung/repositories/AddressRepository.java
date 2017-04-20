package com.nklkarthi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nklkarthi.models.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {

}
