package StatePattern;

/*
예를 들어, 노트북을 켜고 끄는 상황을 생각해보겠습니다.
노트북 전원이 켜져 있는 상태에서 전원 버튼을 누르면, 전원을 끌 수 있습니다.
노트북 전원이 꺼져 있는 상태에서 전원 버튼을 누르면, 전원을 켤 수 있습니다.
 */

public class PreLaptop {
    //아래와 같이 상태가 존재함
    public static String ON = "on";
    public static String OFF = "off";
    private String powerState = "";

    public PreLaptop(){
        setPowerState(PreLaptop.OFF);
    }

    public void setPowerState(String powerState){
        this.powerState = powerState;
    }

    public void powerPush(){
        if ("on".equals(this.powerState)) {
            System.out.println("전원 off");
        }
        else {
            System.out.println("전원 on");
        }
    }
}



