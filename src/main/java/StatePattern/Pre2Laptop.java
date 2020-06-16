package StatePattern;

/*
변경요청 발생 :
    그런데 간단하게 켜고, 끄는 노트북에 절전모드를 추가한다고 해보겠습니다.
    상태에 따른 동작은 다음과 같다고 가정합니다.

    노트북 전원이 켜져 있는 상태에서 전원 버튼을 누르면, 전원을 끌 수 있습니다.
    노트북 전원이 꺼져 있는 상태에서 전원 버튼을 누르면, 절전모드가 됩니다.
    노트북 절전모드 상태에서 전원 버튼을 누르면, 전원을 켤 수 있습니다.
 */
public class Pre2Laptop {
    //아래와 같이 상태가 존재함
    public static String ON = "on";
    public static String OFF = "off";
    public static String SAVING = "saving";
    private String powerState = "";

    public Pre2Laptop(){
        setPowerState(Pre2Laptop.OFF);
    }

    public void setPowerState(String powerState){
        this.powerState = powerState;
    }

    public void powerPush(){
        if ("on".equals(this.powerState)) {
            System.out.println("전원 off");
        }
        else if ("saving".equals(this.powerState)){
            System.out.println("전원 on");
        }
        else {
            System.out.println("절전 모드");
        }
    }
}

