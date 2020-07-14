package FacadePattern;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Light(), new Projector(), new Screen(), new DvdPlayer());

        homeTheaterFacade.watchMovie("조커");
        homeTheaterFacade.endMovie();
    }
}
