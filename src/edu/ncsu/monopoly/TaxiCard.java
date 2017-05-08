package edu.ncsu.monopoly;

public class TaxiCard extends Card {

    private final int type;
    int diceValue;

    public TaxiCard( int cardType) {
        this.type = cardType;
    }

    @Override
    public void applyAction() {
        Player currentPlayer = GameMaster.instance().getCurrentPlayer();
        Die dice = new Die();
        diceValue = dice.getRoll();
        GameMaster.instance().movePlayer(currentPlayer, diceValue);
    }

    @Override
    public int getCardType() {
        return type;
    }

    @Override
    public String getLabel() {
        return "Taxi Card, move " + diceValue + " positions";
    }

}
