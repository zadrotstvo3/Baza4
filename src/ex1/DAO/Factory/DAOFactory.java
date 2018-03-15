package ex1.DAO.Factory;

import ex1.DAO.Dao;
import ex1.DAO.Implement.DAOImplement;
import ex1.DAO.Implement.DAOImplement2;

public class DAOFactory {
    private Dao dao;

    public DAOFactory(String choise) {
        if (choise.equals("Simple")) {
            this.dao = new DAOImplement();
        }else if (choise.equals("Hard")){
            this.dao = new DAOImplement2();
        }
    }

    public Dao getDao() {
        return dao;
    }
}
