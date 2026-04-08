public abstract class AbsPet implements Pet{
    private String name;
    private int age;
    public AbsPet(String name, int age){
        this.name=name;
        this.age=age;
    }
    public AbsPet(){

    }
    public void setAge(int age){
        assert age >= 0 : "age must not be negative";
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
     
    @Override
    public String toString() {
        return String.format("%s (%d)", this.name, this.age);
    }
    public  void greet(){
        IO.println(toString()+": "+getSound());
    }
    protected abstract String getSound();
    public abstract int getAgeInHumanYears();
    
}
