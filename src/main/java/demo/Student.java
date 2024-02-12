package demo;

import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
// @Cacheable
// @Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name = "getNames", query = "from Student where id>:x")

public class Student {
    @Id
    private int id;
    private String name;
    private String city;
    private certificate c1;

    public Student(int id, String name, String city, certificate c1) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.c1 = c1;
    }

    public certificate getC1() {
        return c1;
    }

    public void setC1(certificate c1) {
        this.c1 = c1;
    }

    public Student() {
    }

    public Student(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + ", c1=" + c1 + "]";
    }

}
