package chapter3;

public class Car {
             private String model;
             private String year;
             private double price;
             private double percentageDiscount1;
             private double percentageDiscount2;
             private double firstLastPrice;
             private double secondLastPrice;
             

             public Car(String model,String year, double price,double percentageDiscount1,double percentageDiscount2) {
                     this.model = model;
                     this.year = year;
                     this.price = price;
                     this.percentageDiscount1 = percentageDiscount1;
                     this.percentageDiscount2 = percentageDiscount2; 
                     this.firstLastPrice = price * (1-(percentageDiscount1/100) );
                     this.secondLastPrice = price * (1-(percentageDiscount2/100));

}

            public void setModel(String model) {
                     this.model = model;

}

            public String getModel() {
                    return model;

}           
              
            public void setYear(String year) {
                    this.year =year;

}

            public String getYear() {
                   return year;

 }

           public void setPrice(double price) {
                   this.price = price;

}

            public double getPrice() {
                   return price;
}
           public void setPercentageDiscount1(double percentageDiscount1) {
                  this.percentageDiscount1 = percentageDiscount1;

}
          public double getpercentageDiscount1 () {
                   return percentageDiscount1;

}
         
           public void setPercentageDiscount2(double percentageDiscount2) {
                  this.percentageDiscount2 = percentageDiscount2;

}
          public double getpercentageDiscount2 () {
                   return percentageDiscount2;

}
                 



          public double getFirstLastPrice() {
                        return firstLastPrice;

}
                       


          public double getSecondLastPrice() {
                        return secondLastPrice;

}



}