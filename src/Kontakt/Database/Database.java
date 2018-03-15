package Kontakt.Database;

import Kontakt.Model.Kontakt;

import java.util.LinkedList;
import java.util.List;

public class Database {
    private List<Kontakt> Kontakts = new LinkedList<>();

    public List<Kontakt> getlist() {
        return Kontakts;
    }
}
