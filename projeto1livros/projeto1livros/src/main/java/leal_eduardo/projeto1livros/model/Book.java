package leal_eduardo.projeto1livros.model;

import lombok.*;

/**
 * @author eduardo
 * @since 01.05.2020 14:33
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {

        @Getter @Setter
        private String name;
        @Getter @Setter
        private String genre;
        @Getter @Setter
        private String style;
        @Getter @Setter
        private String writtenby;


    }

