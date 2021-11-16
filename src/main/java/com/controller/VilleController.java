package com.controller;

import com.blo.VilleBLO;
import com.dto.Ville;
import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;

@RestController
public class VilleController {
//        @RequestMapping("/")
//        public String helloWorld(){
//            return "Hello World !";
//        }
    @Autowired
    VilleBLO villeService;
    @RequestMapping(value = "/ville", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Ville> appelGet(@RequestParam(required = false, value = "codePostal") String codePostal) throws SQLException, JSONException {

        ArrayList<Ville> villes = villeService.getInfoVilles(codePostal);
        System.out.print("Appel GET ");
        System.out.println("Code Postal " + codePostal);
        return villes;
    }

}
