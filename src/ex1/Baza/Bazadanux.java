package ex1.Baza;

import ex1.Model.User;

import java.util.ArrayList;
import java.util.List;

public class Bazadanux {
    private List<User> users = new ArrayList<>();

    public List<User> getList() {
        return users;
    }

    @Override
    public String toString() {
        return "Bazadanux{" +
                "users=" + users +
                '}';
    }
}
