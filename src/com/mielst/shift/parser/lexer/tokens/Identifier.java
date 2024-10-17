package com.mielst.shift.parser.lexer.tokens;

import com.mielst.shift.parser.lexer.token.Token;
import com.mielst.shift.parser.lexer.token.TokenType;

public class Identifier extends Token {
    private final String value;

    public Identifier(String value, int line, int col) {
        super(TokenType.IDENTIFIER, line, col);
        this.value = value;
    }

    @Override
    public String toString() {
        return ("Identifier: " + this.value + " on " + this.line + ":" + this.col);
    }
}
