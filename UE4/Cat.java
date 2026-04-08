public class Cat extends AbsPet {

    public Cat(String name, int age){
        super(name, age);
        
    }
    
    @Override
    public int getAgeInHumanYears(){
        switch (getAge()) {
            case 0: return 0;
            case 1: return 15;
            case 2: return 21;
            case 3: return 27;

            default: return 31 + (getAge()-4)*4;  
        }
    }
    @Override
    protected String getSound() {
        return "Michauchi";
    }
}
