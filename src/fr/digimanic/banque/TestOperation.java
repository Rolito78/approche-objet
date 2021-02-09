package fr.digimanic.banque;

import fr.digimanic.banque.entites.Credit;
import fr.digimanic.banque.entites.Debit;
import fr.digimanic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("11/02/21",2000);
        operations[1] = new Credit("12/02/21",3000);
        operations[2] = new Debit("13/02/21",4000);
        operations[3] = new Debit("14/02/21",5000);

        double res = 0;
        for(Operation operation : operations){

            System.out.println(operation.getDateOperation()+" "+operation.getMontantOperation()+" "+operation.getType());
            System.out.println(operation.montantGlobal());
        }




    }
}
