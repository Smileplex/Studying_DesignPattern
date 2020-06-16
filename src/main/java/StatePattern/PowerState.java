package StatePattern;

//상태의 Interface 로 분리하지만, 각각의 상태에 따라 발생하는 기능을 구현해야 합니다.
//ex 'on' 상태의 powerPush 가 발생할 때 'off', 'off' 상태의 powerPush 가 발생할 때 'on'
public interface PowerState {
    void powerPush();
}
