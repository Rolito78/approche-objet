package fr.digimanic.banque.entites;

public class Credit extends Operation{

    @Override
    public String getType() {
        return "CREDIT";
    }

    public Credit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public double montantGlobal() {
        return montant = montant + this.getMontantOperation();
    }




}
