import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("saif", "abc@gmail.com", UserRole.USER);
        User user2 = new User("abc", "xyz@gmail.com", UserRole.USER);

        String desc1 = "What is Java?";
        List<Answer> answerList1 = new ArrayList<>();
        Answer ans1 = new Answer("Coffee", 10);
        Answer ans2 = new Answer("Tea", 5);
        Answer ans3 = new Answer("Programming Language", 20);
        Answer ans4 = new Answer("Car", 0);
        answerList1.add(ans1);
        answerList1.add(ans2);
        answerList1.add(ans3);
        answerList1.add(ans4);

        Question q1 = new Question("Q1",desc1,answerList1);

        String desc2 = "What is Python?";
        List<Answer> answerList2 = new ArrayList<>();
        Answer ans11 = new Answer("Snake", 6);
        Answer ans12 = new Answer("Tea", 5);
        Answer ans13 = new Answer("Programming Language", 20);
        Answer ans14 = new Answer("Car", 0);
        answerList2.add(ans11);
        answerList2.add(ans12);
        answerList2.add(ans13);
        answerList2.add(ans14);

        Question q2 = new Question("Q2",desc2,answerList2);
        List<Question> questions = new ArrayList<>();
        questions.add(q1);
        questions.add(q2);
        Survey sr1 = new Survey("S1", questions);

        RatingService ratingService = new RatingService();
        ratingService.addUser(user1);
        ratingService.addUser(user2);

        ratingService.addSurvey(sr1);
        ratingService.assignSurvey(user1, sr1);
        ratingService.assignSurvey(user2, sr1);

        ratingService.takeSurvey(user1);
        ratingService.takeSurvey(user2);

        System.out.println(ratingService.generateAverageRating());

        ratingService.generateAverageQuestionRating("Q2");
    }


}