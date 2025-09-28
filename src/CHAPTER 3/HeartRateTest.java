public class HeartRateTest {
            public static void main(String[] args) {
            HeartRates heart = new HeartRates ("Oluwapelumi","Babatunde","23/03/1999", 23,03,1999); 


            System.out.printf("First name: %s%n Last name: %s%n DOB: %s%n Age: %dyears%n Maximum heartrate: %d%n Target heartrate range: %.2f - %.2f",
                      heart.getFirstName(),heart.getLastName(),heart.getDateOfBirth(),heart.calculateAge(),heart.maximumHeartRate(),heart.targetHeartRateLower(),heart.targetHeartRateUpper());

}

}