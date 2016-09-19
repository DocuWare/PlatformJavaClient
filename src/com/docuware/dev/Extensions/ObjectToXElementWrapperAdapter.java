/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author Patrick
 */
public class ObjectToXElementWrapperAdapter extends XmlAdapter<Object, XElementWrapper>{

    @Override
    public XElementWrapper unmarshal(Object v) {
        return new XElementWrapper(v);
    }

    @Override
    public Object marshal(XElementWrapper v) {
        return v.getEl();
    }
    
}
