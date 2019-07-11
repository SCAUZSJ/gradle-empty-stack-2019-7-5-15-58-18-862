public class Mobile
{
    private String name;
    private String color;
    private String brand;
    private int maxLenght;

    public Mobile(String name, String color, String brand, int maxLenght) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.maxLenght = maxLenght;
    }
    public void makeACall(String msg){
        System.out.println("Message : ["+msg+"]");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: [" + name + "], color: ['" + color + "], brand: [" + brand +"]";
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    public void setMaxLenght(int maxLenght) {
        this.maxLenght = maxLenght;
    }
}
