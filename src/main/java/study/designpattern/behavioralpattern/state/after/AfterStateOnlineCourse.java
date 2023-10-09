package study.designpattern.behavioralpattern.state.after;

import java.util.ArrayList;
import java.util.List;

public class AfterStateOnlineCourse {
    private State state = new Draft(this);
    private List<AfterStateStudent> students = new ArrayList<>();

    private List<String> reviews = new ArrayList<>();

    public void addStudent(AfterStateStudent student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, AfterStateStudent student) {
        this.state.addReview(review, student);
    }

    public State getState() {
        return state;
    }

    public List<AfterStateStudent> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }


    public void changeState(State state) {
        this.state = state;
    }
}
