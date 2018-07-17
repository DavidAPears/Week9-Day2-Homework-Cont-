package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="engineers")
public class Engineer extends Employee {


    private String skill;

    public Engineer() { }

    public Engineer(String firstName, String lastName, int salary, Department department, String skill) {
        super(firstName, lastName, salary, department);
        this.skill = skill;
    }

    @Column(name="skill")
    public String getSkill() { return skill; }

    public void setSkill(String skill) { this.skill = skill; }
}
