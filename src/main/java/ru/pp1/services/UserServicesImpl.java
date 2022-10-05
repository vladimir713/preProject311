package ru.pp1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pp1.model.User;
import ru.pp1.repository.UserRepository;

import java.util.List;

@Service
public class UserServicesImpl implements UserService {

    private final UserRepository ur;

    @Autowired
    public UserServicesImpl(UserRepository ur) {
        this.ur = ur;
    }

    @Override
    public List<User> index() {
        return (List<User>) ur.findAll();
    }

    @Override
    public void save(User user) {
        ur.save(user);
    }

    @Override
    public void delete(int id) {
        ur.deleteById(id);
    }

    @Override
    public User show(int id) {
        return ur.findById(id).orElse(null);
    }

}
