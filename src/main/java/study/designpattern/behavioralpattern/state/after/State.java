package study.designpattern.behavioralpattern.state.after;

public interface State {

    public void addReview(String review, AfterStateStudent student);
    public void addStudent(AfterStateStudent student);
}
