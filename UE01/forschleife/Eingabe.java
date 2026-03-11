public class Eingabe {
    public void Eingabe(){
        
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

}