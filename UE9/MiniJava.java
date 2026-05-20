import java.io.*;

public class MiniJava {
    public static void main(String[] args) {
        String sourceFileName = null;
        BufferedReader sourceFileReader = null;

        IO.println("MiniJava v 0 (2026)");
        do {
            IO.print("source file name > ");
            try {
                sourceFileName = IO.readln();
                sourceFileReader = new BufferedReader(new FileReader(sourceFileName));
            } catch(IOError e) {
                IO.println("error: invalid file");
                continue;
            } catch(FileNotFoundException e) {
                IO.println("error: source file not found!");
            }
        } while(sourceFileReader == null);

        Scanner scanner = new Scanner(sourceFileReader);
        
        IO.print("select operation mode: (s)can, (p)arse, (i)nterpret: ");
        char mode = IO.readln().charAt(0);
        switch(mode) {
            case 's':
                while(scanner.sy != Symbol.EOF && scanner.sy != Symbol.ERROR)
                    scanner.nextSy();
                IO.println("--- scan complete ---");
                break;
            case 'p':
                // PARSE!
                break;
            case 'i':
                // INTERPRET!
                break;
            default:
                IO.println("error: invalid operation mode!");
        }

    }    
}
