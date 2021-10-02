package dev.gichukipaul.nightowl.models;

import org.junit.jupiter.api.Test;

import java.util.List;

class StudentTest {
    Student student=new Student("t","ghjk","rtyui","DFGYH", List.of(new Course("ghj","vbn")));

    @Test
    boolean getId() {
        return "t".equals(student.getId());

    }
}