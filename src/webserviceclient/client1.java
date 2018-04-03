/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceclient;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import mainpackage.IHelloDarknessMyOldFriend;
import mainpackage.HelloDarknessMyOldFriendService;

/**
 *
 * @author Slightom
 */
public class client1 {

    private static final String WS_URL = "http://localhost:9999/ws3/hellodarkness?wsdl";

    public static void main(String[] args) {
        HelloDarknessMyOldFriendService helloService = new HelloDarknessMyOldFriendService();
        IHelloDarknessMyOldFriend hello = helloService.getHelloDarknessMyOldFriendPort();
        String userName = "", password = "", response = "";

        while (response.isEmpty() || response.contains("Unknown User!")) {
            /*
            * *****************UserName & Password*****************************
             */
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter username: ");
            userName = scan.next();
            System.out.print("Please enter password: ");
            password = scan.next();

            Map<String, Object> req_ctx = ((BindingProvider) hello).getRequestContext();
            req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

            Map<String, List<String>> headers = new HashMap<String, List<String>>();
            headers.put("Username", Collections.singletonList(userName));
            headers.put("Password", Collections.singletonList(password));
            req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
            /*
            ********************************************************************
             */

            response = hello.getString(userName);
            System.out.println("Client1: \n"
                    + "Klient wysłał: " + userName + "\n"
                    + "Klient otrzymał: " + response);
        }

    }
}
