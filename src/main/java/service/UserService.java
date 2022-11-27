package service;

import bean.User;



public interface UserService {
    public User login(String username);

    void zhuce(String uname, String pwd, String email);

    void RemoveCarts(int id);
}
