package yy;

import java.util.Date;

/* 中间类来封装多个类中的行为 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }
}
