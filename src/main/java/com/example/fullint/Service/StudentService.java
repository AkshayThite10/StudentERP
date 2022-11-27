package com.example.fullint.Service;

import com.example.fullint.DAO.Implementation.StudentDAOImpl;
import com.example.fullint.bean.Student;

public class StudentService {
    StudentDAOImpl studentDAO = new StudentDAOImpl(); //in DAO impl
    public boolean addStudent(Student student){ //called from controller
        return studentDAO.addStudent(student); //calls the DAO method
    }
}