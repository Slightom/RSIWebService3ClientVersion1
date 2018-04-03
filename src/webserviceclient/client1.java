/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceclient;

import mainpackage.IHelloDarknessMyOldFriend;
import mainpackage.HelloDarknessMyOldFriendService;

/**
 *
 * @author Slightom
 */
public class client1 {
    public static void main(String[] args){
        HelloDarknessMyOldFriendService helloService = new HelloDarknessMyOldFriendService();
        IHelloDarknessMyOldFriend hello = helloService.getHelloDarknessMyOldFriendPort();
        
        String zapytanie = "Jacob";
        String response = hello.getString(zapytanie);
        System.out.println("Client1: \n" +
                "Klient wysłał: " + zapytanie + "\n" +
                "Klient otrzymał: " + response);
        
        
    }
}
