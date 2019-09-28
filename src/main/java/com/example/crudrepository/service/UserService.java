package com.example.crudrepository.service;

import com.example.crudrepository.bean.User;
import com.example.crudrepository.repository.Userrepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private Userrepository userrepository;

    @Transactional
    public User save(User user) {
        return userrepository.save(user);
    }

    @Transactional
    public void delete(int id) {
        userrepository.deleteById(id);
    }

    public Iterable<User> getall() {
        return userrepository.findAll();
    }

    public User getById(int id) {
        Optional<User> op = userrepository.findById(id);
        return op.get();
    }

    @Transactional
    public void update(User user) {
        user.setUsername("孙悟空");
        user.setLoginName("swk");
    }
}
