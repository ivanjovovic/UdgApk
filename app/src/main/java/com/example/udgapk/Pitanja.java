package com.example.udgapk;

public class Pitanja {


    public String mQuestions[]={
            "Koja je dekan FIST-a?",
            "Koja je profesorova jednacina?",
            "Koja je treca planeta solarnog sistema?",
            "Koja je cetvrta planeta solarnog sistema?",
            "Sta od ponudjenih nije programski jezik?",
            "Koliko je 8*8+8?"

    };
    private String mChoices[][]={
            {"Milica Vukotic","Veselin Vukotic","Marko Simeunovic","Tomo Popovic"},
            {"a+b+c","S=z∙i2","y=a+b","c=a*b"},
            {"Merkur","Venera","Zemlja","Saturn"},
            {"Merkur","Venera","Mars","Saturn"},
            {"Java","Python","HTML","C++"},
            {"72","108","96","89"}

    };
    private String mCorrectAnswers[]={"Milica Vukotic","S=z∙i2","Zemlja","Mars","HTML","72"};


    public String getQuestion(int a) {
        String question=mQuestions[a];
        return question;
    }
    public String getChoice1(int a) {
        String choice=mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a) {
        String choice=mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a) {
        String choice=mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a) {
        String choice=mChoices[a][3];
        return choice;
    }
    public  String getCorrectAnswer(int a) {
        String answer=mCorrectAnswers[a];
        return answer;
    }

}