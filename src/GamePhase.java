public enum GamePhase {
    // can be MOVE, GIVE_CARD, THROW_CARD, PLAY_CARD or RELEASE
    MOVE("MOVE"),
    GIVE_CARD("GIVE_CARD"),
    THROW_CARD("THROW_CARD"),
    PLAY_CARD("PLAY_CARD"),
    RELEASE("RELEASE");

    private final String value;

    GamePhase(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static GamePhase fromString(String value) {
        for (GamePhase phase : GamePhase.values()) {
            if (phase.getValue().equals(value)) {
                return phase;
            }
        }
        throw new IllegalArgumentException("Invalid GamePhase: " + value);
    }
}
