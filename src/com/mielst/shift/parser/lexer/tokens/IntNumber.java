package com.mielst.shift.parser.lexer.tokens;

import com.mielst.shift.parser.lexer.token.Token;
import com.mielst.shift.parser.lexer.token.TokenType;

public class IntNumber extends Token {
    private final int value;

    public IntNumber(int value, int line, int col) {
        super(TokenType.INTNUMBER, line, col);
        this.value = value;
    }

    @Override
    public String toString() {
        return ("Number: " + this.value + " on " + this.line + ":" + this.col);
    }
}
