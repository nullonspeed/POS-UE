public class Scanner {
    private static final char EOL = 0;

    private final String line;
    private char ch;
    private int chPos;

    public Symbol sy;
    public int syPos;
    public int numberVal;
    
    public Scanner(String line){
        this.line=line;
        this.chPos=0;
        nextCh();
        nextSy();
         
    }
    private void nextCh(){
        if(chPos == line.length()){
            ch = EOL;
        }
        else{

            this.ch=line.charAt(chPos);
            chPos++;
        }
    }
    public void nextSy(){
       while((ch== ' ' || (ch == '\t'))){
           nextCh();
       }    
       syPos = chPos;

       switch (ch) {
           case EOL:sy=Symbol.EOL;break;
           case '+':sy=Symbol.PLUS;nextCh();break;
           case '-':sy=Symbol.MINUS;nextCh();break;
           case '*':sy=Symbol.TIMES;nextCh();break;
           case '/':sy=Symbol.DIV;nextCh();break;
           case '(':sy=Symbol.OPEN_PAR;nextCh();break;
           case ')':sy=Symbol.CLOSE_PAR;nextCh();break;
           default:
            if(Character.isDigit(ch)){
                sy = Symbol.NUMBER;
                numberVal = 0;
                do{
                   numberVal= numberVal*10+(ch-'0');
                   nextCh();
                }while(Character.isDigit(ch));
            }
            else {
                sy = Symbol.ERROR;
            }
            break;
       }
       IO.println(String.format("scanner: sy = %s, syCnr = %d", sy, syPos));
       if(sy==Symbol.NUMBER){
        IO.println(", numberVal = "+ numberVal);
       }
    }
}
