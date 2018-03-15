package Kontakt.DaoKontact.ImplDao;

import Kontakt.DaoKontact.DAO;
import Kontakt.Database.Database;
import Kontakt.Model.Kontakt;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DAoImpl implements DAO {
    private Database database = new Database();

    @Override
    public void SetKont(Kontakt kontakt) {
        database.getlist().add(kontakt);
    }

    @Override
    public void RemuvKont(int id) {
        database.getlist().remove(id);
    }

    @Override
    public Kontakt FindKont(int id) {
        Iterator<Kontakt> iterator = database.getlist().iterator();
        Kontakt kontakt = null;
        while (iterator.hasNext()) {
            Kontakt next = iterator.next();
            if (next.getId() == id){
                next = kontakt;
            }
        }
        return kontakt;
    }

    @Override
    public List<Kontakt> Spicok() {
        return database.getlist();
    }
}
