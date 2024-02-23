package fr.ecole3il.buvette;

public class Buvette {
    private Client client;
    private int quantite;
    private Boisson boisson;

    public Buvette(Client client, int quantite, Boisson boisson) {
        this.client = client;
        this.quantite = quantite;
        this.boisson = boisson;
    }

    public int getPrix() throws RuntimeException{
        if ((boisson == Boisson.GT || boisson == Boisson.SPECIAL_BACARDI) && quantite > 2) {
            throw new RuntimeException("Trop de boissons, maximum 2");
        }
        int prix = boisson.getPrix() * quantite;
        if (client.isEtudiant() && boisson.reduction()) {
            prix -= prix * 0.1;
        }
        return prix;
    }
}
