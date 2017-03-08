package quizapp.bean;

public class Pinned {
    
    private String qid;

    private String qn;
    
    public Pinned(String n, String s) {
        qid = n;
        qn = s;
    }
    
    public String getQid()
    {
        return this.qid;
    }
    public String getQn()
    {
        return this.qn;
    }
}




