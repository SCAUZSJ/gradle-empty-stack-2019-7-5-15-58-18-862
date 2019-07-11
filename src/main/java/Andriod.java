public class Andriod extends Mobile {

    public Andriod(String name, String color, String brand, int maxLenght) {
        super(name, color, brand,maxLenght);
    }
    @Override
    public void makeACall(String msg){
        if(msg.length()<=super.getMaxLenght()){
            System.out.println("<Andriod>Message : ["+msg+"]");
        }else{
            System.out.println("<Andriod> Message cannot be sent");
        }
    }
}
