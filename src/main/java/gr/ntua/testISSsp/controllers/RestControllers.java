/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.testISSsp.controllers;

import gr.ntua.testISSsp.Utils.StorkUtils;
import gr.ntua.testISSsp.pojo.ResponseForStork;
import gr.ntua.testISSsp.pojo.StorkAttributeList;
import gr.ntua.testISSsp.pojo.StorkAttributeTemplate;
import gr.ntua.testISSsp.pojo.StorkResponse;
import gr.ntua.testISSsp.service.AttributeService;
import java.io.IOException;
import java.util.Map;
import javax.websocket.server.PathParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author nikos
 */
@Controller
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
public class RestControllers {

    @Autowired
    private AttributeService attrServ;

    private static final Logger LOG = LoggerFactory.getLogger(RestControllers.class);

    @RequestMapping(value = "/saveJSON", method = {RequestMethod.POST, RequestMethod.GET})
    public @ResponseBody
    ResponseForStork saveStorkResponse(
            @RequestParam(value = "r", required = false) String responseString,
            @RequestParam(value = "t", required = false) String token) {

        try {
            StorkResponse response = new StorkResponse();
            Map<String, StorkAttributeTemplate> receivedValues = StorkUtils.parseStorkJSONResponse(responseString);
            response.setReceivedAttributes(receivedValues);
            LOG.info("received the string: \n" + responseString);
            response.setToken(token);
            return new ResponseForStork(true);

        } catch (IOException e) {
            ResponseForStork response = new ResponseForStork(false);
            response.setMessage(e.getMessage());
            return response;
        }
    }

    @RequestMapping("/attributeList")
    public @ResponseBody
    StorkAttributeList getAttributeList() {
        return attrServ.getEnabledAttributesEidasNames();
    }

    @RequestMapping("/attributeListStork")
    public @ResponseBody
    StorkAttributeList getAttributeListStork() {
        return attrServ.getEnabledAttributesStorkNames();
    }

  
}
