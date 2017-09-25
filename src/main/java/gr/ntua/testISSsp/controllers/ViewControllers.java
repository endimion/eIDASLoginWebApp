/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.ntua.testISSsp.controllers;

import java.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author nikos
 */
@Controller
public class ViewControllers {
    
    
    @RequestMapping("/login")
    public ModelAndView loginView(@RequestParam(value = "sp", required = true) String sp,
                                   @RequestParam(value="country", required=true) String countryCode){
        
        ModelAndView mv = new ModelAndView("login");
        UUID token = UUID.randomUUID();
        mv.addObject("token", token);
        mv.addObject("sp", sp);
        mv.addObject("country",countryCode);
        return mv;
    }
}
