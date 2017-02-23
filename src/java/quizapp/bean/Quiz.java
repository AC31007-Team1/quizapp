package quizapp.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

class QuizObject {
  private int qid;

  private String qn;

  private int qa;


  QuizObject(int n, String s, int c) {
    qid = n;
    qn = s;
    qa = c;
  }
  
  public int getQid()
  {
      return qid;
  }
}
public class Quiz {
    LinkedList<QuizObject> QO = new LinkedList<QuizObject>();
    private List quizList = new ArrayList();
    private List quizIDList = new ArrayList();
    
    private String quizID;

    public String getQuizID() {
        return quizID;
    }

    public void setQuizID(String quizID) {
        this.quizID = quizID;
    }

    public List getQuizList() {
        return quizList;
    }

    public void setQuizList(List quizList) {
        this.quizList = quizList;
    }

    public List getQuizIDList() {
        return quizIDList;
    }

    public void setQuizIDList(List quizIDList) {
        this.quizIDList = quizIDList;
    }
    
    public void setStaffQuizzes(int qid, String qn, int qa){
        QuizObject n = new QuizObject(qid, qn, qa);
        QO.add(n);
    }
    public LinkedList getStaffQuizzes(){
        return QO;
    }
    
    public int getStaffListLength()
    {
        return QO.size();
    }
    
    public int getQuizIDStff(int i)
    {
        return QO.get(i).getQid();
    }

}
    
    

