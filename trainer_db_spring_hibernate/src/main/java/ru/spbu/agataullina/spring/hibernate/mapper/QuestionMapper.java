package ru.spbu.agataullina.spring.hibernate.mapper;

import org.mapstruct.Mapper;
import ru.spbu.agataullina.domain.model.OpenQuestionCard;
import ru.spbu.agataullina.spring.hibernate.entity.OpenQuestionCardEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    OpenQuestionCard mapToModel(OpenQuestionCardEntity entity);

    OpenQuestionCardEntity mapToEntity(OpenQuestionCard model);

    List<OpenQuestionCard> mapToModel(List<OpenQuestionCardEntity> entities);

    List<OpenQuestionCardEntity> mapToEntity(List<OpenQuestionCard> models);
}
