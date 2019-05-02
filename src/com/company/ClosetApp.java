package com.company;

import java.util.HashMap;

public class ClosetApp {

    public static void main(String[] args) {
	// write your code here
        HashMap <String, Closet>closetList = new HashMap<String, Closet>();
        Closet springCloset = new Closet();
        Closet winterCloset = new Closet();
        Closet fallCloset = new Closet();


        springCloset.setShirtList("cotton");
        springCloset.setPantList("cotton");
        springCloset.setJacketList("cotton");
        springCloset.setFootwearsList(7);

        closetList.put("Spring Closet", springCloset);
        closetList.put("Winter Closet", winterCloset);
        closetList.put("Fall Closet", fallCloset);




    }
}
