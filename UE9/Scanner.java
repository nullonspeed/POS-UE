import java.io.*;

public class Scanner {
    private static final char EOF = 0;
    private static final char ERROR = 1;

    private final BufferedReader reader;

    private String line;
    private char ch; // Saves the current character
    private int chLnr, chCnr; // Saves position of the current character.

    public Symbol sy; // Saves the current symbol
    public int syLnr, syCnr; // Start position of current symbol
    public String identStr;
    public int numberVal; 

    public Scanner(BufferedReader reader) {
        this.reader = reader;
        line = "";
        chLnr = 0;
        chCnr = 0;
        nextCh();
        nextSy();
    }

    private void nextCh() {
        try {
            if(line == null) 
                ch = EOF;
            else {
                if(chCnr >= line.length()) {
                    line = reader.readLine();
                    chLnr++;
                    chCnr = 0;
                    ch = ' ';
                } else {
                    ch = line.charAt(chCnr);
                    chCnr++;
                }
            }
        } catch(IOException e) {
            ch = ERROR;
        }
    }

    public void nextSy() {
        while((ch == ' ') || (ch == '\t'))
            nextCh();
        syLnr = chLnr;
        syCnr = chCnr;

        switch(ch) {
            case EOF: sy = Symbol.EOF; break;
            case ERROR: sy = Symbol.ERROR; break;
            case '+': sy = Symbol.PLUS; nextCh(); break;
            case '-': sy = Symbol.MINUS; nextCh(); break;
            case '*': sy = Symbol.TIMES; nextCh(); break;
            case '/': sy = Symbol.DIV; nextCh(); break;
            case '(': sy = Symbol.OPEN_PAR; nextCh(); break;
            case ')': sy = Symbol.CLOSE_PAR; nextCh(); break;
            case '{': sy = Symbol.OPEN_BRACE; nextCh(); break;
            case '}': sy = Symbol.CLOSE_BRACE; nextCh(); break;
            case ',': sy = Symbol.COMA; nextCh(); break;
            case '=': sy = Symbol.ASSIGN; nextCh(); break;
            case ';': sy = Symbol.SEMICOLON; nextCh(); break;
            default:
                if(Character.isLetter(ch)) {
                    StringBuilder sb = new StringBuilder();
                    do {
                        sb.append(ch);
                        nextCh();
                    } while(Character.isLetterOrDigit(ch));
                    identStr = sb.toString();
                    switch(identStr) {
                        case "int": sy = Symbol.INT; break;
                        case "main": sy = Symbol.MAIN; break;
                        case "print": sy = Symbol.PRINT; break;
                        case "read": sy = Symbol.READ; break;
                        case "void": sy = Symbol.VOID; break;
                        default: sy = Symbol.IDENT;
                    }
                } else if(Character.isDigit(ch)) {
                    
                    numberVal = 0;
                    do {
                        numberVal = numberVal * 10 + (ch - '0');
                        nextCh();
                    } while(Character.isDigit(ch));

                    if(ch == ' ' || ch == ';') {
                        sy = Symbol.NUMBER;
                    } else {
                        sy = Symbol.ERROR;
                    }
                } else {
                    sy = Symbol.ERROR;
                }
            
        }
        IO.println("Scanner: sy = " + sy + ", syLnr = " + syLnr + ", syCnr = " + syCnr);
    }

}
