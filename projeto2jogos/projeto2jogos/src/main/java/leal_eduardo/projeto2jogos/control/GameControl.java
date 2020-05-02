package leal_eduardo.projeto2jogos.control;

import leal_eduardo.projeto2jogos.model.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GameControl {
    @GetMapping("/recomendados")
    public String note(){
        return "Uma pequena lista de Jogos para todos se divertirem!";
    }
    @GetMapping("/jogo")
    public Game getGame(){
        Game g = new Game();
        g.setName("Ori and the Blind Forest");
        g.setRelease("11.03.2015");
        g.setGenre("Plataforma,Ação");
        g.setDeveloper("Moon Studios");
        g.setPublisher("Xbox game studios");
        return g;
    }
    @GetMapping("/jogos")
    public ArrayList<Game> getGames(){
        Game g1 = new Game();
        g1.setName("Ori and the Blind Forest");
        g1.setRelease("11.03.2015");
        g1.setGenre("Plataforma,Ação");
        g1.setDeveloper("Moon Studios");
        g1.setPublisher("Xbox game studios");

        Game g2 = new Game();
        g2.setName("Hollow Knight");
        g2.setRelease("24.02.2017");
        g2.setGenre("Plataforma,Indie,Ação");
        g2.setDeveloper("Team Cherry");
        g2.setPublisher("Team Cherry");

        Game g3 = new Game();
        g3.setName("Oxygen Not Included");
        g3.setRelease("30.07.2019");
        g3.setGenre("Indie,Simulação");
        g3.setDeveloper("Klei Entertainment");
        g3.setPublisher("Klei Entertainment");

        Game g4 = new Game();
        g4.setName("FINAL FANTASY XII THE ZODIAC AGE");
        g4.setRelease("01.02.2018");
        g4.setGenre("RPG");
        g4.setDeveloper("Square Enix");
        g4.setPublisher("Square Enix");

        Game g5 = new Game();
        g5.setName("BioShock Infinite");
        g5.setRelease("25.03.2013");
        g5.setGenre("Ação,Tiro em primeira pessoa");
        g5.setDeveloper("Irrational Games,Virtual Programming");
        g5.setPublisher("2k");

        ArrayList<Game> favorite = new ArrayList<>();
        favorite.add(g1);
        favorite.add(g2);
        favorite.add(g3);
        favorite.add(g4);
        favorite.add(g5);
        return favorite;
    }
}
