

package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory  {

    private final static QName _Page_QNAME = new QName("http://dev.docuware.com/public/intellix", "Page");
    private final static QName _Document_QNAME = new QName("http://dev.docuware.com/public/intellix", "Document");

    public ObjectFactory() {
    }

    public DocumentContent createDocumentContent() {
        return new DocumentContent();
    }

    public PageContent createPageContent() {
        return new PageContent();
    }

    public Space createSpace() {
        return new Space();
    }

    public Candidate createCandidate() {
        return new Candidate();
    }

    public CellZone createCellZone() {
        return new CellZone();
    }

    public Rulerline createRulerline() {
        return new Rulerline();
    }

    public SimpleWord createSimpleWord() {
        return new SimpleWord();
    }

    public Word createWord() {
        return new Word();
    }

    public GridTable createGridTable() {
        return new GridTable();
    }

    public CandidateInfo createCandidateInfo() {
        return new CandidateInfo();
    }

    public BarCodeZone createBarCodeZone() {
        return new BarCodeZone();
    }

    public SimplePageContent createSimplePageContent() {
        return new SimplePageContent();
    }

    public Line createLine() {
        return new Line();
    }

    public RectangleBase createRectangleBase() {
        return new RectangleBase();
    }

    public TextZone createTextZone() {
        return new TextZone();
    }

    public TableZone createTableZone() {
        return new TableZone();
    }

    public Words createWords() {
        return new Words();
    }

    public PictureZone createPictureZone() {
        return new PictureZone();
    }

    public DocumentContent.Embedded createDocumentContentEmbedded() {
        return new DocumentContent.Embedded();
    }

    public DocumentContent.Pages createDocumentContentPages() {
        return new DocumentContent.Pages();
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/public/intellix", name = "Page")
    public JAXBElement<PageContent> createPage(PageContent value) {
        return new JAXBElement<PageContent>(_Page_QNAME, PageContent.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/public/intellix", name = "Document")
    public JAXBElement<DocumentContent> createDocument(DocumentContent value) {
        return new JAXBElement<DocumentContent>(_Document_QNAME, DocumentContent.class, null, value);
    }



}
