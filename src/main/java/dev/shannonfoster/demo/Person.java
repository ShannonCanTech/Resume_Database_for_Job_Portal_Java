package dev.shannonfoster.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;

    @ManyToMany(mappedBy = "user")
    private Set<Resume> resumeSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Resume> getResumeSet() {
        return resumeSet;
    }

    public void setResumeSet(Set<Resume> resumeSet) {
        this.resumeSet = resumeSet;
    }

}
