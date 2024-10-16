import java.util.List;

public class Question {
    private final String questionId;
    private String description;
    private List<Answer> answers;

    public Question(String questionId, String description, List<Answer> answers){
        this.questionId = questionId;
        this.description = description;
        this.answers = answers;
    }

    public String getQuestionId(){
        return questionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public List<Answer> getAnswers(){
        return answers;
    }
    public void setAnswers(List<Answer> answers){
        this.answers = answers;
    }
}

