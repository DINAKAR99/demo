package demo.XMLmapping;

public class Person {
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", city=" + city + ", phone=" + phone + "]";
    }

    public Person() {
    }

    public Person(String name, String city, String phone) {

        this.name = name;
        this.city = city;
        this.phone = phone;
    }

    private int id;
    private String name;
    private String city;
    private String phone;

    public static void main(String[] args) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
