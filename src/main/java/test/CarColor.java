package test;

public class CarColor {
    public MyCar ChangingColor(MyCar myCar){
        if (myCar.getName().equals("Tesla model X Plaid")) {
            myCar.setColor("grey");
        }
        return myCar;
    }
}
