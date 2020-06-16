package StatePattern;

public class PostLaptop {
    private PowerState powerState;

    public PostLaptop() {
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public void powerPush(){
        powerState.powerPush();
    }
}
