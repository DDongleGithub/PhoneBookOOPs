public interface Phone {
    boolean powerOn();

    boolean isRinging();

    void callNumber(String phoneNo);

    void receiveCall(String phoneNo);

    boolean answerCall();
}
