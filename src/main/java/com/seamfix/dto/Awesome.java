/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seamfix.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hp
 */
@XmlRootElement
public class Awesome {

    private int resp;
    private String desc;
    private double firstRoot;
    private double secondRoot;

    public Awesome() {

    }

    public Awesome(int resp, String desc) {
        this.resp = resp;
        this.desc = desc;
    }

    public Awesome(int resp, String desc, double firstRoot) {
        this.resp = resp;
        this.desc = desc;
        this.firstRoot = firstRoot;
    }

    public Awesome(int resp, String desc, double firstRoot, double secondRoot) {
        this.resp = resp;
        this.desc = desc;
        this.firstRoot = firstRoot;
        this.secondRoot = secondRoot;
    }

    public int getResp() {
        return resp;
    }

    public void setResp(int resp) {
        this.resp = resp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getFirstRoot() {
        return firstRoot;
    }

    public void setFirstRoot(double firstRoot) {
        this.firstRoot = firstRoot;
    }

    public double getSecondRoot() {
        return secondRoot;
    }

    public void setSecondRoot(double secondRoot) {
        this.secondRoot = secondRoot;
    }

    @Override
    public String toString() {
        return "Awesome{" + "resp=" + resp + ", desc=" + desc + ", firstRoot=" + firstRoot + ", secondRoot=" + secondRoot + '}';
    }

}
