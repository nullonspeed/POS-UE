void main() {
    IO.println("Gib positive Ganzzahlen ein (beendet mit 0).");

    int capacity = 5;
    int[] values = new int[capacity];

    int count = 0;
    int sum = 0;

    IO.print("wert > ");
    int v = readInt();
    //größer 0 nicht größer klein
    while (v > 0) {
        
        //kleiner nicht kleiner = gleich, lenght ist immer last el id +1
        //kein read
        if (count < values.length) {
            values[count] = v;
        }

        sum += v;
        count++;
        v=readInt();

        if (count == values.length) {
            int[] bigger = new int[values.length * 2];
            // <= wieder große problem derf ned sein
            for (int i = 0; i < values.length; i++) { 
                bigger[i] = values[i];
            }
            values = bigger;
        }
    }
    // müsste != 0 sein sonst fehler wenn es nicht 0 ist und sollen wir nach dem ersten read int haben aber mit assert für v != 0
    assert count != 0 : "keine Werte eingegeben!";
    // - 1 stimmt nicht, count ist nicht gößer als die anzahl
    // cast of double
    double mean =(double) sum / (count);

    int max = 0; 
   //das oder length -1
    for (int i = 0; i < count; i++) { 
        if (values[i] > max) max = values[i];
    }

    IO.println("Count: " + count);
    IO.println("Sum:   " + sum);
    IO.println("Mean:  " + mean);
    IO.println("Max:   " + max);
}

// Helper Methode
int readInt() {
    String line = IO.readln();
    return Integer.parseInt(line);
    //no try catch
}
