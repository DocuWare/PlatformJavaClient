

package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gridTable", propOrder = {
    "gridCol",
    "gridRow"
})
public class GridTable  {

    @XmlElement(type = Integer.class)
    protected List<Integer> gridCol;
    @XmlElement(type = Integer.class)
    protected List<Integer> gridRow;

    public List<Integer> getGridCol() {
        if (gridCol == null) {
            gridCol = new ArrayList<Integer>();
        }
        return this.gridCol;
    }

    public List<Integer> getGridRow() {
        if (gridRow == null) {
            gridRow = new ArrayList<Integer>();
        }
        return this.gridRow;
    }



}
