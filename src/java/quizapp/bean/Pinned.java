package quizapp.bean;

public class Pinned {
    
    private int qid;

    private String qn;
    
    public Pinned(int n, String s) {
        qid = n;
        qn = s;
    }
    
    public int getQid()
    {
        return this.qid;
    }
    public String getQn()
    {
        return this.qn;
    }
}


