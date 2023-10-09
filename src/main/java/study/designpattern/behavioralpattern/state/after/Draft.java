package study.designpattern.behavioralpattern.state.after;

public class Draft implements State{

    private AfterStateOnlineCourse onlineCourse;

    public Draft(AfterStateOnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, AfterStateStudent student) {
        throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 남길 수 없습니다.");
    }

    @Override
    public void addStudent(AfterStateStudent student) {
        this.onlineCourse.getStudents().add(student);

        if(this.onlineCourse.getStudents().size() > 1) {
            this.onlineCourse.changeState(new Private(this.onlineCourse));
        }
    }
}
