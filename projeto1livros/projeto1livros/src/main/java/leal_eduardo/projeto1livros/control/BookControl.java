package leal_eduardo.projeto1livros.control;

import leal_eduardo.projeto1livros.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookControl {
    @GetMapping("/catalogo")
    public String note(){
        return "Bem vindo ao nosso pequeno catálogo! :)";
    }
    @GetMapping("/livro")
    public Book getBook(){
        Book B = new Book();
        B.setName("My Hero Academia");
        B.setStyle("Mangá");
        B.setGenre("Shõnen");
        B.setWrittenby("Kohei Horikoshi");
        return B;
    }
    @GetMapping("/livros")
    public ArrayList<Book> getBooks(){
        Book  b1 = new Book();
        b1.setName("My Hero Academia");
        b1.setStyle("Mangá");
        b1.setGenre("Shõnen");
        b1.setWrittenby("Kohei Horikoshi");

        Book b2 = new Book();
        b2.setName("Watchmen");
        b2.setStyle("HQ,graphic novel");
        b2.setGenre("Super-Herói");
        b2.setWrittenby("Alan Moore");

        Book b3 = new Book();
        b3.setName("Saint Seiya:The Lost Canvas");
        b3.setStyle("Mangá,Spin-off");
        b3.setGenre("Shõnen");
        b3.setWrittenby("Shiori Teshirogi,Masami Kurumada");

        Book b4 = new Book();
        b4.setName("Harry Potter e a Ordem da Fênix");
        b4.setStyle("Série de Livros");
        b4.setGenre("Aventura,Fantasia");
        b4.setWrittenby("J.K.Rowling");

        ArrayList<Book> catalogo = new ArrayList<>();
        catalogo.add(b1);
        catalogo.add((b2));
        catalogo.add(b3);
        catalogo.add(b4);
        return catalogo;
    }
}
