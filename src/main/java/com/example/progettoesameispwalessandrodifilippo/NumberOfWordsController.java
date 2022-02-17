package com.example.progettoesameispwalessandrodifilippo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.GenericDeclaration;
import java.util.StringTokenizer;

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
        StringTokenizer phraseSegments = new StringTokenizer(phrase);
        return phraseSegments.countTokens();
    }
}