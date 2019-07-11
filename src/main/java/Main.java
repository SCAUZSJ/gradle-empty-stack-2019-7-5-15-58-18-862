public class Main {

    public static void main(String[] args)
    {

        Mobile iPhone = new IPhone("iphone8","white","Iphone",20);
        Mobile andriod = new Andriod("P30","white","HUAWEI",20);

        Person person = new Person("Aperson");
        IPhoneRobot IPhoneRobot = new IPhoneRobot();
        person.call(andriod,"Hi, I am person");
        person.call(iPhone,"Hi, I am person");

        person.call(andriod,"Hi, I am person. To long ."); //话痨

        IPhoneRobot.call(andriod,"Hi, I am robot.");// 不支持andriod
        IPhoneRobot.call(iPhone,"Hi, I am robot.");
        IPhoneRobot.call(iPhone,"Hi, I am robot. To long .");//话痨

    }
}
