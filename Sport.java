package athletedatabase;

public class Sport {
    private int id, type;
    private String name;
    
    public Sport(){}
    
    public Sport(int id, String name, int type){
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    public Sport(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getType(){
        return type;
    }
}
