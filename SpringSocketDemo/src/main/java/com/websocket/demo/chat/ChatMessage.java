package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private MessageType type;
    private String sender;
    private static int userAmount;
    private int uamount;

    public static void setUserAmount(int userAmount) {
        ChatMessage.userAmount = userAmount;
    }
    public static int getUserAmount() {
        return userAmount;
    }
}
