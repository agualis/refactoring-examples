package com.agualis.refactoring.dataclass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestEncapsulateCollection {

    Person manolo;

    @Before
    public void init(){
        manolo = new Person();
        Set s = new HashSet();
        s.add(new Course ("Lisp", false));
        s.add(new Course ("Guitarra", true));
        manolo.setCourses(s);

    }

    @Test public void
    test_adding_courses () {

        assertThat(manolo.getCourses().size(), is(2));

        Course refactoringCourse = new Course ("Refactoring", true);

        manolo.getCourses().add(refactoringCourse);
        manolo.getCourses().add(new Course ("Hacking Microwaves", false));

        assertThat(manolo.getCourses().size(), is(4));

        manolo.getCourses().remove(refactoringCourse);

        assertThat(manolo.getCourses().size(), is(3));
    }

    @Test public void
    test_counting_advanced_courses() {

        int advancedCoursesCount = 0;
        for(Course course : manolo.getCourses()) {
            if (course.isAdvanced()) advancedCoursesCount ++;
        }
        assertThat(advancedCoursesCount, is(1));
    }


}
