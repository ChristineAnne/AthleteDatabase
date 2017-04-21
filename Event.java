package athletedatabase;

public class Event {
    private int athleteID, sportID, day, year;
    private String name, venue, month, time;
    
    private int hour, minute;
    private String schedule;
    
    public Event(int aID, int sID, String name, String venue, String month, int day, int year, String time){
        athleteID = aID;
        sportID = sID;
        this.day = day;
        this.year = year;
        this.name = name;
        this.venue = venue;
        this.month = month;
        this.time = time;
    }
    
    public Event(String month, int day, int year, int hour, int minute, String schedule){
        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.schedule = schedule;
    }
    
    public int getAthleteID(){
        return athleteID;
    }
    
    public int getSportID(){
        return sportID;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getMonth(){
        return month;
    }
    
    public String getName(){
        return name;
    }
    
    public String getVenue(){
        return venue;
    }
    
    public String getTime(){
        return time;
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
}
