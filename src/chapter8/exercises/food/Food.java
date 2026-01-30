package chapter8.exercises.food;

public enum Food {
    APPLE("Fruit",50),
    BANANA("Fruit",60),
    CARROT("Vegetables",70);

    private final String type;
    private final int  numberOfCalories;
       Food(String type,int numberOfCalories){
           this.type=type;
           this.numberOfCalories=numberOfCalories;
       }
       public String getType(){
           return type;
       }
       public int getNumberOfCalories(){
           return numberOfCalories;
       }
}
