package fr.ecole3il.buvette;

public enum Ingredient {
    RHUM(65),
    GRENADINE(10),
    JUS_DE_CITRON(10),
    JET_27(10),
    TONIC(20),
    GIN(85),
    BIERE(74),
    CIDRE(103),
    VRAI_CIDRE(110);

    private int unite;

    Ingredient(int unite) {
        this.unite = unite;
    }

    public int getUnite() {
        return unite;
    }
}
