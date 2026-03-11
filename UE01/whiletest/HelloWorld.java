/* HelloWorld:                                                               */
/* -----------                                                               */
/* Your first program in Java.                                               */
/* ========================================================================= */

void main() {
    int sum =0;
    int numbers =0;
    
    IO.println("schreibe eine zahl wie ein loewe ");
    int tempNumbers = 0;
    while (tempNumbers == 0) {
        tempNumbers = readint();
    }
    while ( tempNumbers != 0){
        sum += tempNumbers;
        numbers++;
        IO.print("number > eingeben bro oda 0 zum abbrechen");
        tempNumbers= readint();
    }
    if ( numbers == 0){
        IO.println("esel");
    }
    else{
        double resolut = (double) sum / numbers;
        IO.println(resolut);  
    }
     
}
int readint(){
    
    String t1 = IO.readln();
    int temp = 0;
    try {
            temp = Integer.parseInt(t1);

    } catch (Exception e) {
        IO.println("a Zahl du Esel");
        System.exit(temp);
    }
    return temp;
}
