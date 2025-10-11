package chapter3;

public class HealthProfile {
            private String firstName;
            private String lastName;
            private String gender;
            private String dateOfBirth;
            private int dayOfBirth;
            private int monthOfBirth;
            private int yearOfBirth;
            private int height;
            private int weight;
 
            public HealthProfile(String firstName,String lastName,String gender,String dateOfBirth,int dayOfBirth,int monthOfBirth,int yearOfBirth,int height,int weight) {

                                this.firstName =firstName;
                                this.lastName =lastName;
                                this.gender =gender;
                                this.dateOfBirth=dateOfBirth;
                                this.dayOfBirth=dayOfBirth;
                                this.monthOfBirth=monthOfBirth;
                                this.yearOfBirth=yearOfBirth;
                                this.height =height;
                                this.weight =weight;

}

           public void setFirstName(String firstName) {
                               this.firstName = firstName;
}
           public String getFirstName () {
                               return firstName;
}

           public void setLastName(String lastName) {
                               this.lastName =lastName;
}
           public String getLastName () {
                               return lastName;
}

           public void setGender(String gender) {
                              this.gender =gender;

}
           public String getGender() {
                             return gender;
}

           public void setDateOfBirth(String dateOfBirth) {
                             this.dateOfBirth=dateOfBirth;

}
          public String getDateOfBirth() {
                            return dateOfBirth;
}
       
          public void setDayOfBirth(int dayOfBirth) {
                             this.dayOfBirth=dayOfBirth;

}
          public int getDayOfBirth() {
                            return dayOfBirth;
}

           public void setMonthOfBirth(int monthOfBirth) {
                             this.monthOfBirth=monthOfBirth;

}
          public int getMonthOfBirth() {
                            return monthOfBirth;
}

          public void setYearOfBirth(int yearOfBirth) {
                             this.yearOfBirth=yearOfBirth;

}
          public int getYearOfBirth() {
                            return yearOfBirth;
}
           public void setHeight(int height) {
                             this.height = height;
}
          public int getHeight() {
                            return height;
}
           public void setWeight(int weight) {
                             this.weight=weight;
}
          public int getWeight() {
                            return weight;
}
          public int calculateAge() {
                           return 2025 - yearOfBirth;
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

        public double bmi() {
                      return (weight * 730) / (height * height);
}








}