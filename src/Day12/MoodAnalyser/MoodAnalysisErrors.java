public enum MoodAnalysisErrors {
    NULL_MOOD("Mood cannot be null"),
    EMPTY_MOOD("Mood cannot be empty");

    private String message;

    MoodAnalysisErrors(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
