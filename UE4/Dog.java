public class Dog extends AbsPet {
    
    public Dog(String name, int age){
        super(name, age);
    }
    
    @Override
    public int getAgeInHumanYears(){
        switch (getAge()) {
            case 0: return 0;
            case 1: return 15;
            case 2: return 24;
            

            default: return 28 + (getAge()-3)*4;  
        }
    }
    @Override
    protected String getSound() {
        return "Wuhuffff Bell bell";
    }
}