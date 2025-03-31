package ru.spbu.agataullina.domain.repo;

import ru.spbu.agataullina.domain.model.OpenQuestionCard;

import java.util.List;
import java.util.Optional;

public interface QuestionRepository {
    List<OpenQuestionCard> getAll();
    Optional<OpenQuestionCard> getById(Long id);
    void add(OpenQuestionCard openQuestionCard);
    void update(OpenQuestionCard openQuestionCard);
    void remove(Long id);
}
