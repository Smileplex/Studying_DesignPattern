package ObserverPattern2;

public class Main {
    public static void main(String[] args) {
        NewsMachine newsMachine = new NewsMachine();
        Observer annualSubscriber = new AnnualSubscriber(newsMachine);
        Observer eventSubscriber = new EventSubscriber(newsMachine);

        newsMachine.changeNewsInfo("오늘 한파", "전국 영하 18도 입니다.");
        newsMachine.changeNewsInfo("벚꽃 축제합니다", "다같이 벚꽃보러~");
    }
}
