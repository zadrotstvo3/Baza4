package ex1;

import ex1.DAO.Dao;
import ex1.DAO.Factory.DAOFactory;
import ex1.DAO.Implement.DAOImplement;
import ex1.DAO.Implement.DAOImplement2;
import ex1.Model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DAOFactory hard = new DAOFactory("Simple");
        Dao dao = hard.getDao();
        dao.SetUser(new User(1,"Vasya"));
        dao.SetUser(new User(-2,"igor"));
        dao.SetUser(new User(3,"ig"));
        dao.SetUser(new User(4,"spirt"));

//        System.out.println(dao.spisok());
        List<User> spisok = dao.spisok();
        spisok.forEach(user ->{
            System.out.println(user);
        } );
    }
}
