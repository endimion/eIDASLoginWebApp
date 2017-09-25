/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.testISSsp.service;

import gr.ntua.testISSsp.pojo.StorkAttributeList;

/**
 *
 * @author nikos
 */
public interface AttributeService {
    
    public StorkAttributeList getEnabledAttributesStorkNames();
     public StorkAttributeList getEnabledAttributesEidasNames();
    
}
