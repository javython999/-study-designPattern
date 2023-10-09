package study.designpattern.behavioralpattern.state.after;

public class Published implements State{

    private AfterStateOnlineCourse onlineCourse;

    public Published(AfterStateOnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, AfterStateStudent student) {
        this.onlineCourse.getReviews().add(review);
    }

    @Override
    public void addStudent(AfterStateStudent student) {
        this.onlineCourse.addStudent(student);
    }
}
