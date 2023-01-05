package test;

public class CarColor {
    public MyCar ChangingColor(MyCar myCar){
        System.out.println(myCar);
        myCar.setColor("OUI");
        return myCar;
    }
}
