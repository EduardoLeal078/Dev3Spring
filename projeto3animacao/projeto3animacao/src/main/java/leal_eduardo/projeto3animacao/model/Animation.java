package leal_eduardo.projeto3animacao.model;

import lombok.*;

/**
 * @author eduardo
 * @since 02.05.2020 15:06
 */

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Animation {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String release;
    @Getter @Setter
    private String seasons;
    @Getter @Setter
    private String directed_by;
    @Getter @Setter
    private String origin;

}
