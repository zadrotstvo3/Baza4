package ex1.DAO.Implement;

import ex1.Baza.Bazadanux;
import ex1.DAO.Dao;
import ex1.Model.User;

import java.util.Iterator;
import java.util.List;

public class DAOImplement2 implements Dao {
    private Bazadanux baza = new Bazadanux();
    @Override
    public void SetUser(User user) {
        if(user != null && user.getId()>0) {
            baza.getList().add(user);
        }else
            System.out.println("Warn!");
    }

    @Override
    public void RemuvUser(int id) {
        if (id>0) {
            Iterator<User> iterator = baza.getList().iterator();
            while (iterator.hasNext()) {
                User next = iterator.next();
                if (next.getId() == id)
                    iterator.remove();
            }
        }else
            System.out.println("Warn delete");
    }

    @Override
    public User find(int id) {
        User user = null;
        if (id > 0) {
            Iterator<User> iterator = baza.getList().iterator();
            while (iterator.hasNext()) {
                User next = iterator.next();
                if (next.getId() == id) {
                    next = user;
                }
            }
        }
            return user;
        }

    @Override
    public List<User> spisok() {
        return baza.getList();
    }
}
