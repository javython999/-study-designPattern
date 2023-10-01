package study.designpattern.structuralpattern.decorator.after;

public class AfterDecoratorClient {
    private CommentService commentService;

    public AfterDecoratorClient(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
}
