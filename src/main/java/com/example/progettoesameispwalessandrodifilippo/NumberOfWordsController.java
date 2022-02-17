package com.example.progettoesameispwalessandrodifilippo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.GenericDeclaration;

public class NumberOfWordsController {

    @FXML
    private TextField tfPhrase;

    @FXML
    private Label labelDisplayNumberOfWords;

    @FXML
    protected void onDisplayWordsClick() {
        String phrase = tfPhrase.getText();
        Integer num = countNumberOfWords(phrase);
        labelDisplayNumberOfWords.setText(num.toString());
    }

    private Integer countNumberOfWords(String phrase) {
        Integer num = 0;
        for(int i = 0; i < phrase.length(); i++){
            char c = phrase.charAt(i);
            if (c == ' ' || c == '.' || c == ',') num += 1;
        }
        return num;
    }
}