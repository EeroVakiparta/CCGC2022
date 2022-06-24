import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {

            List<App> apps = new ArrayList<App>();
            List<Pelaaja> pelaajat = new ArrayList<Pelaaja>();
            List<CardLocation> cardLocations = new ArrayList<CardLocation>();

            GamePhase gamePhase = GamePhase.fromString(in.next()); // can be MOVE, GIVE_CARD, THROW_CARD, PLAY_CARD or RELEASE

            int applicationsCount = in.nextInt();
            for (int i = 0; i < applicationsCount; i++) {
                String objectType = in.next();
                int id = in.nextInt();
                int trainingNeeded = in.nextInt(); // number of TRAINING skills needed to release this application
                int codingNeeded = in.nextInt(); // number of CODING skills needed to release this application
                int dailyRoutineNeeded = in.nextInt(); // number of DAILY_ROUTINE skills needed to release this application
                int taskPrioritizationNeeded = in.nextInt(); // number of TASK_PRIORITIZATION skills needed to release this application
                int architectureStudyNeeded = in.nextInt(); // number of ARCHITECTURE_STUDY skills needed to release this application
                int continuousDeliveryNeeded = in.nextInt(); // number of CONTINUOUS_DELIVERY skills needed to release this application
                int codeReviewNeeded = in.nextInt(); // number of CODE_REVIEW skills needed to release this application
                int refactoringNeeded = in.nextInt(); // number of REFACTORING skills needed to release this application

                apps.add(new App(objectType, id, trainingNeeded, codingNeeded, refactoringNeeded));
            }

            for (int i = 0; i < 2; i++) {
                int playerLocation = in.nextInt(); // id of the zone in which the player is located
                int playerScore = in.nextInt();
                int playerPermanentDailyRoutineCards = in.nextInt(); // number of DAILY_ROUTINE the player has played. It allows them to take cards from the adjacent zones
                int playerPermanentArchitectureStudyCards = in.nextInt(); // number of ARCHITECTURE_STUDY the player has played. It allows them to draw more cards

                pelaajat.add(new Pelaaja(playerLocation, playerScore, playerPermanentDailyRoutineCards, playerPermanentArchitectureStudyCards));
            }

            int cardLocationsCount = in.nextInt();
            for (int i = 0; i < cardLocationsCount; i++) {
                String cardsLocation = in.next(); // the location of the card list. It can be HAND, DRAW, DISCARD or OPPONENT_CARDS (AUTOMATED and OPPONENT_AUTOMATED will appear in later leagues)
                int trainingCardsCount = in.nextInt();
                int codingCardsCount = in.nextInt();
                int dailyRoutineCardsCount = in.nextInt();
                int taskPrioritizationCardsCount = in.nextInt();
                int architectureStudyCardsCount = in.nextInt();
                int continuousDeliveryCardsCount = in.nextInt();
                int codeReviewCardsCount = in.nextInt();
                int refactoringCardsCount = in.nextInt();
                int bonusCardsCount = in.nextInt();
                int technicalDebtCardsCount = in.nextInt();

                cardLocations.add(new CardLocation(cardsLocation, trainingCardsCount, codingCardsCount, dailyRoutineCardsCount, taskPrioritizationCardsCount, architectureStudyCardsCount, continuousDeliveryCardsCount, codeReviewCardsCount, refactoringCardsCount, bonusCardsCount, technicalDebtCardsCount));

            }
            int possibleMovesCount = in.nextInt();
            if (in.hasNextLine()) {
                in.nextLine();
            }

            //Array of strings possibleMove
            String[] possibleMoves = new String[possibleMovesCount];

            for (int i = 0; i < possibleMovesCount; i++) {
                String possibleMove = in.nextLine();
                System.err.println("possibleMove " + possibleMove);
                possibleMoves[i] = possibleMove;
            }

            if (gamePhase.equals(GamePhase.MOVE)) {
                System.err.println("MOVE phase");
                int bestMoveIndex = chooseBestMove(pelaajat, apps, cardLocations, possibleMoves);
                System.out.println(possibleMoves[bestMoveIndex]);

            } else if (gamePhase.equals(GamePhase.GIVE_CARD)) {
                System.err.println("GIVE_CARD phase");

            } else if (gamePhase.equals(GamePhase.THROW_CARD)) {
                System.err.println("THROW_CARD phase");

            } else if (gamePhase.equals(GamePhase.PLAY_CARD)) {
                System.err.println("PLAY_CARD phase");

            } else if (gamePhase.equals(GamePhase.RELEASE)) {
                System.err.println("RELEASE phase");
                int bestReleaseIndex = chooseBestRelease(pelaajat, apps, cardLocations, possibleMoves);
                System.out.println(possibleMoves[bestReleaseIndex]);
            }

            // In the first league: RANDOM | MOVE <zoneId> | RELEASE <applicationId> | WAIT; In later leagues: | GIVE <cardType> | THROW <cardType> | TRAINING | CODING | DAILY_ROUTINE | TASK_PRIORITIZATION <cardTypeToThrow> <cardTypeToTake> | ARCHITECTURE_STUDY | CONTINUOUS_DELIVERY <cardTypeToAutomate> | CODE_REVIEW | REFACTORING;

        }
    }

    public static int chooseBestRelease(List<Pelaaja> pelaajat, List<App> apps, List<CardLocation> cardLocations, String[] possibleMoves) {
        System.err.println("chooseBestRelease");
        int bestMoveIndex = 0; // release
        int bestReleaseScore = 0;
        for (String s : possibleMoves) {
            int releaseScore = 0;
            String possibleMove = s;
            String[] possibleMoveSplit = possibleMove.split(" ");
            System.err.println("possibleMove " + possibleMove);
            if (possibleMoveSplit[0].equals("RELEASE")) {
                for (App app : apps) {
                    if (app.getId() == Integer.parseInt(possibleMoveSplit[1])) {
                        for (CardLocation cardLocation : cardLocations) {
                            if (cardLocation.getCardsLocation().equals("HAND")) {

                                if (app.getCodingNeeded() != 0 && cardLocation.getCodingCardsCount() > 0) {
                                    if (app.getCodingNeeded() <= cardLocation.getCodingCardsCount()) {
                                        releaseScore += 1;
                                    }
                                    if (app.getTrainingNeeded() != 0 && cardLocation.getTrainingCardsCount() > 0) {
                                        if (app.getTrainingNeeded() <= cardLocation.getTrainingCardsCount()) {
                                            releaseScore += 1;
                                        }
                                        if (app.getRefactoringNeeded() != 0 && cardLocation.getRefactoringCardsCount() > 0) {
                                            if (app.getRefactoringNeeded() <= cardLocation.getRefactoringCardsCount()) {
                                                releaseScore += 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (releaseScore > bestReleaseScore) {
                            bestMoveIndex = Integer.parseInt(possibleMoveSplit[1]);
                            bestReleaseScore = releaseScore;
                        }
                    }
                }

            }
        }
        return apps[bestMoveIndex].getId();
    }


    private static int chooseBestMove(List<Pelaaja> pelaajat, List<App> apps, List<CardLocation> cardLocations, String[] possibleMoves) {
        Pelaaja pelaaja = pelaajat.get(0);
        int bestMovesIndex = 0;
        int bestMovesScore = 0;
        for (int i = 0; i < possibleMoves.length; i++) {
            String possibleMove = possibleMoves[i];
            String[] move = possibleMove.split(" ");
            if (move[0].equals("MOVE")) {
                int moveScore = moveScore(pelaaja, apps, cardLocations, move);
                if (moveScore > bestMovesScore) {
                    bestMovesIndex = i;
                    bestMovesScore = moveScore;
                }
            }
        }

        System.err.println("bestMovesIndex " + bestMovesIndex);
        System.err.println("bestMovesScore " + bestMovesScore);
        return bestMovesIndex;

    }

    private static int moveScore(Pelaaja
                                         pelaaja, List<App> apps, List<CardLocation> cardLocations, String[] move) {
        int moveScore = 0;
        int moveZoneId = Integer.parseInt(move[1]);
        for (App app : apps) {
            if (app.getId() == moveZoneId) {
                moveScore += app.getTrainingNeeded();
                moveScore += app.getCodingNeeded();
                moveScore += app.getDailyRoutineNeeded();
                moveScore += app.getTaskPrioritizationNeeded();
                moveScore += app.getArchitectureStudyNeeded();
                moveScore += app.getContinuousDeliveryNeeded();
                moveScore += app.getCodeReviewNeeded();
                moveScore += app.getRefactoringNeeded();
            }
        }
        for (CardLocation cardLocation : cardLocations) {
            if (cardLocation.getCardsLocation().equals("HAND")) {
                moveScore += cardLocation.getTrainingCardsCount();
                moveScore += cardLocation.getCodingCardsCount();
                moveScore += cardLocation.getDailyRoutineCardsCount();
                moveScore += cardLocation.getTaskPrioritizationCardsCount();
                moveScore += cardLocation.getArchitectureStudyCardsCount();
                moveScore += cardLocation.getContinuousDeliveryCardsCount();
                moveScore += cardLocation.getCodeReviewCardsCount();
                moveScore += cardLocation.getRefactoringCardsCount();
            }
        }
        return moveScore;
    }


}