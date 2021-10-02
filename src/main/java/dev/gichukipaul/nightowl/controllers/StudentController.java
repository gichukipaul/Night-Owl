package dev.gichukipaul.nightowl.controllers;

import dev.gichukipaul.nightowl.models.Course;
import dev.gichukipaul.nightowl.models.Lec;
import dev.gichukipaul.nightowl.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    // dummy data
    public List<Student> studentList = List.of(
            new Student("1", "Kamanju", "kemu", "TU01BNJ", List.of(new Course("1", "BBIT"))),
            new Student("2", "jon", "swami", "TU01BNJ", List.of(new Course("1", "BBIT"))),
            new Student("3", "cena", "docker", "TU01BNJ", List.of(new Course("1", "BBIT"))),
            new Student("4", "rocj", "engineer", "TU01BNJ", List.of(new Course("1", "BBIT"))),
            new Student("5", "rajesh", "mittal", "TU01BNJ", List.of(new Course("1", "BBIT")))
    );


    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent() {
        return studentList.get(0);
    }

    // Path parameters
    //http://localhost:8080/student/1
    @GetMapping("/student/{id}")
    public Object getStudentById(@PathVariable(value = "id") String id) {
        return studentList.get(Integer.parseInt(id) - 1);
    }

    // http://localhost:8080/all_students
    @GetMapping("/all_students")
    public List<Student> getStudents() {
        return studentList;
    }

    // http://localhost:8080/student?first_name=rajesh&second_name=max
    @GetMapping("/student/q")
    public Student queryStudent(@RequestParam(name = "first_name") String fname,
                                @RequestParam(name = "second_name") String lname) {
        int v = (int) (Math.random() * 100 + 5);
        Student student = new Student(String.valueOf(v), fname, lname, "ILBJSCNLD", List.of(new Course("1", "BBIT")));
        //studentList.add(student);
        return student;

    }

    // http://localhost:8080/lec
    @GetMapping("/lec")
    public Lec getLec() {
        return new Lec("1", "Mwanjele");
    }
}
