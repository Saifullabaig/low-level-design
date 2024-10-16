import java.util.Map;

public class SurveyResponse {
    private final String surveyId;
    private Map<String, Integer> answersMap;
    private final User user;
    private double rating;

    public SurveyResponse(String surveyId, Map<String, Integer> answersMap, User user){
        this.surveyId = surveyId;
        this.answersMap = answersMap;
        this.user = user;
        this.rating = 0.0;
    }
    public String getSurveyId(){
        return surveyId;
    }
    public Map<String, Integer> getAnswersMap(){
        return answersMap;
    }
    public void setAnswersMap(Map<String, Integer> answersMap){
        this.answersMap = answersMap;
    }
    public double getRating(){
        return rating;
    }
    public User getUser(){
        return user;
    }
    public void generateRating(){
        int sum = 0;
        for(Map.Entry<String, Integer> entry: answersMap.entrySet()){
            sum+=entry.getValue();
        }
        rating = (double) sum/answersMap.size();
    }
}
