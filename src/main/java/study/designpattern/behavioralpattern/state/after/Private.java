package study.designpattern.behavioralpattern.state.after;

public class Private implements State{

    private AfterStateOnlineCourse onlineCourse;

    public Private(AfterStateOnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, AfterStateStudent student) {
        if(this.onlineCourse.getStudents().contains(student)) {
            this.onlineCourse.getReviews().add(review);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스는 수강생만 리뷰를 남길 수 있습니다.");
        }
    }

    @Override
    public void addStudent(AfterStateStudent student) {
        if(student.isAvailable(onlineCourse)) {
            this.onlineCourse.getStudents().add(student);
        } else {
            throw new UnsupportedOperationException("프라이빗 코스를 수강할 수 없습니다.");
        }
    }
}
