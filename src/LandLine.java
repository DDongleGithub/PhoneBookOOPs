public class LandLine implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public boolean powerOn() {
        return isPowerOn;
    }

    @Override
    public boolean isRinging() {
        return  isRinging;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn){
            System.out.println("You are calling" + phoneNo);
        }
        else{
            System.out.println("Your Landline is Off");
        }
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("Heyy, you are receiving call " + phoneNo);
        }
        else{
            System.out.println("Power off");
        }
    }

    @Override
    public boolean answerCall() {
       if(isRinging){
           System.out.println("Answer call");
           this.isRinging = false;

           return true;
       }
       else{
           return false;
       }
    }
}
