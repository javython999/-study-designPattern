package study.designpattern.structuralpattern.decorator.after;

public class AfterDecoratorApp {
    private static boolean ENABLED_SPAM_FILTER = true;
    private static boolean ENABLED_TRIMMING = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if(ENABLED_SPAM_FILTER) commentService = new SpamFilterCommentDecorator(commentService);

        if(ENABLED_TRIMMING) commentService = new TrimmingCommentDecorator(commentService);

        AfterDecoratorClient client = new AfterDecoratorClient(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
