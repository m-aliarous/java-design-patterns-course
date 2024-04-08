/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author mstf
 */
public class MessageFacade {

    public void sendMessage() {
        var client = new Client();
        client.connectToServer();

        var clientServer = new ClientServer();
        clientServer.authenticateClient();
        clientServer.routeToRecipient();

        var recipientServer = new RecipientServer();
        recipientServer.authenticateRecipient();
        recipientServer.sendMessage();

        var recipient = new Recipient();
        recipient.receiveMessage();
    }
}
