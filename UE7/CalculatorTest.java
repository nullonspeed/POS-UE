void main(){
    IO.println("Scanner test");
    IO.println("arithmetic expression > ");
    String line = IO.readln();
    Scanner scanner = new Scanner(line);
    Calculator calculator = new Calculator(scanner);
    calculator.calculate();
}