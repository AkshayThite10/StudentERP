package com.example.fullint.bean;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer student_id;
    @Column(nullable = false)
    private String branch; //IMTech CSE,MTech CSE,IMTech ECE,MTech ECE,MS,PHD
    @Column(nullable = false)
    private String photo;
    @Column(nullable = false)
    private String roll_no;
    @Column(nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student()
    {
    }

    public Student(String branch, String photo, String roll_no, String name) {
        this.branch = branch;
        this.photo = photo;
        this.roll_no = roll_no;
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }
}
