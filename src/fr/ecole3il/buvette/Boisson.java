package fr.ecole3il.buvette;

public enum Boisson {
    BIERE("leffe", new Ingredient[] {Ingredient.BIERE}),
    CIDRE("gorvello", new Ingredient[]{Ingredient.CIDRE}),
    VRAI_CIDRE("fossey", new Ingredient[] {Ingredient.VRAI_CIDRE}),
    GT("gt", new Ingredient[] {Ingredient.GIN, Ingredient.TONIC, Ingredient.JET_27}),
    SPECIAL_BACARDI("special bacardi", new Ingredient[]{Ingredient.GIN, Ingredient.GRENADINE,
                                                            Ingredient.JUS_DE_CITRON, Ingredient.RHUM});

    private String nom;
    private int prix;
    private Ingredient[] ingredients;

    Boisson(String nom, Ingredient... ingredients) {
        this.nom = nom;
        this.prix = 0;
        int prixIngredient;
        if (ingredients.length != 0) {
            for (Ingredient ingredient : ingredients) {
                prixIngredient = ingredient.getUnite();
                this.prix += (nom.equals("special bacardi") && ingredient.equals(Ingredient.GIN) ?
                        prixIngredient / 2 : prixIngredient);
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public boolean reduction() {
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
