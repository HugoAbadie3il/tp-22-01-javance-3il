package fr.ecole3il.buvette;

public class Client {
    private final boolean etudiant;

    public Client(boolean etudiant) {
        this.etudiant = etudiant;
    }

    public boolean isEtudiant() {
        return etudiant;
    }
}
