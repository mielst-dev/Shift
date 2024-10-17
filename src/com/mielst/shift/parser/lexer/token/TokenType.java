package com.mielst.shift.parser.lexer.token;

public enum TokenType {

    // Defaults

    INTNUMBER,
    DOUBLENUMBER,
    FLOATNUMBER,
    IDENTIFIER,
    LITERAL,

    TYPE,

    // Symbols

    PLUS, // +
    MINUS, // -
    STAR, // *
    DIV, // /
    PERCENT, // %
    PLUSEQ, // +=
    MINUSEQ, // -=
    STAREQ, // *=
    DIVEQ, // /=
    PERCENTEQ, // %=
    PLUSPLUS, // ++
    MINUSMINUS, // --
    DIVDIV, // //
    DIVSTAR, // /*
    STARDIV, // */

    DOT, //.
    DOTDOT, // ..
    COMMA, // ,
    COLON, // :
    COLONCOLON, // ::
    SEMICOLON, // ;

    EQ, // =
    EQEQ, // ==
    NEQ, // !=
    GT, // >
    LT, // <
    GTEQ, // >=
    LTEQ, // <=
    GTGT, // >>
    LTLT, // <<

    AT, // @
    AND, // &
    ANDAND, // &&
    BAR, // |
    BARBAR, // ||
    TILDE, // ~
    CARET, // ^

    LPAR, // (
    RPAR, // )
    LBRACKET, // [
    RBRACKET, // [
    LBRACE, // {
    RBRACE, // }

    // Keywords

    AS,
    IN,
    IF,
    IS,
    PACKAGE,
    IMPORT,
    TRUE,
    FALSE,
    GLOBAL,
    NULL,
    CONST,
    VAR,
    ELSE,
    SWITCH,
    CASE,
    FOR,
    WHILE,
    DO,
    REPEAT,
    BREAK,
    CONTINUE,
    FUNC,
    RETURN,
    CLASS,
    INTERFACE,
    ENUM,
    RECORD,
    ANNOT,
    TRY,
    CATCH,
    THROW,    
}