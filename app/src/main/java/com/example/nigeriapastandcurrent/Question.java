package com.example.nigeriapastandcurrent;

import java.lang.reflect.Constructor;

public class Question {

    /* Ten questions on Nigeria History */
    public String mQuestion[] = {
            "Lagos became a crown colony in?",
            "The first militant president of Nigeria was?",
            "When was Nigeria formed?",
            "When did Nigeria became a Republic?",
            "When did Nigeria gain independence?",
            "How many languages are there in Nigeria ",
            "When was the first military coup in Nigeria?",
            "Who is the first Nigerian president?",
            "Who was the first Nigeria first prime minister?",
            "How many states are there in Nigeria?"
    };
    /* One of four possible answers for the Quiz */
    private String mchoices[][] = new String[][]{
            {"1862", "1861", "1841", "1886"},
            {"Sanni Abacha", "Ibrahim Babangida", "Aguyi Irosi", "Yakubu Gowon"},
            {"1920", "1945", "1914", "1925"},
            {"1963", "1945", "1972", "1964"},
            {"Oct 1 1960", "Oct 24 1960", "Mar 20 1964", "Sep 15 1968"},
            {"300", "345", "450", "520"},
            {"1975", "1956", "1976", "1966"},
            {"Dr Nnamdi Azikiwe", "Prof Fola Williams", "Prof Wole Soyinka", "Tunde Idiagbon"},
            {"Abubakar Tafa Balewa", "John Fashanu", "Idris Badmus", "Bola Tinubu"},
            {"42", "39", "37", "36"},
    };

    private String mCorrectAnswer[] = {"1861", "Yakubu Gowon", "1914", "1963", "Oct 1 1960", "520", "1966", "Dr Nnamdi Azikiwe", "Abubakar Tafa Balewa", "36"};


    /* Constructor to retrieve stored question */

    public String getQuestion(int a) {
        String question = mQuestion[a];
        return question;

    }

    /* Constructor to retrieve possible first answer */
    public String getChoice1(int a) {
        String choice = mchoices[a] [0];
        return choice;
    }
    /* Constructor to retrieve possible second answer */
    public String getChoice2(int a) {
        String choice = mchoices[a][1];
        return choice;
    }
    /* Constructor to retrieve possible third answer */
    public String getChoice3(int a) {
        String choice = mchoices[a][2];
        return choice;
    }
    /* Constructor to retrieve possible forth answer */
    public String getChoice4(int a) {
        String choice = mchoices[a][3];
        return choice;
    }

    /* Constructor to retrieve correct answers for the Quiz */
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }



}
