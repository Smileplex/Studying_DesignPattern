package FacadePattern;

public class HomeTheaterFacade {
    private Light light;
    private Projector projector;
    private Screen screen;
    private DvdPlayer dvdPlayer;

    public HomeTheaterFacade(Light light, Projector projector, Screen screen, DvdPlayer dvdPlayer) {
        this.light = light;
        this.projector = projector;
        this.screen = screen;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movieName){
        System.out.println("===============WATCH MOIVE===============");
        light.movieMode();
        screen.down();
        projector.on();
        projector.movieMode();
        dvdPlayer.on();
        dvdPlayer.play(movieName);
    }

    public void endMovie() {
        System.out.println("===============END MOIVE===============");
        light.on();
        screen.up();
        projector.off();
        dvdPlayer.off();
    }
}
