package leal_eduardo.projeto3animacao.control;

import leal_eduardo.projeto3animacao.model.Animation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AnimationControl {
    @GetMapping("/catalogo")
    public String note(){
        return "Pequnas recomendações!!";
    }
    @GetMapping("/animacao")
    public Animation getAnimation(){
        Animation a = new Animation();
        a.setName("Os Simpsons");
        a.setDirected_by("Matt Groening");
        a.setOrigin("Estados Unidos");
        a.setRelease("17.12.1989");
        a.setSeasons("31 temporadas,Em andamento");
        return a;
    }
    @GetMapping("/animacoes")
    public ArrayList<Animation> getAnimations(){
        Animation a1 = new Animation();
        a1.setName("Os Simpsons");
        a1.setDirected_by("Matt Groening");
        a1.setOrigin("Estados Unidos");
        a1.setRelease("17.12.1989");
        a1.setSeasons("31 temporadas");

        Animation a2 = new Animation();
        a2.setName("My Hero Academia");
        a2.setDirected_by("Kenji Nagasaki(1ª a 3ªtemp.),Masahiro Mukai(4ªtemporada)");
        a2.setOrigin("Japão");
        a2.setRelease("03.04.2016,Em andamento");
        a2.setSeasons("4 temporadas");

        Animation a3 = new Animation();
        a3.setName("DEVILMAN crybaby");
        a3.setDirected_by("Masaaki Yuasa");
        a3.setOrigin("Japão");
        a3.setRelease("05.01.2018");
        a3.setSeasons("10 Episodios");

        Animation a4 = new Animation();
        a4.setName("Futurama");
        a4.setDirected_by("Matt Groening");
        a4.setOrigin("Estados Unidos");
        a4.setRelease("28.03.1999");
        a4.setSeasons("7 temporadas,Finalizada");

        ArrayList<Animation> note = new ArrayList<>();
        note.add(a1);
        note.add(a2);
        note.add(a3);
        note.add(a4);
        return note;
    }
}
