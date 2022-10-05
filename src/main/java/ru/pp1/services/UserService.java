package ru.pp1.services;

import ru.pp1.model.User;
import java.util.List;

public interface UserService {

    public List<User> index();

    public void save(User user);

    public void delete(int id);

    public User show(int id);

//    public void update(int id, User user);
}
