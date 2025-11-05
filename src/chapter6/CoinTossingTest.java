package chapter6;

public class CoinTossingTest {
    public static void main(String[] args) {
            CoinTossing tossing =new CoinTossing();
            while (true){
                System.out.println("""
                        ========================
                           COIN TOSS PROGRAM
                        ========================""");
                System.out.println("""
                        1. Toss Coin
                        2 .Display results
                        3. Exit
                        Choose an option that suits you:
                        """);
                int option =tossing.getMojo().nextInt();
                switch (option){
                    case 1:
                        tossing.tossCoin();
                        break;

                    case  2:
                        tossing.displayResult();
                        break;

                    case 3:
                            System.exit(0);
                            break;

                    default:
                        System.err.println("Invalid Option,please choose again.");
                }
            }
    }
}
