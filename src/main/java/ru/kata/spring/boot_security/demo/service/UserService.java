package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> showAll();

    public void save(User user);

    public User showUser(long id);

    public void update(long id, User updatedUser);

    public void delete(long id);

    public User findByUsername(String username);
    public UserDetails loadUserByUsername(String username);
}
