package com.example.protectionProxy;

public class PersonImpl implements Person{
    String name;
    String gender;
    String hobby;
    double score;
    int scoreCount;
    public PersonImpl(String name, String gender) {
        this.name = name;
        this.gender = gender;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getHobby() {
        return hobby;
    }

    @Override
    public double getRating() {
        if(scoreCount == 0) return 0;
        return score/scoreCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void setRating(double rating) {
        score += rating;
        scoreCount++;
    }
}
