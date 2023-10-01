package study.designpattern.structuralpattern.decorator.before;

public class BeforeDecoratorApp {

    private CommentService commentService;

    public BeforeDecoratorApp(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        BeforeDecoratorApp client = new BeforeDecoratorApp(new SpamFilteringCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }

}
