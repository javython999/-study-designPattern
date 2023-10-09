package study.designpattern.behavioralpattern.state.after;

public class AfterStateClient {
    public static void main(String[] args) {
        AfterStateOnlineCourse onlineCourse = new AfterStateOnlineCourse();

        AfterStateStudent student = new AfterStateStudent("kim");
        AfterStateStudent student2 = new AfterStateStudent("lee");
        student2.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("리뷰", student);
        onlineCourse.addStudent(student2);


        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());

    }
}
