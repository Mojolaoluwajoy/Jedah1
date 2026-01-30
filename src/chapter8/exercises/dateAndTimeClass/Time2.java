
package chapter8.exercises.dateAndTimeClass;

public class Time2 {
    private int hour;
    private int minute;
    private int second;
    Date date = new Date(11,30,2000);

    public Time2(){
     this(0,0,0);
    }
    public Time2(int hour){
        this(hour,0,0);
    }
    public Time2(int hour, int minute){
        this(hour,minute,0);
    }
    public Time2(int hour, int minute, int second){
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
    }
    public Time2(Time2 time){
       this(time.hour,time.minute,time.second) ;
    }
    public void setTime(int hour,int minute,int second){
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

    }
    public void setHour(int hour){
        if (hour<0||hour>=24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour=hour;
    }

    public void setMinute(int minute) {
        if (minute<0||minute>=60){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second<0|second>=60){
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.second = second;
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

    public  void incrementHour(){
        hour+=1;
        if (getHour()>23){
            date.nextDay();
        }
    }public  void incrementMinute(){
         minute+=1;
     }
    public void tick(){
       incrementHour();
         if (second>=59){
            minute+=1;
            second=0;
        }
        if (minute>59){
            hour+=1;
            minute=0;
        }
      if (hour>23){
          hour=0;
      }


    }
    public String toUniversalString(){
        return  String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
    }

    public String toString() {
        return String.format(date.toString()+"%n%d:%02d:%02d %s",
                ((getHour()==0 || getHour()==12)?12:getHour()%12),getMinute(),getSecond(),(getHour()<12? "AM":"PM"));
    }

}
