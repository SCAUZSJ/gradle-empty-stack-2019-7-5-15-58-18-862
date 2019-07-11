
import java.util.List;

public class Person {
    private String name;


    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call(Mobile mobile,String msg){
        mobile.makeACall(msg);
    }


}
