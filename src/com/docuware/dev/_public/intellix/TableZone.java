

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
@XmlType(name = "TableZone", propOrder = {
    "gridT",
    "cz"
})
public class TableZone
    extends RectangleBase
 {

    @XmlElement(required = true)
    protected GridTable gridT;
    @XmlElement(name = "Cz", required = true)
    protected List<CellZone> cz;

    public GridTable getGridT() {
        return gridT;
    }

    public void setGridT(GridTable value) {
        this.gridT = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setCz(ArrayList<CellZone> value) {
        cz=value;
    }

    public List<CellZone> getCz() {
        if (cz == null) {
            cz = new ArrayList<CellZone>();
        }
        return this.cz;
    }



}
