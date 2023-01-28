package web.model;

import javax.persistence.*;

@Entity
@Table(name = "users_table")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;

    @Column(name="firstname")
    String firstname;

    @Column(name="lastname")
    String lastname;

    @Column(name="age")
    int age;

    public User() {
    }

    public User(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
