package org.example;
import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {
    public static <Main> void main(String[] args) {
//        List<Student> students = Stream.of(
//                new Student("S0", Arrays.asList(new Project("P0"), new Project("P1"), new Project("P2"))),
//                new Student("S1", Arrays.asList(new Project("P0"), new Project("P1"))),
//                new Student("S2", Arrays.asList(new Project("P0")))
//        ).collect(Collectors.toCollection(LinkedList::new))

//************fara stream********************

//        List<Student> listOfStudents = new ArrayList<>();
//        Student[] students = new Student[3];
//        students[0] = new Student("S0", Arrays.asList(new Project("P0"), new Project("P1"), new Project("P2")));
//        students[1] = new Student("S1", Arrays.asList(new Project("P0"), new Project("P1")));
//        students[2] = new Student("S2", Arrays.asList(new Project("P0")));
//        listOfStudents.addAll( Arrays.asList(students));
//        System.out.println("Students: ");
//        System.out.println(Arrays.toString(listOfStudents.toArray()));
//        TreeSet<Project> listOfProjects = new TreeSet<>();
//        Project[] projects = new Project[3];
//        projects[0] = new Project("P0");
//        projects[1] = new Project("P1");
//        projects[2] = new Project("P2");
//        System.out.println("Projects: ");
//        System.out.println(Arrays.asList(projects));

//****************cu stream*******************
        Faker faker = new Faker();
        List<Student> students = Stream.of(
                new Student(faker.name().firstName(), Arrays.asList(new Project("P0"), new Project("P1"), new Project("P2"))),
                new Student(faker.name().firstName(), Arrays.asList( new Project("P1"))),
                new Student(faker.name().firstName(), Arrays.asList(new Project("P0"), new Project("P3")))
        ).collect(Collectors.toList());

        TreeSet<Project> projects = Stream.of(
                new Project(faker.job().field()),
                new Project(faker.job().field()),
                new Project(faker.job().field())
        ).collect(Collectors.toCollection(TreeSet::new));
                System.out.println("Students sorted by name:");
        students.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nProjects available:");
        projects.stream()
                .sorted()
                .forEach(System.out::println);

        //STUDENT-PROJECT ALLOCATION PROBLEM
        Problem StudentProjectAllocation = new Problem(students,projects);
        StudentProjectAllocation.getStudentsWithLessPreferencesThanAverage();
        StudentProjectAllocation.getMaxMatching();


    }
}