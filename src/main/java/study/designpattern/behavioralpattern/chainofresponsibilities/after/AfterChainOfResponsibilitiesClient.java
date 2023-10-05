package study.designpattern.behavioralpattern.chainofresponsibilities.after;

import study.designpattern.behavioralpattern.chainofresponsibilities.before.Request;

public class AfterChainOfResponsibilitiesClient {

    private RequestHandler requestHandler;

    public AfterChainOfResponsibilitiesClient(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork() {
        Request request = new Request("이번 놀이는 뽑기입니다.");
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        RequestHandler chain = new AuthReqeustHandler(new LoggingRequestHandler(new PrintReqeustHandler(null)));
        AfterChainOfResponsibilitiesClient client = new AfterChainOfResponsibilitiesClient(chain);
        client.doWork();
    }
}
