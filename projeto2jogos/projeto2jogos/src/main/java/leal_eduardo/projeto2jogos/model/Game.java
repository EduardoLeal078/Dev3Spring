package leal_eduardo.projeto2jogos.model;

import lombok.*;

/**
 * @author eduardo
 * @since 01.05.2020 18:08
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String release;
    @Getter @Setter
    private String genre;
    @Getter @Setter
    private String developer;
    @Getter @Setter
    private String publisher;
}
