package com.mielst.shift.parser.lexer;

import java.util.List;

import com.mielst.shift.parser.lexer.token.Token;

public interface ILexer {
    List<Token> tokenize(String input);
}