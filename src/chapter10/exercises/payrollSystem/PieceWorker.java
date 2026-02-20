package chapter10.exercises.payrollSystem;

public class PieceWorker extends Employee{
    private double wage;
    private int pieces;

    public PieceWorker(String firstName,String lastName,String socialSecurityNumber,double wage,int pieces){
        super(firstName,lastName,socialSecurityNumber);
        if (pieces>500){
            throw new IllegalArgumentException("Pieces cannot exceed 500");
        }
        this.pieces=pieces;
        this.wage=wage;


    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }

    @Override
    public double earnings() {
        return getPieces()*getWage();
    }

    @Override
    public String toString() {
        return String.format("PieceWorker %s%n%s: %d%n%s: $%,.2f" ,super.toString(), "pieces=",getPieces(),"wage=",getWage() );

    }
}
