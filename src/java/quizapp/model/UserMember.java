/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.model;

import quizapp.bean.UserLogin;

/**
 *
 * @author craigwatt
 */
public abstract class UserMember {
    
        public abstract boolean isValid(int ID);
        public abstract UserLogin getProfile(int ID);
        public abstract boolean changeProfile(String firstN, String lastN, String email, int ID);
}
