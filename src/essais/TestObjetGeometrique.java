package essais;

import Interface.ObjetGeometrique;
import entites.Cercle;
import entites.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] objetGeometriques = new ObjetGeometrique[2];
        objetGeometriques[0] = new Cercle(2);
        objetGeometriques[1] = new Rectangle(4,6);
        for (ObjetGeometrique objetGeometrique : objetGeometriques) {
            System.out.println("Le périmetre est : "+objetGeometrique.perimetre()+" et la surface est : "+objetGeometrique.surface());
        }
    }


}
