/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seamfix.service;

import com.seamfix.dto.Awesome;
import javax.ejb.Stateless;

/**
 *
 * @author hp
 */
@Stateless
public class SeamfixService {

    public Awesome quadraticService(double a, double b, double c) {

        Awesome awe = new Awesome();
        double first_root;
        double second_root;
        double imaginaryRoot;
        double realRoot;

        try {
            double determinant = (b * b) - (4 * a * c);

            if (determinant > 0) {
                first_root = ((-b) + Math.sqrt(determinant)) / (2 * a);
                second_root = ((-b) - Math.sqrt(determinant)) / (2 * a);

                awe = new Awesome(0, "success", first_root, second_root);

            } else if (determinant == 0) {
                first_root = (-b) / (2 * a);
                second_root = (-b) / (2 * a);

                awe = new Awesome(0, "success", first_root, second_root);

            } else if (determinant < 0) {
                realRoot = (-b) / (2 * a);

                imaginaryRoot = Math.sqrt(-determinant) / (2 * a);

                awe = new Awesome(0, "success", realRoot, imaginaryRoot);

            }
        } catch (Exception ex) {
            awe = new Awesome(400, ex.getMessage());
        }

        return awe;

    }
}
