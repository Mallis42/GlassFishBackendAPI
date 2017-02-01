/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neilplanx.service;

import DTO.*;
import DTO.Reply.LoginReplyDTO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carelpretorius
 */
@WebService(serviceName = "ClientWebService")
public class ClientWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "login")
    public LoginReplyDTO login(@WebParam(name = "LoginDTO") LoginDTO loginDTO) {
        
        LoginReplyDTO loginReply = new LoginReplyDTO();
        loginReply.setLoginMessage("" + loginDTO.userName);
        
        return loginReply;
    }
    
}
