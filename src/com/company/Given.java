package com.company;

import java.util.Comparator;

public class Given{

    public Given(String s, int correct)
    {
        charArray = s.toCharArray();
        this.correct = correct;
        current = 0;
    }

    public char[] getCharArray() {
        return charArray;
    }

    private char[] charArray;

    public int getCorrect() {
        return correct;
    }

    public int getCurrent() {
        return current;
    }

    private int correct;
    private int current;

    public void Reset(){
        current = 0;
    }

    public void IncreaseCurrent(){
        current += 1;
    }

    public boolean CheckCurrent(){
        return current <= correct;
    }

    public boolean VerifyCurrent(){
        return current == correct;
    }



}
