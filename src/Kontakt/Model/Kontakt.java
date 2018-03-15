package Kontakt.Model;

import java.util.Objects;

public class Kontakt {
    private int id;
    private String name;
    private String surname;
    private Company company;
    private String email;
    private boolean phone;
    private Depatment depatment;

    public Kontakt(int id, String name, String surname, Company company, String email, boolean phone, Depatment depatment) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.depatment = depatment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPhone() {
        return phone;
    }

    public void setPhone(boolean phone) {
        this.phone = phone;
    }

    public Depatment getDepatment() {
        return depatment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kontakt)) return false;
        Kontakt kontakt = (Kontakt) o;
        return getId() == kontakt.getId() &&
                isPhone() == kontakt.isPhone() &&
                Objects.equals(getName(), kontakt.getName()) &&
                Objects.equals(getSurname(), kontakt.getSurname()) &&
                getCompany() == kontakt.getCompany() &&
                Objects.equals(getEmail(), kontakt.getEmail()) &&
                getDepatment() == kontakt.getDepatment();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getSurname(), getCompany(), getEmail(), isPhone(), getDepatment());
    }

    public void setDepatment(Depatment depatment) {

        this.depatment = depatment;
    }

    @Override
    public String toString() {
        return "Kontakt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company=" + company +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", depatment=" + depatment +
                '}';
    }
}
