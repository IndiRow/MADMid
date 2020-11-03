package com.example.myapplication;

public class Question {
    public String questions[]={
            "How COVID-19 does NOT pass on??",
            "What you will do if you suspect you have a COVID-19?",
            "For example you got sick, but but You don' know what. Which of the following is a bad idea to do?",
            "How long people can be contagious without any symptoms?",
            "What will help against the COVID-19?",
            "For whom COVID-19 is more dangerous?",
            "What happens, if we are all together follow the medicine recommendations?"
    };
    public String[][] choices ={
            {"Through the droplets that come from mouth and when you cough or breathe out", "Through touches and everyday objects", "Through dust particles in air", "Through the parcels"},
            {"Will pass by itself", "Go to the hospital", "Call to a doctor", "Start panic and call for advice to grandma"},
            {"Stay at home and wait for a doctor", "Wear a mask", "Watch some films", "Go to someone's wedding/party"},
            {"3-4 days", "1 month", "2 weeks","This does not happen"},
            {"Antibiotics", "Some folk remedies(garlic etc.)", "There's no vaccine, but You can relieve symptoms", "Attending a concert of your favorite singer"},
            {"Adult", "Children and teenagers", "Animals", "Elderly people with chronic diseases"},
            {"Virus will magically disappear", "Nothing - all is useless", "Frequency of sick people will decrease, for medical workers it will become much easier to help people", "Aliens will arrive and save us"}
    };
    public String correctAnswer[]={
            "Through the parcels", "Call to a doctor", "Go to someone's wedding/party", "2 weeks", "There's no vaccine, but You can relieve symptoms", "Elderly people with chronic diseases", "Frequency of sick people will decrease, for medical workers it will become much easier to help people"
    };
    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = choices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = choices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = choices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}

