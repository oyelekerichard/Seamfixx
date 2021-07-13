/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seamfix.controller;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author hp
 */
@Stateless
@Path("seamfix")
public class SeamfixController {

    SeamfixService smfix;

    @GET
    @Path(value = "")
    public Awesome quadraticFormaula(int a, int b, int c) {
        Awesome awe;

        awe = smfix.quadraticService(a, b, c);

        return awe;
    }

}
