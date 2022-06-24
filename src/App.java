public class App {
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

    public App(String objectType, int id, int trainingNeeded, int codingNeeded, int dailyRoutineNeeded, int taskPrioritizationNeeded, int architectureStudyNeeded, int continuousDeliveryNeeded, int codeReviewNeeded, int refactoringNeeded) {
        this.objectType = objectType;
        this.id = id;
        this.trainingNeeded = trainingNeeded;
        this.codingNeeded = codingNeeded;
        this.dailyRoutineNeeded = dailyRoutineNeeded;
        this.taskPrioritizationNeeded = taskPrioritizationNeeded;
        this.architectureStudyNeeded = architectureStudyNeeded;
        this.continuousDeliveryNeeded = continuousDeliveryNeeded;
        this.codeReviewNeeded = codeReviewNeeded;
        this.refactoringNeeded = refactoringNeeded;
    }

    public App(String objectType, int id, int trainingNeeded, int codingNeeded, int refactoringNeeded) {
        this.objectType = objectType;
        this.id = id;
        this.trainingNeeded = trainingNeeded;
        this.codingNeeded = codingNeeded;
        this.refactoringNeeded = refactoringNeeded;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTrainingNeeded() {
        return trainingNeeded;
    }

    public void setTrainingNeeded(int trainingNeeded) {
        this.trainingNeeded = trainingNeeded;
    }

    public int getCodingNeeded() {
        return codingNeeded;
    }

    public void setCodingNeeded(int codingNeeded) {
        this.codingNeeded = codingNeeded;
    }

    public int getDailyRoutineNeeded() {
        return dailyRoutineNeeded;
    }

    public void setDailyRoutineNeeded(int dailyRoutineNeeded) {
        this.dailyRoutineNeeded = dailyRoutineNeeded;
    }

    public int getTaskPrioritizationNeeded() {
        return taskPrioritizationNeeded;
    }

    public void setTaskPrioritizationNeeded(int taskPrioritizationNeeded) {
        this.taskPrioritizationNeeded = taskPrioritizationNeeded;
    }

    public int getArchitectureStudyNeeded() {
        return architectureStudyNeeded;
    }

    public void setArchitectureStudyNeeded(int architectureStudyNeeded) {
        this.architectureStudyNeeded = architectureStudyNeeded;
    }

    public int getContinuousDeliveryNeeded() {
        return continuousDeliveryNeeded;
    }

    public void setContinuousDeliveryNeeded(int continuousDeliveryNeeded) {
        this.continuousDeliveryNeeded = continuousDeliveryNeeded;
    }

    public int getCodeReviewNeeded() {
        return codeReviewNeeded;
    }

    public void setCodeReviewNeeded(int codeReviewNeeded) {
        this.codeReviewNeeded = codeReviewNeeded;
    }

    public int getRefactoringNeeded() {
        return refactoringNeeded;
    }

    public void setRefactoringNeeded(int refactoringNeeded) {
        this.refactoringNeeded = refactoringNeeded;
    }

    @Override
    public String toString() {
        return "App{" +
                "objectType='" + objectType + '\'' +
                ", id=" + id +
                ", trainingNeeded=" + trainingNeeded +
                ", codingNeeded=" + codingNeeded +
                ", dailyRoutineNeeded=" + dailyRoutineNeeded +
                ", taskPrioritizationNeeded=" + taskPrioritizationNeeded +
                ", architectureStudyNeeded=" + architectureStudyNeeded +
                ", continuousDeliveryNeeded=" + continuousDeliveryNeeded +
                ", codeReviewNeeded=" + codeReviewNeeded +
                ", refactoringNeeded=" + refactoringNeeded +
                '}';
    }
}