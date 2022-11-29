package ru.gb.seminar.service;

import ru.gb.seminar.data.Student;
import ru.gb.seminar.data.StudentGroup;
import ru.gb.seminar.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {

    private  final List<StudentGroup> studentGroupList;


    public StudentGroupService() {
        this.studentGroupList = new ArrayList<>();

    }

    public void completeStudentGroup(Teacher teacher, List<Student> studentsList) {
        this.studentGroupList.add(new StudentGroup(teacher, studentsList));
    };


    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }
}