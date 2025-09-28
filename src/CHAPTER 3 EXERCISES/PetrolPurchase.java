public class PetrolPurchase {
         private String stationLocation;
         private String petrolType;
         private int petrolQuantity;
         private double pricePerLiter;
         private double percentageDiscount;
         private double purchaseAmount;

         public PetrolPurchase(String stationLocation,String petrolType,int petrolQuantity, double pricePerLiter,double percentageDiscount) {
                this.stationLocation = stationLocation;
                this.petrolType = petrolType;
                this.petrolQuantity= petrolQuantity;
                this.pricePerLiter = pricePerLiter;
                this.percentageDiscount =percentageDiscount;
                this.purchaseAmount = purchaseAmount;
                this.purchaseAmount = petrolQuantity * pricePerLiter * (1- (percentageDiscount/100));

}

         public void setStationLocation(String stationLocation) {
                this.stationLocation = stationLocation;
}
 
         public String getStationLocation() {
                return stationLocation;

}

         public void setPetrolType(String petrolType) { 
                 this.petrolType = petrolType;

}
         public String getPetrolType() {
                 return petrolType;

}

         public void setPetrolQuantity(int petrolQuantity) {
                this.petrolQuantity= petrolQuantity;
}

         public int getPetrolQuantity() {
                return petrolQuantity;
}


          public void setPricePerLiter(int pricePerLiter) {
                this.pricePerLiter = pricePerLiter;
}
           
          public double getPricePerLiter() {
                return pricePerLiter;
}

          public void setPercentageDiscount(int percentageDiscount) {
                this.percentageDiscount =percentageDiscount;
}

          public double getPercentageDiscount() {
                return percentageDiscount;

}

         
        public double getPurchaseAmount() {
                  return purchaseAmount;

}
              








}