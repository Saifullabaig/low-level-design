public class Answer {
    private final String option;
    private final int weight;

    public Answer(String option, int weight){
        this.option = option;
        this.weight = weight;
    }
    public String getOption(){
        return option;
    }
    public int getWeight(){
        return weight;
    }
}
