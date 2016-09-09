

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
@XmlType(name = "CandidateInfo", propOrder = {
    "type",
    "candidates"
})
public class CandidateInfo  {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Candidates")
    protected List<Candidate> candidates;

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setCandidates(ArrayList<Candidate> value) {
        candidates=value;
    }

    public List<Candidate> getCandidates() {
        if (candidates == null) {
            candidates = new ArrayList<Candidate>();
        }
        return this.candidates;
    }



}
