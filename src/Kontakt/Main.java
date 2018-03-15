package Kontakt;

import Kontakt.DaoKontact.DAO;
import Kontakt.DaoKontact.ImplDao.DAoImpl;
import Kontakt.Model.Company;
import Kontakt.Model.Depatment;
import Kontakt.Model.Kontakt;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Kontakt kontakt1 = new Kontakt(1, "firstname", "Secondname", Company.Apple, "gmail", true, Depatment.Factory);
        Kontakt kontakt2 = new Kontakt(1, "firstname", "Secondname", Company.Apple, "gmail", true, Depatment.Factory);
        Kontakt kontakt37 = new Kontakt(1, "firstname", "Secondname", Company.Apple, "gmail", true, Depatment.Factory);
        Kontakt kontakt3 = new Kontakt(3, "igor", "Pavlyk", Company.Intel, "ukrnet", false, Depatment.Support);
        Kontakt kontakt4 = new Kontakt(4, "Vasya", "boychyk", Company.Microsoft, "mail", true, Depatment.Tech);
        Kontakt kontakt5 = new Kontakt(5, "Slavkiv", "sun", Company.Intel, "ukrnet", false, Depatment.Support);
        Kontakt kontakt6 = new Kontakt(6, "Vitalii", "Dmytrotsa", Company.Microsoft, "mail", true, Depatment.Tech);


        DAO dao = new DAoImpl();
        dao.SetKont(kontakt1);
        dao.SetKont(kontakt37);
        dao.SetKont(kontakt2);
        dao.SetKont(kontakt3);
        dao.SetKont(kontakt4);
        dao.SetKont(kontakt5);
        dao.SetKont(kontakt6);

        List<Kontakt> spicok = dao.Spicok();
        System.out.println(spicok);


//        spicok.forEach(kontakt -> {
//            System.out.println(kontakt);
//        });

        //te same|

        Stream<Kontakt> stream = spicok.stream();
        List<Kontakt> collect = stream
                .sorted((Kontakt o1,Kontakt o2) -> o1.getDepatment().compareTo(o2.getDepatment()))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
