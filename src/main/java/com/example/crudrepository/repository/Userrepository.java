package com.example.crudrepository.repository;

import com.example.crudrepository.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface Userrepository extends CrudRepository<User, Integer> {
}
