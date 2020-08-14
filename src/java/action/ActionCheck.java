/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 *
 * @author kasun_k
 */
public class ActionCheck {
    public String execute(){
        System.out.println("Execute from actioncheck");
        return SUCCESS;
    }
}
