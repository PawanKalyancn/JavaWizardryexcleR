package com.excler.repostory;

import org.springframework.data.repository.CrudRepository;

import com.excler.entity.Customer;

public interface Customerrepository extends CrudRepository<Customer, Integer>
{

}
