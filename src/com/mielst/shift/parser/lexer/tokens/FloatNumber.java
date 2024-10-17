package com.mielst.shift.parser.lexer.tokens;

import com.mielst.shift.parser.lexer.token.Token;
import com.mielst.shift.parser.lexer.token.TokenType;

public class FloatNumber extends Token {
    private final float value;

    public FloatNumber(float value, int line, int col) {
        super(TokenType.FLOATNUMBER, line, col);
        this.value = value;
    }

    @Override
    public String toString() {
        return ("token " + this.type + ": " + this.value + " on " + this.line + ":" + this.col);
    }
}
