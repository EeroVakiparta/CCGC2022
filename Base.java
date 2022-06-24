import java.util.*;
import java.io.*;
import java.math.*;

class App {
    String objectType;
    int id;
    int trainingNeeded; // number of TRAINING skills needed to release this application
    int codingNeeded; // number of CODING skills needed to release this application
    int dailyRoutineNeeded; // number of DAILY_ROUTINE skills needed to release this application
    int taskPrioritizationNeeded; // number of TASK_PRIORITIZATION skills needed to release this application
    int architectureStudyNeeded; // number of ARCHITECTURE_STUDY skills needed to release this application
    int continuousDeliveryNeeded; // number of CONTINUOUS_DELIVERY skills needed to release this application
    int codeReviewNeeded; // number of CODE_REVIEW skills needed to release this application
    int refactoringNeeded; // number of REFACTORING skills needed to release this application

    public App (String objectType,int id, int trainingNeeded, int codingNeeded, int refactoringNeeded){
        this.objectType = objectType;
        this.id = id;
        this.trainingNeeded = trainingNeeded;
        this.codingNeeded = codingNeeded;
        this.refactoringNeeded = refactoringNeeded;
    }
}
/**
 * Complete the hackathon before your opponent by following the principles of Green IT
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int codingCardsCount = 0;
            int trainingCardsCount = 0;
            int refactoringCardsCount = 0;
            int ownPlayerLocation = 0;


            String gamePhase = in.next(); // can be MOVE, GIVE_CARD, THROW_CARD, PLAY_CARD or RELEASE
            System.err.println("gamePhase " + gamePhase);
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
                System.err.println("objectType " + objectType);
                System.err.println("id " + id);
                System.err.println("trainingNeeded " + trainingNeeded);
                System.err.println("codingNeeded " + codingNeeded);
                System.err.println("refactoringNeeded " + refactoringNeeded);

            }
            for (int i = 0; i < 2; i++) {
                int playerLocation = in.nextInt(); // id of the zone in which the player is located
                int playerScore = in.nextInt();
                int playerPermanentDailyRoutineCards = in.nextInt(); // number of DAILY_ROUTINE the player has played. It allows them to take cards from the adjacent zones
                int playerPermanentArchitectureStudyCards = in.nextInt(); // number of ARCHITECTURE_STUDY the player has played. It allows them to draw more cards
                if(i == 0){
                    ownPlayerLocation = playerLocation;
                }
            }
            int cardLocationsCount = in.nextInt();
            for (int i = 0; i < cardLocationsCount; i++) {
                String cardsLocation = in.next(); // the location of the card list. It can be HAND, DRAW, DISCARD or OPPONENT_CARDS (AUTOMATED and OPPONENT_AUTOMATED will appear in later leagues)
                trainingCardsCount = in.nextInt();
                codingCardsCount = in.nextInt();
                int dailyRoutineCardsCount = in.nextInt();
                int taskPrioritizationCardsCount = in.nextInt();
                int architectureStudyCardsCount = in.nextInt();
                int continuousDeliveryCardsCount = in.nextInt();
                int codeReviewCardsCount = in.nextInt();
                refactoringCardsCount = in.nextInt();
                int bonusCardsCount = in.nextInt();
                int technicalDebtCardsCount = in.nextInt();
                System.err.println("trainingCardsCount " + trainingCardsCount);
                System.err.println("codingCardsCount " + codingCardsCount);
                System.err.println("refactoringCardsCount " + refactoringCardsCount);
            }
            int possibleMovesCount = in.nextInt();
            if (in.hasNextLine()) {
                in.nextLine();
            }
            for (int i = 0; i < possibleMovesCount; i++) {
                String possibleMove = in.nextLine();
                System.err.println("possibleMove " + possibleMove);
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            if ( gamePhase.equals("MOVE")){
                if(trainingCardsCount < 2 && ownPlayerLocation != 0){
                    System.out.println("MOVE " + 0 );
                }else if(codingCardsCount < 2 && ownPlayerLocation != 1){
                    System.out.println("MOVE " + 1);
                }else if (refactoringCardsCount < 2 && ownPlayerLocation != 7){
                    System.out.println("MOVE " + 7);
                }else{
                    System.out.println("RANDOM");
                }

            }else if (gamePhase.equals("RELEASE")){




            }else{
                System.out.println("RANDOM");
            }


            // In the first league: RANDOM | MOVE <zoneId> | RELEASE <applicationId> | WAIT; In later leagues: | GIVE <cardType> | THROW <cardType> | TRAINING | CODING | DAILY_ROUTINE | TASK_PRIORITIZATION <cardTypeToThrow> <cardTypeToTake> | ARCHITECTURE_STUDY | CONTINUOUS_DELIVERY <cardTypeToAutomate> | CODE_REVIEW | REFACTORING;

        }
    }
}