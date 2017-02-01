/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author carelpretorius
 */
import DTO.DefualtDTO;
import lombok.Data;


@Data
public class LoginDTO extends DefualtDTO {
    
    public String userName;
    public String password;
    
}
