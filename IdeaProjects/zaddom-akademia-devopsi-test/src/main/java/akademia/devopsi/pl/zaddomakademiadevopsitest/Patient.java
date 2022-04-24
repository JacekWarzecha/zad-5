package akademia.devopsi.pl.zaddomakademiadevopsitest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
public class Patient {
    @NotEmpty
    @Length(max=50)
    private String name;
    @NotEmpty
    @Length(max=80)
    private String surname;
    @NotEmpty
    @Length(min=11,max=11)
    private String pesel;
    @Length(min=9, max=11)
    private String telephone;
    private String comments;
}
