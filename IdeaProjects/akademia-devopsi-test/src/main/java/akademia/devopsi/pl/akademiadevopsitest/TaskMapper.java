package akademia.devopsi.pl.akademiadevopsitest;

import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface TaskMapper {
    Task map (TaskCreateDto dto);
}
