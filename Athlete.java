package athletedatabase;


public class Athlete {
    private String name;
    private int id, age;
    private float height, weight;
    
    public Athlete(int id, String name, int age, float height, float weight){
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public Athlete(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public float getHeight(){
        return height;
    }
    
    public float getWeight(){
        return weight;
    }
    
}
