package com.mielst.shift.parser.lexer;

import com.mielst.shift.parser.lexer.token.TokenType;

public interface IToken {
    String toString();
    TokenType getType();
    int getLine();
    int getCol();
}
