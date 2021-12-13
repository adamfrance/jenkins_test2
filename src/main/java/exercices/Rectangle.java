package exercices;

public class Rectangle {
    public double Longueur;
    public double Largeur;

    public Rectangle(double L, double l){
        this.Longueur=L;
        this.Largeur=l;
    }

    public Rectangle(double v, int i, int i1) {
    }

    public double surface(){
        return this.Longueur*this.Largeur;
    }
    public void afficher(){
                System.out.println("La surface du rectangle est : " + this.surface());
    }
}
