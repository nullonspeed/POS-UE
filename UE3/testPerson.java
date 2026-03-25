void main(){
    Person p = new Person("name");
    Person p2 = new Person("Chuck","jonaeh");
    Person p3 = new Person("Chuck Norris", "Falsch", new Date(32, 13, 0));

    p.setCity("ja");
    IO.println(p.toString());
    IO.print(p3.toString());
    
    Date d1 = new Date(25, 3, 2026);
    
    Date d2 = new Date(25, 3, 2026);
    
    IO.println("d1==d2?"+(d1==d2));
}    
    

