package leal_eduardo.projetomanga.model;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
@Component

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

@Entity
@Table(name = "HQ")
public class HQEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_livro")
    private long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "valor")
    private double valor;
    @Column(name = "data_lancamento")
    private String data;
    @Column(name = "volumes")
    private String volumes;



}
