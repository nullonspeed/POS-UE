void main(){
    
    Eingabe eng = new Eingabe();
    IO.println("n > ");
    int n = eng.readint();
    IO.println(" exp > ");
    int exp = eng.readint();
    int p = 1;
    for (int i = 0; i < exp; i++) {
        p *= n;
    }
    IO.println("n = "+p +" exp= "+ exp + " =" + p);
 
}