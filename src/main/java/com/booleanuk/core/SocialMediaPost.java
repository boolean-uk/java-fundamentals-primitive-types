package com.booleanuk.core;

public class SocialMediaPost {
    public long userId = 31235513134L;
    public long postId = 6789325689235680527L;
    public boolean privatePost = false;
    public String postText = "simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
    public int likes = 4;
    public String[] comments = {"That is awesome man", "Bruh", "What do you mean?", "Can I repost this?"};
    public long[] likedByUserId = {234234423L, 2342431L, 9807820L, 2789431201L};
    public int postDay = 26;
    public int postMonth = 4;
    public int postYear = 2023;
    public int postMinute = 43;
    public int postHour = 16;   //I guess an object for posting date-time should be better

}
