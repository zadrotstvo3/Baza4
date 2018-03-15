package ex1.DAO;

import ex1.Baza.Bazadanux;
import ex1.Model.User;

import java.util.Iterator;
import java.util.List;

public interface Dao {
    void SetUser(User user);
    void RemuvUser(int id);
    User find(int id);
    List<User> spisok();
}
