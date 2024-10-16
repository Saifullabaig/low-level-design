import java.io.BufferedReader;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class RatingService {
    private List<User> users;
    private List<Survey> surveys;
    private Map<User, Survey> assignedSurveys;
    private Map<User, SurveyResponse> surveyResponses;
    private double averageSurveyRating;

    public RatingService(){
        this.users = new ArrayList<>();
        this.surveys = new ArrayList<>();
        this.assignedSurveys = new ConcurrentHashMap<>();
        this.surveyResponses = new ConcurrentHashMap<>();
        this.averageSurveyRating = 0.0;
    }

    public void addUser(User user){
        users.add(user);
    }
    public void addSurvey(Survey survey){
        surveys.add(survey);
    }
    public void assignSurvey(User user, Survey survey){
        assignedSurveys.put(user, survey);
    }
    public List<Survey> getSurveys(){
        return surveys;
    }
    public List<User> getUsers(){
        return users;
    }
    public Map<User, Survey> getAssignedSurveys(){
        return assignedSurveys;
    }
    public void takeSurvey(User user){
        if(!assignedSurveys.containsKey(user)){
            System.out.println("No survey assigned to this user");
            return;
        }
        Survey survey = assignedSurveys.get(user);
        Map<String, Integer> answersMap = new HashMap<>();
        List<Question> questions = survey.getQuestions();
        int cnt = 0;
        for(Question q: questions){
            System.out.println("Question: "+q.getDescription());
            List<Answer> answers = q.getAnswers();
            for(Answer a: answers){
                System.out.println(a.getOption());
            }
            System.out.println("Please enter a option from above:");
//            Scanner sc = new Scanner(BufferedReader(new ));
            int ans = 0;
            if(cnt == 0) {
                ans = answers.get(0).getWeight();
                cnt++;
            }else{
                ans = answers.get(1).getWeight();
            }
            answersMap.put(q.getQuestionId(), ans);
        }
        SurveyResponse sr = new SurveyResponse(survey.getSurveyId(), answersMap, user);
        sr.generateRating();
        surveyResponses.put(user, sr);
    }
    public double generateAverageRating(){
        double sum = 0.0;
        for(Map.Entry<User, SurveyResponse> entry: surveyResponses.entrySet()){
            SurveyResponse sr = entry.getValue();
            sum += sr.getRating();
        }
        return this.averageSurveyRating = (double) sum / surveyResponses.size();
    }
    public double getAverageSurveyRating(){
        return averageSurveyRating;
    }

    public void generateAverageQuestionRating(String question_id){
        int answerSum = 0;
        for(Map.Entry<User, SurveyResponse> entry: surveyResponses.entrySet()){
            SurveyResponse sr = entry.getValue();
            Map<String, Integer> answersMap = sr.getAnswersMap();
            int rate = answersMap.get(question_id);
            System.out.println("Rating: "+rate);
            answerSum+=rate;
        }
        double rating = (double) answerSum/surveyResponses.size();
        System.out.println("Average rating for question "+question_id + " is : "+rating);
    }
}
