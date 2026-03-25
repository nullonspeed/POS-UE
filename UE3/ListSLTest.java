void main(){
    ListSL list = new ListSL();
    IO.println("Singly-linked List Test");
    IO.println("---");
    IO.println("commands: a(ddFirst), c(ontains), (a)p(pend), s(ize), e(cho), (e)x(it)");
    char cmd = 'x';
    do{
        IO.println("enter a command > ");
        cmd=IO.readln().toLowerCase().charAt(0);
        String s;
        switch (cmd) {
            case 'a':
                IO.println("newe string >");
                s = IO.readln();
                list.addFirst(s);
                break;
            case 'e':
                IO.println(list.toString());
                break;
            case 'p':
                IO.println("newe string >");
                s = IO.readln();
                list.append(s);            
                break;
                case 's':
                    IO.println(list.size());
                    break;
                case 'c':
                    IO.println("contains >");
                    s =  IO.readln();
                    boolean resulst = list.contains(s);
                    IO.println(resulst?"found":"value not found");
                    break;
                case 'x':
                    IO.println("bychi");
                    break;
                default:
                    IO.println("najo mandi, des wor foisch");
                break;
        }
       
    } while(cmd!='x');

}
