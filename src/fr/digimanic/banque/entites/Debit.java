package fr.digimanic.banque.entites;

public class Debit extends Operation{
    @Override
    public String getType() {
        return "DEBIT";
    }

    public Debit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public double montantGlobal() {
        return montant = montant - this.getMontantOperation();
    }
}
