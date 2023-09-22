package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface User3Repository extends CrudRepository<Users3, Integer>{

}
