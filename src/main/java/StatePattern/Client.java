package StatePattern;

public class Client {
    public static void main(String[] args){
        //PreLaptop Execution
        PreLaptop preLaptop = new PreLaptop();
        preLaptop.powerPush();
        preLaptop.setPowerState(PreLaptop.ON);
        preLaptop.powerPush();


        //Pre2Laptop Execution
        Pre2Laptop pre2Laptop = new Pre2Laptop();
        pre2Laptop.powerPush();
        pre2Laptop.setPowerState(pre2Laptop.ON);
        pre2Laptop.powerPush();
        pre2Laptop.setPowerState(pre2Laptop.SAVING);
        pre2Laptop.powerPush();
        pre2Laptop.setPowerState(pre2Laptop.OFF);
        pre2Laptop.powerPush();
        pre2Laptop.setPowerState(pre2Laptop.ON);
        pre2Laptop.powerPush();



    }


}
