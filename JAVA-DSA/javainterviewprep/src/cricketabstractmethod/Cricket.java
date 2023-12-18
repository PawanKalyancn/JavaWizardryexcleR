package cricketabstractmethod;

abstract class Cricket {
    private int maxOvers;
    private int targetScore;
    private int currentOver;
    private int currentScore;

    public Cricket(int maxOvers, int targetScore) {
        this.maxOvers = maxOvers;
        this.targetScore = targetScore;
        this.currentOver = 0;
        this.currentScore = 0;
    }

    public int getMaxOvers() {
        return maxOvers;
    }

    public int getTargetScore() {
        return targetScore;
    }

    public int getCurrentOver() {
        return currentOver;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentOver(int currentOver) {
        this.currentOver = currentOver;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public abstract double calcCurrentRunrate();

    public abstract double calcReqdRunrate();
}

class OneDayCricket extends Cricket {
    public OneDayCricket(int targetScore) {
        super(50, targetScore);
    }

    @Override
    public double calcCurrentRunrate() {
        return getCurrentScore() / (double) getCurrentOver();
    }

    @Override
    public double calcReqdRunrate() {
        int remainingRuns = getTargetScore() - getCurrentScore();
        int remainingOvers = getMaxOvers() - getCurrentOver();
        return remainingRuns / (double) remainingOvers;
    }
}

