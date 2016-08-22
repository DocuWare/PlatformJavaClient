//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.docuware.dev._public.intellix package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory  {

    private final static QName _Page_QNAME = new QName("http://dev.docuware.com/public/intellix", "Page");
    private final static QName _Document_QNAME = new QName("http://dev.docuware.com/public/intellix", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.docuware.dev._public.intellix
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentContent }
     * 
     */
    public DocumentContent createDocumentContent() {
        return new DocumentContent();
    }

    /**
     * Create an instance of {@link PageContent }
     * 
     */
    public PageContent createPageContent() {
        return new PageContent();
    }

    /**
     * Create an instance of {@link Space }
     * 
     */
    public Space createSpace() {
        return new Space();
    }

    /**
     * Create an instance of {@link Candidate }
     * 
     */
    public Candidate createCandidate() {
        return new Candidate();
    }

    /**
     * Create an instance of {@link CellZone }
     * 
     */
    public CellZone createCellZone() {
        return new CellZone();
    }

    /**
     * Create an instance of {@link Rulerline }
     * 
     */
    public Rulerline createRulerline() {
        return new Rulerline();
    }

    /**
     * Create an instance of {@link SimpleWord }
     * 
     */
    public SimpleWord createSimpleWord() {
        return new SimpleWord();
    }

    /**
     * Create an instance of {@link Word }
     * 
     */
    public Word createWord() {
        return new Word();
    }

    /**
     * Create an instance of {@link GridTable }
     * 
     */
    public GridTable createGridTable() {
        return new GridTable();
    }

    /**
     * Create an instance of {@link CandidateInfo }
     * 
     */
    public CandidateInfo createCandidateInfo() {
        return new CandidateInfo();
    }

    /**
     * Create an instance of {@link BarCodeZone }
     * 
     */
    public BarCodeZone createBarCodeZone() {
        return new BarCodeZone();
    }

    /**
     * Create an instance of {@link SimplePageContent }
     * 
     */
    public SimplePageContent createSimplePageContent() {
        return new SimplePageContent();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link RectangleBase }
     * 
     */
    public RectangleBase createRectangleBase() {
        return new RectangleBase();
    }

    /**
     * Create an instance of {@link TextZone }
     * 
     */
    public TextZone createTextZone() {
        return new TextZone();
    }

    /**
     * Create an instance of {@link TableZone }
     * 
     */
    public TableZone createTableZone() {
        return new TableZone();
    }

    /**
     * Create an instance of {@link Words }
     * 
     */
    public Words createWords() {
        return new Words();
    }

    /**
     * Create an instance of {@link PictureZone }
     * 
     */
    public PictureZone createPictureZone() {
        return new PictureZone();
    }

    /**
     * Create an instance of {@link DocumentContent.Embedded }
     * 
     */
    public DocumentContent.Embedded createDocumentContentEmbedded() {
        return new DocumentContent.Embedded();
    }

    /**
     * Create an instance of {@link DocumentContent.Pages }
     * 
     */
    public DocumentContent.Pages createDocumentContentPages() {
        return new DocumentContent.Pages();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PageContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/public/intellix", name = "Page")
    public JAXBElement<PageContent> createPage(PageContent value) {
        return new JAXBElement<PageContent>(_Page_QNAME, PageContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/public/intellix", name = "Document")
    public JAXBElement<DocumentContent> createDocument(DocumentContent value) {
        return new JAXBElement<DocumentContent>(_Document_QNAME, DocumentContent.class, null, value);
    }



}
