package ru.spbu.agataullina.feign.mapper;

import org.mapstruct.Mapper;
import ru.spbu.agataullina.domain.model.OpenQuestionCard;
import ru.spbu.agataullina.feign.dto.OpenQuestionCardDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapperDto {

    OpenQuestionCard toModel(OpenQuestionCardDto dto);
    OpenQuestionCardDto toDto(OpenQuestionCard model);
    List<OpenQuestionCard> toModel(List<OpenQuestionCardDto> dto);
    List<OpenQuestionCardDto> toDto(List<OpenQuestionCard> model);
}
