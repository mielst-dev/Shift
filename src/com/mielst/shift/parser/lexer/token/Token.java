package com.mielst.shift.parser.lexer.token;

import com.mielst.shift.parser.lexer.IToken;

public class Token implements IToken {
    public TokenType type;
    public int line;
    public int col;

    public Token (TokenType type, int line, int col) {
        this.type = type;
        this.line = line;
        this.col = col;
    }
 
    @Override
    public String toString() {
        return ("token " + this.type + " on " + this.line + ":" + this.col);
    }

}
