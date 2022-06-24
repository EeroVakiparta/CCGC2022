public class Command {
    static final String MOVE = "MOVE";
    static final String RELEASE = "RELEASE";
    static final String RANDOM = "RANDOM";

    static Command parse(String action) {
        String[] parts = action.split(" ");
        switch (parts[0]) {
            case MOVE:
                return new Command(MOVE, Integer.valueOf(parts[1]));
            case RELEASE:
                return new Command(RELEASE, Integer.valueOf(parts[1]));
            default:
                return new Command(RANDOM);
        }

    }

    String type;
    int index;

    public Command(String type, int index) {
        this.type = type;
        this.index = index;
    }

    public Command(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        if (type.equals(MOVE)) {
            return String.format("%s %d", type, index);
        }
        if (type.equals(RELEASE)) {
                return String.format("%s %d", type, index);
        }
        if (type.equals(RANDOM)) {
            return Command.RANDOM;
        }
        return "Something went wrong in Command.toString() for " + type;
    }
}


