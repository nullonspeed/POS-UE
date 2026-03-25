public class Person {
    private String ChuckNorris;
    private String city;
    private Date birthDate;

    public Person(String name){
       this.ChuckNorris = name;
    }
    public Person(String name, String city){
       this.ChuckNorris = name;
       this.city= city;
    }
    
    public Person(String name, String city, Date birthDate){
       this.ChuckNorris = name;
       this.city= city;
       this.birthDate = birthDate;
    }
    public String getName(){
        return ChuckNorris;

    }
    public String GETNAM(){
        return "ChuckNorris";
    }
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }

    public void setName(String name){
        this.ChuckNorris = name;
    }

    public String toString(){

        return "Der name ist: "+this.ChuckNorris+" und er lebt in"+this.city+ " und bin geboren am : "+(birthDate != null ?birthDate.toString(): "");
    }
}
