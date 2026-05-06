import java.io.*;

public class MiniJava {
    public static void main(String [] args){
        String sourceFileName = null;
        BufferedReader sourceFileReader= null;

        IO.println("MiniJava v0 (2026)");
        do {
            IO.print("source file name > ");
            try{

            
            sourceFileName= IO.readln();
            sourceFileReader = new BufferedReader(new FileReader(sourceFileName));

            }
            catch(IOError e){
                IO.println("error:invalid file");

            }
            catch(FileNotFoundException e){
                IO.println("errordino: source file not fundo!");
            }
        }while(sourceFileReader == null);
        
        Scanner scanner = new Scanner(sourceFileReader);

        IO.print("select operation mode: parse, interpret");
        IO.println();
        char mode = IO.readln().charAt(0);
        switch (mode) {
            case 'p':
                
                break;
            case 'i': break;
            case 's': while(scanner.sy!=Symbol.EOF && scanner.sy != Symbol.ERROR)
                scanner.nextSy();
            IO.println("stage comp");break;
        
            default:
                IO.println("invalid operation mode! error");
                break;
        }
    }
    
}
