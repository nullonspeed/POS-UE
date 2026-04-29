void main(){
    //17 +4 --> korrekte Syntax
    // 14 * -> falsche syntax
    IO.println("Scanner test");
    IO.println("arithmetic expression > ");
    String line = IO.readln();
    Scanner scanner = new Scanner(line);
    while((scanner.sy !=Symbol.EOL)&& (scanner.sy != Symbol.ERROR)){
        scanner.nextSy();
    }
    if(scanner.sy==Symbol.EOL){
        IO.println("Scanning successfully Completed!");
    } else {
        IO.println(String.format("Scanning with error at sy =%s, syCnr = %d", scanner.sy, scanner.syPos));
    }
}