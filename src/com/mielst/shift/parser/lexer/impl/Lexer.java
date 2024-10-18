package com.mielst.shift.parser.lexer.impl;

import java.util.List;

import com.mielst.shift.parser.lexer.ILexer;
import com.mielst.shift.parser.lexer.token.Token;

public final class Lexer implements ILexer {

    public static final String operators = "+-*/%()[]{}@#!<>~|.,:;=&^?";
    public static final List<String> keywords = {
        // TODO
    };

    public List<Token> tokenize(String input) {
        List<Token> tokens = null;
        int length = input.length;
        for (int i; i <= length; i++) {
            char current = input[i];
            if (current == '"') tokenizeText();
            else if (current == '\'') tokenizeChar();
            else if (Character.isDigit(current)) tokenizeNumber();
            else if (operators.indexOf(current) != -1) tokenizeOperator();
        }
        return tokens;
    }

    public void tokenizeText() {
        // TODO
    }

    public void tokenizeChar() {

    }

    public void tokenizeNumber() {

    }

    public void tokenizeOperator()  {

    }
}
