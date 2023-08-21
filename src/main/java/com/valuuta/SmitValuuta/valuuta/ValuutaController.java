package com.valuuta.SmitValuuta.valuuta;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class ValuutaController {

    private final ValuutaService service;
    Logger logger = LoggerFactory.getLogger(ValuutaController.class);


    public ValuutaController(ValuutaService service) {
        this.service = service;
    }

    @RequestMapping(path = "/api/v1/user/valuuta", method = RequestMethod.GET)
    public List<Valuuta> getValuuta(){
        System.out.println("Tegevus :user GET VALUTAD algatatud");

        return service.getValutas();
    }
    @RequestMapping(path = "/api/v1/admin/post/valuuta",method = RequestMethod.POST)
    public void postValuuta(@RequestBody Valuuta valuuta){
        System.out.println("Tegevus :Admin POST VALUTA algatatud");
        service.saveValuuta(valuuta);
    }
    @RequestMapping(path = "/api/v1/admin/update/valuuta",method = RequestMethod.POST)
    public void updateValuuta(@RequestBody Valuuta valuuta){
        System.out.println("Tegevus :Admin UPDATE VALUTA algatatud");
        service.updateValuuta(valuuta);
    }
    @RequestMapping(path = "/api/v1/admin/delete/valuuta",method = RequestMethod.DELETE)
    public void deleteValuuta(@RequestBody Valuuta valuuta){
        System.out.println("Tegevus :Admin DELETE VALUTA algatatud");
        service.deleteValuta(valuuta);
    }
    @RequestMapping(path = "/api/v1/admin/valuuta",method = RequestMethod.GET)
    public List<Valuuta> deleteValuuta(){
        System.out.println("Tegevus :Admin GET VALUTAD algatatud");
        return service.getValutas();
    }
}
