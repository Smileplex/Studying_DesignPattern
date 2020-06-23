package ObserverPattern2;

public class EventSubscriber implements Observer {
    private Publisher publisher;
    private String newsString;

    public EventSubscriber(Publisher publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String title, String news) {
        this.newsString = title + " \n ================= \n " + news;
        display();
    }

    private void display() {
        System.out.println("\n\n=== 이벤트 유저 ===");
        System.out.println("\n\n" + newsString);
    }
}
