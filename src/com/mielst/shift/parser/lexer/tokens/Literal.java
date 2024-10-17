package com.mielst.shift.parser.lexer.tokens;

import com.mielst.shift.parser.lexer.token.Token;
import com.mielst.shift.parser.lexer.token.TokenType;

public class Literal extends Token {
    private final String value;

    public Literal(String value, int line, int col) {
        super(TokenType.LITERAL, line, col);
        this.value = value;
    }

    @Override
    public String toString() {
        return ("Literal: " + this.value + " on " + this.line + ":" + this.col);
    }
}
