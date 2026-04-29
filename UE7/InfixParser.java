public class InfixParser {
    private final Scanner scanner;

    public InfixParser(Scanner scanner) {
        this.scanner=scanner;

    }

    public void parse(){
        try{
            Expr();
            if(scanner.sy != Symbol.EOL){
                throw new SyntaxError("EOL expected");
            }
            IO.println("");

        }
        catch(SyntaxError se){
            IO.println("syntax error in column "+scanner.syPos);
            if(se.getMessage()!=null){
                IO.println(": "+se.getMessage());
            }
            IO.println();
        }
    }
    private void Expr(){
        Term();
        while (scanner.sy == Symbol.PLUS || scanner.sy == Symbol.MINUS) {
            if(scanner.sy == Symbol.PLUS){
                scanner.nextSy();
                Term();
            }
            else{
                scanner.nextSy();
                Term();
        
            }

        }

    }
    private void Term(){
        Fact();
        while (scanner.sy == Symbol.TIMES || scanner.sy == Symbol.DIV) {
            if(scanner.sy == Symbol.TIMES){
                scanner.nextSy();
                Fact();
            }
            else{
                scanner.nextSy();
                Fact();

            }
        }
    }
    private void Fact(){
        switch (scanner.sy) {
            case NUMBER: scanner.nextSy();break;
            case OPEN_PAR:scanner.nextSy();Expr();
            if(scanner.sy != Symbol.CLOSE_PAR){
                throw new SyntaxError(") is expected!");
            }
            scanner.nextSy();
            break;
        
            default:
                throw new SyntaxError("number or ( is expected !");
                
        }
    }
}
