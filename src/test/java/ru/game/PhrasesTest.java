package ru.game;




import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PhrasesTest {
    Phrases phrases;

    @BeforeEach
    public void init() {
        phrases = new Phrases();
    }

    @Test
    public void getQuestion() {
        assertEquals(phrases.getQuestion(), "Ты потерял память. Принять вызов НЛО?");
    }

    @Test
    public void getPositiveAnswer() {
        assertEquals(phrases.getPositiveAnswer(), "Принять вызов");
    }

    @Test
    public void getNegativeAnswer() {
        assertEquals(phrases.getNegativeAnswer(), "Отклонить вызов");
    }
    @Test
    public void getPositiveConsequences() {
        assertEquals(phrases.getPositiveConsequences(), "Тебя вернули домой.");
    }

    @Test
    public void getNegativeConsequences() {
        assertEquals(phrases.getNegativeConsequences(), "Ты отклонил вызов.");
    }

    @Test
    public void getStep() {
        assertEquals(phrases.getStep(), 0);
    }

    @Test
    public void setStep() {
        phrases.setStep(1);
        assertEquals(phrases.getStep(), 1);
    }

    @Test
    public void getQuestions() {
        assertEquals(phrases.getQuestions(), Arrays.asList(
                "Ты потерял память. Принять вызов НЛО?",
                "Ты принял вызов. Поднимаешься на мостик к капитану?",
                "Ты поднялся на мостик. Ты кто?"
        ));
    }


}
