package study.designpattern.behavioralpattern.chainofresponsibilities.after;

import study.designpattern.behavioralpattern.chainofresponsibilities.before.Request;

public class PrintReqeustHandler extends RequestHandler{

    public PrintReqeustHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
