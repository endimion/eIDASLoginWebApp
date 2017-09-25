/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.testISSsp.Utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import gr.ntua.testISSsp.pojo.StorkAttributeTemplate;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nikos
 */
public class StorkUtils {
    
    
     public static Map<String, StorkAttributeTemplate> parseStorkJSONResponse(String jsonString) throws IOException {
        ObjectMapper jmap = new ObjectMapper();
        TypeFactory typeFactory = jmap.getTypeFactory();
        MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, StorkAttributeTemplate.class);
        return jmap.readValue(jsonString, mapType);
    }
    
}
