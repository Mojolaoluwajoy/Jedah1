package chapter3;

public class Clock {
       private int hour;
       private int minute;
       private int second;

       public Clock (int hour, int minute, int second) {
                  this.hour = hour;
                  this.minute = minute;
                  this.second = second;
}

        public void setHour(int hour) {  
        if (hour > 23) {
                 this.hour = 0;
}   else {
                 this.hour = hour;
}
  }      
        public int getHour() {
                 return hour;
}

         public void setMinute(int minute) {             
         if (minute > 59 ) {
                this.minute = 0;
}       else {
                this.minute = minute;
}
}
          public int getMinute() {
                 return minute;
}
          public void setSecond(int second) {
          if (second > 59) {
                  this.second = 0;                
}          else {
                  this.second = second;
}        
 }     
          public int getSecond() {
                 return second;
}
 
          public void displayTime() {
            if (hour < 10) {
                 System.out.print("0");
}
                 System.out.print(hour);
                 System.out.print(":");
             
             if (minute < 10) {
                 System.out.print("0");
} 
                 
                 System.out.print(minute);
                 System.out.print(":");

             if (second < 10) {
                 System.out.print("0");
}
                 System.out.print(second);
                 

}







}