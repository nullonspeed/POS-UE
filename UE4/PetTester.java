void main(){
    AbsPet[]pets = new AbsPet[4];
    Cat c1 = new Cat("Minki", 2);
    Dog d1= new Dog("Wuffels", 5);
    Dog d2= new Dog("Salami", 3);
    Cat c2 = new Cat("Bernd", 2);


    pets[0]= c1;
    pets[1]= d1;
    pets[2]=c2;
    pets[3]=d2;
    //List list = new ArrayList(Arrays.asList(pets));
    //list.add(new Dog("Bellum, 2"));
    /*for(Object o :list){}
  io.println(o);*/

  for(AbsPet pet:pets){
    pet.greet();
    IO.println(pet.getAgeInHumanYears()+"");
  }
}


