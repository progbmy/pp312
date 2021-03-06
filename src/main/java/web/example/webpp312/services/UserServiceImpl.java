package web.example.webpp312.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.example.webpp312.dao.RoleDAO;
import web.example.webpp312.dao.UserDAO;
import web.example.webpp312.model.Role;
import web.example.webpp312.model.User;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private final RoleDAO roleDAO;
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(RoleDAO roleDAO, UserDAO userDAO) {
        this.roleDAO = roleDAO;
        this.userDAO = userDAO;
    }

    @Override
    public List<User> resUsers() {
        return userDAO.resUsers();
    }

    @Override
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    public User showUser(int id) {
        return userDAO.showUser(id);
    }

    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void update(int id, User updatedUser) {
        userDAO.update(id, updatedUser);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }

    @Override
    public Role getRoleByName(String name) {
        return roleDAO.getRoleByName(name);
    }
}
