package ru.gb.seminar;

import ru.gb.seminar.controller.Controller;
import ru.gb.seminar.data.Student;
import ru.gb.seminar.data.StudentGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createTimetable(controller.createTeacher("Ирина", "Анатольевна", "Яровая", 99L),
                new ArrayList<>(
                        Arrays.asList(
                                new Student("Александр", "Сергеевич", "Пушкин"),
                                new Student("Гомер", "Джей", "Симпсон"),
                                new Student("Владимир", "Ильич", "Ленин")

                        )
                ));

        controller.createTimetable(controller.createTeacher("Дмитрий", "Иванович", "Менделеев", 89L)
                , new ArrayList<>(
                        Arrays.asList(
                                new Student("Юрий", "Владимирович", "Никулин"),
                                new Student("Виктор", "Робертович", "Цой"),
                                new Student("Винсент", "Теодорович", "Ван Гог")

                        )
                ));

        controller.showStudentsInGroups();


    }
}