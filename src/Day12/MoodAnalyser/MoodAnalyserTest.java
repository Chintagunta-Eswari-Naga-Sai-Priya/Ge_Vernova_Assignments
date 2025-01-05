import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenSadMood_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        try {
            assertEquals("SAD", moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            fail("Exception should not be thrown for sad mood");
        }
    }

    @Test
    public void givenHappyMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        try {
            assertEquals("HAPPY", moodAnalyser.analyseMood());
        } catch (MoodAnalysisException e) {
            fail("Exception should not be thrown for happy mood");
        }
    }

    @Test
    public void givenNullMood_ShouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        Exception exception = assertThrows(MoodAnalysisException.class, () -> {
            moodAnalyser.analyseMood();
        });
        assertEquals(MoodAnalysisErrors.NULL_MOOD.getMessage(), exception.getMessage());
    }

    @Test
    public void givenEmptyMood_ShouldThrowMoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        Exception exception = assertThrows(MoodAnalysisException.class, () -> {
            moodAnalyser.analyseMood();
        });
        assertEquals(MoodAnalysisErrors.EMPTY_MOOD.getMessage(), exception.getMessage());
    }
}
