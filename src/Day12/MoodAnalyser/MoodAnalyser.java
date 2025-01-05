public class MoodAnalyser {
    private String message;

    // Default constructor
    public MoodAnalyser() {
        this.message = "";
    }

    // Constructor with message parameter
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        // Check for null or empty message
        if (message == null) {
            throw new MoodAnalysisException(MoodAnalysisErrors.NULL_MOOD.getMessage());
        }
        if (message.isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisErrors.EMPTY_MOOD.getMessage());
        }

        // Analyze mood
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        }
        return "HAPPY";
    }
}
