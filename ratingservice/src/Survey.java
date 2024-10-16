import java.util.List;

public class Survey {
    private final String surveyId;
    private List<Question> questions;

    public Survey(String surveyId, List<Question> questions){
        this.surveyId = surveyId;
        this.questions = questions;
    }

    public String getSurveyId(){
        return surveyId;
    }
    public List<Question> getQuestions(){
        return questions;
    }
    public void setQuestions(List<Question> questions){
        this.questions = questions;
    }
}
