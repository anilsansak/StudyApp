package com.example.acerbilgisayar.quoteapp;

/**
 * Created by Acer Bilgisayar on 9.12.2016.
 */

public class Word {
    public String word;
    public String meaning;
    public Word(String mMeaning, String mWord){
        super();
        word = mWord;
        meaning = mMeaning;
    }
    public String getMeaning() {
        return meaning;
    }
    public String getWord() {
        return word;
    }
    public Word getObject(Word w){return w; }
}
