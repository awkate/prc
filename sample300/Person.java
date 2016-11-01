package sample300;

import java.util.ArrayList;

/**
 * Created by kei.watanabe on 2016/10/25.
 */
public class Person {

        private ArrayList userInfo;

        Person(ArrayList userInfo){
            this.userInfo = userInfo;
        }

        public void setUserInfo(ArrayList userInfo){

            this.userInfo = userInfo;

        }
        public ArrayList getuserInfo(){return userInfo;}
}
