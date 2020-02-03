package dev.shannonfoster.demo;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String jobTitle;
    private String employer;
    private String description;
    private Calendar startDate;
    private Calendar endDate;
    private String educationLevel;
    private String institute;

    @ManyToMany
    @JoinTable(
            name="resume_person",
            joinColumns = @JoinColumn(name="RESUME_ID",
            referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name="PERSON_ID",
            referencedColumnName = "ID"))
    private Set<Person> personSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }
}
