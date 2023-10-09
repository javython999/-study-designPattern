package study.designpattern.behavioralpattern.state.after;

import java.util.HashSet;
import java.util.Set;

public class AfterStateStudent {
    private String name;
    private Set<AfterStateOnlineCourse> onlineCourses = new HashSet<>();

    public AfterStateStudent(String name) {
        this.name = name;
    }

    public boolean isAvailable(AfterStateOnlineCourse onlineCourse) {
        return onlineCourses.contains(onlineCourse);
    }

    public void addPrivate(AfterStateOnlineCourse onlineCourse) {
        onlineCourses.add(onlineCourse);
    }

    @Override
    public String toString() {
        return "AfterStateStudent{" +
                "name='" + name + '\'' +
                '}';
    }
}
