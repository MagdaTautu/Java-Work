package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Problem {
    private List<Student> students;
    private Set<Project> projects;

    public Problem(List<Student> students, Set<Project> projects) {
        this.students = students;
        this.projects = projects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void getStudentsWithLessPreferencesThanAverage() {
        double avgProj = students.stream()
                .mapToInt(s -> s.getAdmissibleProjects().size())
                .average()
                .orElse(0);
        /*return students.stream()
                .filter(s -> s.getAdmissibleProjects().size() < avg)
                .sorted()
                .collect(Collectors.toList());*/
        List<Student> studentsWithFewerPreferences = students.stream()
                .filter(s -> s.getAdmissibleProjects().size() < avgProj)
                .collect(Collectors.toList());
        System.out.println("Students with fewer preferences than average: ");
        studentsWithFewerPreferences.forEach(s -> System.out.println(s.getName()));
    }

    private Project getPrjByName(String name) {
        for (Project project : projects) {
            if (project.getName().equals(name)) {
                return project;
            }
        }
        return null;
    }
    public HashMap<Student, Project> getMaxMatching() {
        HashMap<Student,Project> matching = new HashMap<Student,Project>();
        List<Student> studentsCopy = new ArrayList<>(students);
        Collections.sort(studentsCopy);
        for (Student student : studentsCopy) {
            for (Project prj : student.getAdmissibleProjects()) {
                String projectName = prj.getName();
                Project project = getPrjByName(projectName);
                if (project != null && !project.isAssigned()) {
                    matching.put(student, project);
                    project.setAssigned(true);
                    break;
                }
            }
        }
        return matching;
    }
}
 /*   public List<Pair<Student, Project>> solve() {
        List<Pair<Student, Project>> matching = new ArrayList<>();
        Set<Project> availableProjects =*/