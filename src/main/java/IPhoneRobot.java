public class IPhoneRobot  {

    public void call(Mobile mobile,String msg) {
        if(mobile.getClass() == IPhone.class) {
            mobile.makeACall(msg);
        }else{
            System.out.println("Oh my god. I can't use.");
        }
    }
}
