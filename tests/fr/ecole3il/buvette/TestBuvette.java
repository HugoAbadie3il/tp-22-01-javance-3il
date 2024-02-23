package fr.ecole3il.buvette;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Buvette")
public class TestBuvette {

    private Client client = new Client(false);
    private Client etudiant = new Client(true);

    private Ingredient[] recetteGT = {Ingredient.GIN, Ingredient.TONIC, Ingredient.JET_27};
    private Ingredient[] recetteSpecialBacardi = {Ingredient.GIN, Ingredient.GRENADINE, Ingredient.JUS_DE_CITRON, Ingredient.RHUM};

    @Test
    @DisplayName("On Commande une bière, prix de 74.")
    public void testBiere() {
        Buvette buvette = new Buvette(client, 1, Boisson.BIERE);
        Assert.assertEquals(74, buvette.getPrix());
    }

    @Test
    @DisplayName("On Commande un cidre, prix de 103.")
    public void testCidre() {
        Buvette buvette = new Buvette(client, 1, Boisson.CIDRE);
        Assert.assertEquals(103, buvette.getPrix());
    }

    @Test
    @DisplayName("On Commande un vrai cidre, prix de 110.")
    public void testVraiCidre() {
        Buvette buvette = new Buvette(client, 1, Boisson.VRAI_CIDRE);
        Assert.assertEquals(110, buvette.getPrix());
    }

    @Test
    @DisplayName("On Commande un GT, prix de 115.")
    public void testGT() {
        Boisson gt = Boisson.GT;
        Buvette buvette = new Buvette(client, 1, gt);
        Assert.assertEquals(115, buvette.getPrix());
    }

    @Test
    @DisplayName("On Commande un spécial bacardi, prix de 127.")
    public void testSpecialBacardi() {
        Buvette buvette = new Buvette(client, 1, Boisson.SPECIAL_BACARDI);
        Assert.assertEquals(127, buvette.getPrix());
    }
}
