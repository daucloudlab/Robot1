package kz.kazntu.lessons.models;

public class Robot {

    private SonyHand hand = new SonyHand();
    private SonyLeg leg = new SonyLeg();
    private SonyHead head = new SonyHead();

    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }

}