public class Calculator{
    private final Scanner scanner;
    public Calculator(Scanner scanner){
        this.scanner=scanner;
    }
    public void calculate(){
        try{
            int e = Expr();
            if(scanner.sy != Symbol.EOL){
                throw new SyntaxError("EOL expected");
            }
            IO.println("result: "+e);

        }
        catch(SyntaxError se){
            IO.println("syntax error in column "+scanner.syPos);
            if(se.getMessage()!=null){
                IO.println(": "+se.getMessage());
            }
            IO.println();
        }
    }
    private int Expr(){
        int e = Term();
        while (scanner.sy == Symbol.PLUS || scanner.sy == Symbol.MINUS) {
            if(scanner.sy == Symbol.PLUS){
                scanner.nextSy();
                
                int t = Term();
                e=e+t;
            }
            else{
                scanner.nextSy();
                int t= Term();
                e= e -t;
        
            }

        }
        return e;

    }
    private int Term(){
        int t = Fact();
        while (scanner.sy == Symbol.TIMES || scanner.sy == Symbol.DIV) {
            if(scanner.sy == Symbol.TIMES){
                scanner.nextSy();
               int f= Fact();
               t=t*f;
            }
            else{
                scanner.nextSy();
                int f = Fact();
                t=t/f;

            }
        }
        return t;
        
    }
    private int Fact(){
        int f;
        switch (scanner.sy) {
            case NUMBER:f=scanner.numberVal; scanner.nextSy();break;
            case OPEN_PAR:scanner.nextSy();f=Expr();
            if(scanner.sy != Symbol.CLOSE_PAR){
                throw new SyntaxError(") is expected!");
            }
            scanner.nextSy();
            break;
        
            default:
                throw new SyntaxError("number or ( is expected !");
                
        }
        return f;
    }
}