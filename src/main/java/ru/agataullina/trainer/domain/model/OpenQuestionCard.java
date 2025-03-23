package ru.agataullina.trainer.domain.model;

public class OpenQuestionCard {
    private final Long id;
    private final String question;
    private final String expectedAnswer;

    public OpenQuestionCard(Long id, String question, String expectedAnswer) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID должен быть положительным числом");
        }
        if (question == null || question.trim().isEmpty()) {
            throw new IllegalArgumentException("Значение question не должно быть пустым или null");
        }
        if (expectedAnswer == null || expectedAnswer.trim().isEmpty()) {
            throw new IllegalArgumentException("Значение expectedAnswer не должно быть пустым или null");
        }

        this.id = id;
        this.question = question;
        this.expectedAnswer = expectedAnswer;
    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getExpectedAnswer() {  // ✅ Добавленный метод
        return expectedAnswer;
    }

    public boolean checkAnswer(String userAnswer) {
        return expectedAnswer.equals(userAnswer);
    }

    @Override
    public String toString() {
        return "OpenQuestionCard{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", expectedAnswer='" + expectedAnswer + '\'' +
                '}';
    }
}
