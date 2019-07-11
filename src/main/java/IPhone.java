public class IPhone extends Mobile {

    public IPhone(String name, String color, String brand, int maxLength) {
        super(name, color, brand, maxLength);
    }
    @Override
    public void makeACall(String msg){
        if(msg.length()<=super.getMaxLenght()){
            System.out.println("<iPhone>Message : ["+msg+"]");
        }else{
            System.out.println("<iPhone> Message cannot be sent");
        }
    }
}
