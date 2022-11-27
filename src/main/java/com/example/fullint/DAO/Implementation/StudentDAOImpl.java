package com.example.fullint.DAO.Implementation;

import com.example.fullint.DAO.StudentDAO;
import com.example.fullint.bean.Student;
import com.example.fullint.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean addStudent(Student student) {
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction t = session.beginTransaction();
            System.out.println(student.getBranch());
            String f1;
            f1 = student.getPhoto();
            System.out.println(f1);
            String[] f2 = f1.split("fakepath"+"\\\\",2);
            System.out.println(f2[1]);
            String f3 = f2[1];
            System.out.println(f3);
            String f4 = "/home/akshay/esdProjectImages/" + f3;
            System.out.println(f4);
            student.setPhoto(f4);
            String roll;
            int num;
              String b = student.getBranch();
            String hql = "FROM Student";
            Query query = session.createQuery(hql);
            List<Student> studentList = query.list();
            num = studentList.size() + 1;
            if (b.charAt(1) == 'T') {
                roll = "MT2021" + Integer.toString(num);
            } else if (b.charAt(1) == 'S') {
                roll = "MS2021" + Integer.toString(num);
            } else if (b.charAt(0) == 'I') {
                roll = "IMT2021" + Integer.toString(num);
            } else {
                roll = "PHD2021" + Integer.toString(num);
            }
            student.setRoll_no(roll);
            session.save(student);
            t.commit();
            return true;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return false;
        }
    }
}
