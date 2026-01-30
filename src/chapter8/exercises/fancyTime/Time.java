package chapter8.exercises.fancyTime;

public class Time {
    private int hour;
    private int minute;
    private int second;
    String meridian;

    public Time(int hour,int minute,int second,String meridian){
        if (hour<0||hour>=24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        if (minute<0||minute>=60){
            throw new IllegalArgumentException("minute must be 0-59");
        } if (second<0|second>=60){
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.hour=hour;
        this.minute=minute;
        this.second=second;
       this.meridian=meridian;
    }
    public Time(int hour,int minute,int second){
        this(hour,minute,second,null);
    }
    public Time(int hour,int minute){
        this(hour,minute,0,null);
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour()==0 || getHour()==12)?12:getHour()%12),getMinute(),getSecond(),(getHour()<12? "AM":"PM"));
    }
    public String toUniversalString(){
        return  String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }

    }


