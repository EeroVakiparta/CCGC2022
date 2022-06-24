public class CardLocation {

    String cardsLocation; // the location of the card list. It can be HAND, DRAW, DISCARD or OPPONENT_CARDS (AUTOMATED and OPPONENT_AUTOMATED will appear in later leagues)
    int trainingCardsCount;
    int codingCardsCount;
    int dailyRoutineCardsCount;
    int taskPrioritizationCardsCount;
    int architectureStudyCardsCount;
    int continuousDeliveryCardsCount;
    int codeReviewCardsCount;
    int refactoringCardsCount;
    int bonusCardsCount;
    int technicalDebtCardsCount;

    public CardLocation(String cardsLocation, int trainingCardsCount, int codingCardsCount, int dailyRoutineCardsCount, int taskPrioritizationCardsCount, int architectureStudyCardsCount, int continuousDeliveryCardsCount, int codeReviewCardsCount, int refactoringCardsCount, int bonusCardsCount, int technicalDebtCardsCount) {
        this.cardsLocation = cardsLocation;
        this.trainingCardsCount = trainingCardsCount;
        this.codingCardsCount = codingCardsCount;
        this.dailyRoutineCardsCount = dailyRoutineCardsCount;
        this.taskPrioritizationCardsCount = taskPrioritizationCardsCount;
        this.architectureStudyCardsCount = architectureStudyCardsCount;
        this.continuousDeliveryCardsCount = continuousDeliveryCardsCount;
        this.codeReviewCardsCount = codeReviewCardsCount;
        this.refactoringCardsCount = refactoringCardsCount;
        this.bonusCardsCount = bonusCardsCount;
        this.technicalDebtCardsCount = technicalDebtCardsCount;
    }

    // boolean is HAND
    public boolean isHand(){
        return cardsLocation.equals("HAND");
    }

    public String getCardsLocation() {
        return cardsLocation;
    }

    public void setCardsLocation(String cardsLocation) {
        this.cardsLocation = cardsLocation;
    }

    public int getTrainingCardsCount() {
        return trainingCardsCount;
    }

    public void setTrainingCardsCount(int trainingCardsCount) {
        this.trainingCardsCount = trainingCardsCount;
    }

    public int getCodingCardsCount() {
        return codingCardsCount;
    }

    public void setCodingCardsCount(int codingCardsCount) {
        this.codingCardsCount = codingCardsCount;
    }

    public int getDailyRoutineCardsCount() {
        return dailyRoutineCardsCount;
    }

    public void setDailyRoutineCardsCount(int dailyRoutineCardsCount) {
        this.dailyRoutineCardsCount = dailyRoutineCardsCount;
    }

    public int getTaskPrioritizationCardsCount() {
        return taskPrioritizationCardsCount;
    }

    public void setTaskPrioritizationCardsCount(int taskPrioritizationCardsCount) {
        this.taskPrioritizationCardsCount = taskPrioritizationCardsCount;
    }

    public int getArchitectureStudyCardsCount() {
        return architectureStudyCardsCount;
    }

    public void setArchitectureStudyCardsCount(int architectureStudyCardsCount) {
        this.architectureStudyCardsCount = architectureStudyCardsCount;
    }

    public int getContinuousDeliveryCardsCount() {
        return continuousDeliveryCardsCount;
    }

    public void setContinuousDeliveryCardsCount(int continuousDeliveryCardsCount) {
        this.continuousDeliveryCardsCount = continuousDeliveryCardsCount;
    }

    public int getCodeReviewCardsCount() {
        return codeReviewCardsCount;
    }

    public void setCodeReviewCardsCount(int codeReviewCardsCount) {
        this.codeReviewCardsCount = codeReviewCardsCount;
    }

    public int getRefactoringCardsCount() {
        return refactoringCardsCount;
    }

    public void setRefactoringCardsCount(int refactoringCardsCount) {
        this.refactoringCardsCount = refactoringCardsCount;
    }

    public int getBonusCardsCount() {
        return bonusCardsCount;
    }

    public void setBonusCardsCount(int bonusCardsCount) {
        this.bonusCardsCount = bonusCardsCount;
    }

    public int getTechnicalDebtCardsCount() {
        return technicalDebtCardsCount;
    }

    public void setTechnicalDebtCardsCount(int technicalDebtCardsCount) {
        this.technicalDebtCardsCount = technicalDebtCardsCount;
    }

    @Override
    public String toString() {
        return "CardLocation{" +
                "cardsLocation='" + cardsLocation + '\'' +
                ", trainingCardsCount=" + trainingCardsCount +
                ", codingCardsCount=" + codingCardsCount +
                ", dailyRoutineCardsCount=" + dailyRoutineCardsCount +
                ", taskPrioritizationCardsCount=" + taskPrioritizationCardsCount +
                ", architectureStudyCardsCount=" + architectureStudyCardsCount +
                ", continuousDeliveryCardsCount=" + continuousDeliveryCardsCount +
                ", codeReviewCardsCount=" + codeReviewCardsCount +
                ", refactoringCardsCount=" + refactoringCardsCount +
                ", bonusCardsCount=" + bonusCardsCount +
                ", technicalDebtCardsCount=" + technicalDebtCardsCount +
                '}';
    }
}
