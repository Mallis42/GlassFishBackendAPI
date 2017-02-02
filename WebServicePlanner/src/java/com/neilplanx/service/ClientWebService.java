/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neilplanx.service;

import DTO.DefualtDTO;
import DTO.LoginDTO;
import DTO.Reply.LoginReplyDTO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

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
    
    /**
     *
     * @param loginDTO
     * @return
     *
    @WebMethod(operationName = "login")
    public LoginReplyDTO login(@WebParam(name = "login") LoginDTO loginDTO) {
        
        LoginReplyDTO loginReply = new LoginReplyDTO();
        loginReply.setLoginMessage("");
        
        return loginReply;
    }*/
    
    @WebMethod(operationName = "login")
    @WebResult("");
    public LoginReplyDTO login(@WebParam(name = "login") String txt) {
        
        LoginReplyDTO loginReplyDTO = new LoginReplyDTO();
        
        loginReplyDTO.setLoginMessage(txt);
        
        return loginReplyDTO;
    }    
    
    @WebMethod(operationName = "logout")
    public String logout(@WebParam(name = "logout") String txt) {
        return "Doos " + txt + " !";
    }    

    
}
