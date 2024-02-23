package fr.ecole3il.buvette;

public enum Boisson {
    BIERE("leffe", [Ingredient.BIERE]),
    CIDRE("gorvello", [Ingredient.CIDRE]),
    VRAI_CIDRE("fossey", [Ingredient.VRAI_CIDRE]),
    GT("gt", [Ingredient.GIN, Ingredient.TONIC, Ingredient.JET_27]),
    SPECIAL_BACARDI("special bacardi", [Ingredient.GIN, Ingredient.GRENADINE, Ingredient.JUS_DE_CITRON, Ingredient.RHUM]);

    private String nom;
    private int prix;
    private Ingredient[] ingredients;

    Boisson(String nom, Ingredient... ingredients) {
        this.nom = nom;
        this.prix = 0;
        if (ingredients.length != 0) {
            for (Ingredient ingredient : ingredients) {
                this.prix += ingredient.getUnite();
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public boolean discount() {
        switch (this) {
            case BIERE:
            case CIDRE:
            case VRAI_CIDRE:
                return true;
            default:
                return false;
        }
    }
}
