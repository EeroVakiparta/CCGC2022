public class Pelaaja {
    int playerLocation; // id of the zone in which the player is located
    int playerScore;
    int playerPermanentDailyRoutineCards; // number of DAILY_ROUTINE the player has played. It allows them to take cards from the adjacent zones
    int playerPermanentArchitectureStudyCards; // number of ARCHITECTURE_STUDY the player has played. It allows them to draw more cards

    public Pelaaja(int playerLocation, int playerScore, int playerPermanentDailyRoutineCards, int playerPermanentArchitectureStudyCards) {
        this.playerLocation = playerLocation;
        this.playerScore = playerScore;
        this.playerPermanentDailyRoutineCards = playerPermanentDailyRoutineCards;
        this.playerPermanentArchitectureStudyCards = playerPermanentArchitectureStudyCards;
    }

    public int getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getPlayerPermanentDailyRoutineCards() {
        return playerPermanentDailyRoutineCards;
    }

    public void setPlayerPermanentDailyRoutineCards(int playerPermanentDailyRoutineCards) {
        this.playerPermanentDailyRoutineCards = playerPermanentDailyRoutineCards;
    }

    public int getPlayerPermanentArchitectureStudyCards() {
        return playerPermanentArchitectureStudyCards;
    }

    public void setPlayerPermanentArchitectureStudyCards(int playerPermanentArchitectureStudyCards) {
        this.playerPermanentArchitectureStudyCards = playerPermanentArchitectureStudyCards;
    }

    @Override
    public String toString() {
        return "Pelaaja{" +
                "playerLocation=" + playerLocation +
                ", playerScore=" + playerScore +
                ", playerPermanentDailyRoutineCards=" + playerPermanentDailyRoutineCards +
                ", playerPermanentArchitectureStudyCards=" + playerPermanentArchitectureStudyCards +
                '}';
    }
}
