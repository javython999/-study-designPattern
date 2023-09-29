package study.designpattern.structuralpattern.bridge.after;

import study.designpattern.structuralpattern.bridge.before.Champion;

public class AfterBridgeApp {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());

        kda아리.skillQ();
        kda아리.skillW();

        Champion poolparty아리 = new 아리(new PoolParty());
        poolparty아리.skillQ();
        poolparty아리.skillR();

    }
}
