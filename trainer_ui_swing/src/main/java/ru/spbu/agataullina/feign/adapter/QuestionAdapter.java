package ru.spbu.agataullina.feign.adapter;

import org.springframework.stereotype.Component;
import ru.spbu.agataullina.domain.model.OpenQuestionCard;
import ru.spbu.agataullina.domain.repo.QuestionRepository;
import ru.spbu.agataullina.feign.client.QuestionFeignClient;
import ru.spbu.agataullina.feign.dto.OpenQuestionCardDto;
import ru.spbu.agataullina.feign.mapper.QuestionMapperDto;

import java.util.List;
import java.util.Optional;

@Component
public class QuestionAdapter implements QuestionRepository {

    private final QuestionFeignClient client;
    private final QuestionMapperDto mapper;

    public QuestionAdapter(QuestionFeignClient client, QuestionMapperDto mapper) {
        this.client = client;
        this.mapper = mapper;
    }

    @Override
    public List<OpenQuestionCard> getAll() {
        List<OpenQuestionCardDto> questions = client.list();
        return questions.stream()
                .map(mapper::toModel)
                .toList();
    }

    @Override
    public Optional<OpenQuestionCard> getById(Long id) {
        return Optional.ofNullable(client.card(id))
                .map(mapper::toModel);
    }

    @Override
    public void add(OpenQuestionCard openQuestionCard) {
        client.add(mapper.toDto(openQuestionCard));
    }

    @Override
    public void update(OpenQuestionCard openQuestionCard) {
        client.update(mapper.toDto(openQuestionCard));
    }

    @Override
    public void remove(Long id) {
        client.remove(id);
    }
}
