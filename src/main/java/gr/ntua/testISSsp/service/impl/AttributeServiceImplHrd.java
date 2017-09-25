/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.testISSsp.service.impl;

import gr.ntua.testISSsp.pojo.StorkAttributeList;
import gr.ntua.testISSsp.pojo.StorkAttributeTemplate;
import gr.ntua.testISSsp.service.AttributeService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author nikos
 */
@Service
public class AttributeServiceImplHrd implements AttributeService {

    @Override
    public StorkAttributeList getEnabledAttributesStorkNames() {
        StorkAttributeList result = new StorkAttributeList();
        Map<String, StorkAttributeTemplate> attributes = new HashMap();

        StorkAttributeTemplate eId = new StorkAttributeTemplate();
        eId.setComplex(0);
        eId.setRequired(1);
        eId.setValue(null);
        attributes.put("eIdentifier", eId);

        StorkAttributeTemplate surname = new StorkAttributeTemplate();
        surname.setComplex(0);
        surname.setRequired(1);
        eId.setValue(null);
        attributes.put("surname", surname);

        StorkAttributeTemplate givenName = new StorkAttributeTemplate();
        surname.setComplex(0);
        surname.setRequired(1);
        eId.setValue(null);
        attributes.put("givenName", givenName);

        StorkAttributeTemplate dateOfBirth = new StorkAttributeTemplate();
        surname.setComplex(0);
        surname.setRequired(1);
        eId.setValue(null);
        attributes.put("dateOfBirth", dateOfBirth);
        
        
        result.setList(attributes);
        result.setStatus("OK");
        
        return result;
    }

    @Override
    public StorkAttributeList getEnabledAttributesEidasNames() {
        StorkAttributeList result = new StorkAttributeList();
        Map<String, StorkAttributeTemplate> attributes = new HashMap();

        StorkAttributeTemplate eId = new StorkAttributeTemplate();
        eId.setComplex(0);
        eId.setRequired(1);
        eId.setValue(null);
        attributes.put("PersonIdentifier", eId);

        StorkAttributeTemplate surname = new StorkAttributeTemplate();
        surname.setComplex(0);
        surname.setRequired(1);
        eId.setValue(null);
        attributes.put("CurrentFamilyName", surname);

        StorkAttributeTemplate givenName = new StorkAttributeTemplate();
        surname.setComplex(0);
        surname.setRequired(1);
        eId.setValue(null);
        attributes.put("CurrentGivenName", givenName);

        StorkAttributeTemplate dateOfBirth = new StorkAttributeTemplate();
        surname.setComplex(0);
        surname.setRequired(1);
        eId.setValue(null);
        attributes.put("DateOfBirth", dateOfBirth);
        
        
        result.setList(attributes);
        result.setStatus("OK");
        
        return result;
    }

}
