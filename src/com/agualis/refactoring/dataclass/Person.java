package com.agualis.refactoring.dataclass;

import java.util.Set;

public class Person {

    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> arg) {
        courses = arg;
    }
}

