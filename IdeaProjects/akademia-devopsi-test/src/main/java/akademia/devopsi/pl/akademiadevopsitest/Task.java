package akademia.devopsi.pl.akademiadevopsitest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Task {

    private String name;
    private int id;
    private boolean isDone;

}
