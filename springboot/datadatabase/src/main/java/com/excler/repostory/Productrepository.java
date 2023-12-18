package com.excler.repostory;

import org.springframework.data.repository.CrudRepository;

import com.excler.entity.Product;

public interface Productrepository extends CrudRepository<Product, Integer>
{

}
