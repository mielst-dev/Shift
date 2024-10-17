package com.mielst.shift.parser.lexer.token;

import com.mielst.shift.parser.lexer.IToken;

public class Token implements IToken {
    protected TokenType type;
    protected int line;
    protected int col;

    public Token (TokenType type, int line, int col) {
        this.type = type;
        this.line = line;
        this.col = col;
    }

    @Override
    public TokenType getType() {
        return this.type;
    }

    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public int getCol() {
        return this.col;
    }

    @Override
    public String toString() {
        return ("token " + this.type + " on " + this.line + ":" + this.col);
    }

}
