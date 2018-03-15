package Kontakt.DaoKontact;

import Kontakt.Database.Database;
import Kontakt.Model.Kontakt;

import java.util.List;

public interface DAO {
    void SetKont(Kontakt kontakt);
    void RemuvKont(int id);
    Kontakt FindKont(int id);
    List<Kontakt> Spicok();
}
