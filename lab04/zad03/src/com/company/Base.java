package com.company;


class Base {

    private int index;
    private boolean isLearned;
    private int learnedAtDay;
    private String word;

    Base(int index, boolean isLearned, int learnedAtDay, String word) {
        this.index = index;
        this.isLearned = isLearned;
        this.learnedAtDay = learnedAtDay;
        this.word = word;
    }

    void setIsLearned() {
        isLearned = true;
    }

    void setIsNotLearned() {
        isLearned = false;
    }

    boolean getIsLearned() {
        return isLearned;
    }

    int getIndex() {
        return index;
    }

    String getWord() {
        return word;
    }


    void setLearnedAtDay(int i) {
        learnedAtDay = i;
    }

    int getLearnedAtDay(){
        return learnedAtDay;
    }


    @Override
    public String toString(){
        return "index:"+index+", isLearned:"+isLearned+", learnedAtDay:"+learnedAtDay+", word:"+word;
    }

}


