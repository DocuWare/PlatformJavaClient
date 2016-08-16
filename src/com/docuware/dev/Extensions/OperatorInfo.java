/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

/**
 *
 * @author Patrick
 */
public class OperatorInfo {

    private boolean Default;
    private String First;
    private char Seperator;
    private boolean Named;
    private String IfEmpty;
    private boolean AllowReserved;

    public OperatorInfo(boolean Default, String First, char Seperator, boolean Named, String IfEmpty, boolean AllowReserved) {
        this.Default = Default;
        this.First = First;
        this.Seperator = Seperator;
        this.Named = Named;
        this.IfEmpty = IfEmpty;
        this.AllowReserved = AllowReserved;
    }

    public boolean isDefault() {
        return Default;
    }

    public void setDefault(boolean Default) {
        this.Default = Default;
    }

    public String getFirst() {
        return First;
    }

    public void setFirst(String First) {
        this.First = First;
    }

    public char getSeperator() {
        return Seperator;
    }

    public void setSeperator(char Seperator) {
        this.Seperator = Seperator;
    }

    public boolean isNamed() {
        return Named;
    }

    public void setNamed(boolean Named) {
        this.Named = Named;
    }

    public String getIfEmpty() {
        return IfEmpty;
    }

    public void setIfEmpty(String IfEmpty) {
        this.IfEmpty = IfEmpty;
    }

    public boolean isAllowReserved() {
        return AllowReserved;
    }

    public void setAllowReserved(boolean AllowReserved) {
        this.AllowReserved = AllowReserved;
    }

}
