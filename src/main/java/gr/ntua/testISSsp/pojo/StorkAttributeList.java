/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.testISSsp.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nikos
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorkAttributeList {

    private String status;
    private Map<String, StorkAttributeTemplate> list;

    public StorkAttributeList() {
        this.status = "OK";
        this.list = new HashMap();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, StorkAttributeTemplate> getList() {
        return list;
    }

    public void setList(Map<String, StorkAttributeTemplate> list) {
        this.list = list;
    }

}


