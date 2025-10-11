package chapter5;

public class pythagoreanTriples {
    public static void main(String[] args) {

        int maxInt =500;
        System.out.println("PYTHAGOREAN TRIPLES TABLE");
        System.out.println("SIDE 1 \t SIDE 2 \t HYPOTENUSE");


        for (int side1 =1;side1 <=maxInt; side1++){
          for (int side2 =side1;side2<=maxInt;side2++) {
              for (int hypotenuse = side2;hypotenuse<= maxInt;hypotenuse++){
                  if(side1 * side1+side2*side2==hypotenuse*hypotenuse){
                      System.out.println(side1+"\t\t\t"+side2+"\t\t\t"+hypotenuse);
                  }

              }
          }

        }
    }
}
