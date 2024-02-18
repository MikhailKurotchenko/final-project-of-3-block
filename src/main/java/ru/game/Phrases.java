package ru.game;

import java.util.Arrays;
import java.util.List;

public class Phrases {

    private int step = 0;


    private final List<String> questions = Arrays.asList(
         "Ты потерял память. Принять вызов НЛО?",
         "Ты принял вызов. Поднимаешься на мостик к капитану?",
         "Ты поднялся на мостик. Ты кто?"
    );

    private final List<String> positiveAnswers = Arrays.asList(
            "Принять вызов",
            "Подняться на мостик",
            "Рассказать правду о себе"
    );

    private final List<String> negativeAnswers = Arrays.asList(
            "Отклонить вызов",
            "Отказаться подниматься на мостик",
            "Солгать о себе"
    );

    private final List<String> positiveConsequences = Arrays.asList(
            "Тебя вернули домой."
    );

    private final List<String> negativeConsequences = Arrays.asList(
            "Ты отклонил вызов.",
            "Ты не пошел на переговоры.",
            "Твою ложь разоблачили."
    );

    public String getQuestion() {
        return questions.get(step);
    }

    public String getPositiveAnswer() {
        return positiveAnswers.get(step);
    }

    public String getNegativeAnswer() {
        return negativeAnswers.get(step);
    }

    public String getPositiveConsequences() {
        return positiveConsequences.get(0);
    }

    public String getNegativeConsequences() {
        return negativeConsequences.get(step);
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public List<String> getQuestions() {
        return questions;
    }
}
