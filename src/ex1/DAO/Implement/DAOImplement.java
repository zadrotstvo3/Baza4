package ex1.DAO.Implement;

import ex1.Baza.Bazadanux;
import ex1.DAO.Dao;
import ex1.Model.User;

import java.util.Iterator;
import java.util.List;

public class DAOImplement implements Dao {
    private Bazadanux baza = new Bazadanux();
    @Override
    public void SetUser(User user) {
        baza.getList().add(user);
    }

    @Override
    public void RemuvUser(int id) {
        Iterator<User> iterator = baza.getList().iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getId() == id)
                iterator.remove();
        }
    }

    @Override
    public User find(int id) {
        User user = null;
        Iterator<User> iterator = baza.getList().iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if(next.getId() == id){
                next = user;
            }
        }
        return user;
    }

    @Override
    public List<User> spisok() {
        return baza.getList();
    }
}
