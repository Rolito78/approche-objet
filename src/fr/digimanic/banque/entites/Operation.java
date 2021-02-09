package fr.digimanic.banque.entites;

public abstract class Operation {
    protected String dateOperation;
    protected double montantOperation;
    protected double montant = 1000;
    public abstract String getType();

    public Operation(String dateOperation, double montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public abstract double montantGlobal();
    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(double montantOperation) {
        this.montantOperation = montantOperation;
    }
}
