package chapter8.exercises.setOfIntegers;

public class IntegerSet {
    private boolean [] set=new boolean[101];

    public IntegerSet(){

    }

    public void isTrue(int index,int number){
        if (number>=0 && number<=100){
            set[index]=true;
        }
    }
    public void isFalse(int index,int number){
        if ( number<0||number>100){
            set[index]=false;
        }
    }
    public boolean[] getArray(){
        return set;
    }
}
