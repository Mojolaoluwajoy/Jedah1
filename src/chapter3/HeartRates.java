package chapter3;

public class HeartRates {
         private String firstName;
         private String lastName;
         private String dateOfBirth;
         private int dayOfBirth;
         private int monthOfBirth;
         private int yearOfBirth;

         public HeartRates(String firstName,String lastName,String dateOfBirth,int dayOfBirth,int monthOfBirth,int yearOfBirth) {
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.dateOfBirth = dateOfBirth;
                    this.dayOfBirth = dayOfBirth;
                    this.monthOfBirth = monthOfBirth;
                    this.yearOfBirth = yearOfBirth;
                      
}
          public void setFirstName(String firstName) {
                   this.firstName = firstName;

}               
         public String getFirstName() {
                  return firstName;

}    
         public void setLastName(String lastName) {
                 this.lastName = lastName;

}
        public String getLastName() {
                return lastName;
 
}
        public void setDateOfBirth (String dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
}
       public String getDateOfBirth() {
                return dateOfBirth;
       
} 
       public void setDayOfBirth (int dayOfBirth) {
                this.dayOfBirth = dayOfBirth;
}
       public int getDayOfBirth() {
                return dayOfBirth;

}
       public void setMonthOfBirth (int monthOfBirth) {
                this.monthOfBirth = monthOfBirth;
}
       public int getMonthOfBirth() {
                return monthOfBirth;
}
       public void setYearOfBirth (int YearOfBirth) {
                this.yearOfBirth = yearOfBirth;
}
       public int getYearOfBirth() {
                return yearOfBirth;
}
        
       public int calculateAge() {
               return 2025- yearOfBirth;
}
       public int maximumHeartRate() {
               return 220 - calculateAge();

}
       public double targetHeartRateLower() {
               return maximumHeartRate() * 0.5;

}
      public double targetHeartRateUpper() {
               return maximumHeartRate() * 0.85;


}
     




}