/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seamfix.controller;

import com.seamfix.dto.Awesome;
import com.seamfix.service.SeamfixService;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author hp
 */
@Stateless
@Path("seamfix")
public class SeamfixController {

    @EJB
    private SeamfixService smfix;

    @GET
    @Path("quadratic_formula/{a}/{b}/{c}")
    public Awesome quadraticFormula(@PathParam("a") int a, @PathParam("b") int b, @PathParam("c") int c) {
        Awesome awe;

        awe = smfix.quadraticService(a, b, c);

        return awe;
    }

}
