package quizapp.model;

import java.sql.*;

public class QuizQuestions {

    public QuizQuestions() {
    }

    public void submitQuestion(String question) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        Statement statement = null;

        // first value set as 1 as quiz_id is one, this will be gathered before hand once quizzes are dynamic
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            statement = connection.createStatement();
            String query = "INSERT INTO quiz_questions(quiz_id, question)" + "VALUES(?, ?)"; // my sql statement

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "1"); // update with quiz_id
            preparedStatement.setString(2, question);

            preparedStatement.execute();

            connection.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    //possible overlap if questions entered at same time? and must also grab quiz ID at some point to be accurate
    public void submitAnswers(String answerc, String[] answeri) {
        String driverName = "com.mysql.jdbc.Driver";
        String connectionUrl = "jdbc:mysql://silva.computing.dundee.ac.uk:3306/";
        String dbName = "16agileteam1db";
        String userID = "16agileteam1";
        String password = "8320.at1.0238";

        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = null;
        Statement statement = null;

        // first value set as 1 as quiz_question_id is one, this will be gathered before hand once quizzes are dynamic
        try {
            connection = DriverManager.getConnection(connectionUrl + dbName, userID, password);
            statement = connection.createStatement();
            String query = "INSERT INTO quiz_answers(quiz_question_id, correct_answer, incorrect_answer_one, incorrect_answer_two, incorrect_answer_three)" + " VALUES(?, ?, ?, ?, ?);"; // my sql statement

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "2"); // update with quizquestionid
            preparedStatement.setString(2, answerc);

            for (int i = 0; i < 3; i++) {
                preparedStatement.setString(i + 3, answeri[i]); //lol this logic, somebody fire me, ah doesn't work as only one incorrect_answer row
            }
            //System.out.println(preparedStatement);
            preparedStatement.execute();

            connection.close();

        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
