package test;

public class MyCar {
    private String name;
    private int price;
    private String color;
    private String motorType;

    public MyCar(String name, int price, String color, String motorType) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.motorType = motorType;
    }

    public MyCar() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", motorType='" + motorType + '\'' +
                '}';
    }
}
