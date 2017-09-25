/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.testISSsp.pojo;


/**
 *
 * @author nikos
 */
public class ResponseForStork {
    
    private String status;
    private final static String OK_STATUS = "OK";
    private final static String FAIL_STATUS = "FAIL";
    private String message;
    
    public ResponseForStork(boolean status){
        this.status=(status)?OK_STATUS:FAIL_STATUS;
        this.message = "";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
