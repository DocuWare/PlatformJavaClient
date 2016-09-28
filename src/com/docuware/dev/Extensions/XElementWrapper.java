/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.io.OutputStream;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author Patrick
 */
    @XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
})
    public class XElementWrapper
    {
        @XmlAnyElement(lax=true)
        Object el;

        /// <summary>
        /// Initializes a new instance of the <see cref="XElementWrapper"/> class.
        /// </summary>
        public XElementWrapper() { }
        
        XElementWrapper(Object o) {
            el = o;
        }
        
        Object getEl() { return el;}

        /// <summary>
        /// Initializes a new instance of the <see cref="XElementWrapper"/> class.
        /// </summary>
        /// <param name="el">The el.</param>
        public XElementWrapper(JAXBElement<?> el)
        {
            this.el = el;
        }

        /// <summary>
        /// Performs an implicit conversion from <see cref="XElement"/> to <see cref="XElementWrapper"/>.
        /// </summary>
        /// <param name="element">The element.</param>
        /// <returns>
        /// The result of the conversion.
        /// </returns>
        public static  XElementWrapper toXElementWrapper(JAXBElement<?> element)
        {
            return new XElementWrapper(element);
        }

        /// <summary>
        /// Performs an implicit conversion from <see cref="XElementWrapper"/> to <see cref="XElement"/>.
        /// </summary>
        /// <param name="elementWrapper">The element wrapper.</param>
        /// <returns>
        /// The result of the conversion.
        /// </returns>
        public static  JAXBElement<?> toXElement(XElementWrapper elementWrapper)
        {
            if(elementWrapper.el instanceof JAXBElement) 
            return (JAXBElement<?>) elementWrapper.el;
            else throw new RuntimeException("Unknown XML-Schema-Type");
        }

        /// <summary>
        /// Generates an object from its XML representation.
        /// </summary>
        /// <param name="reader">The <see cref="T:System.Xml.XmlReader" /> stream from which the object is deserialized.</param>
        public void readXml(XMLStreamReader reader, Class<?> expectedType)
        {
            try {
                JAXBContext jc = JAXBContext.newInstance(expectedType);
                el = jc.createUnmarshaller().unmarshal(reader, expectedType);
            } catch (JAXBException ex) {
                throw new RuntimeException(ex.getCause());
            }
         }

        /// <summary>
        /// Converts an object into its XML representation.
        /// </summary>
        /// <param name="writer">The <see cref="T:System.Xml.XmlWriter" /> stream to which the object is serialized.</param>
        public void writeXml(XMLStreamWriter writer)
        {
            if(this.el instanceof JAXBElement) {
                JAXBElement<?> el = (JAXBElement<?>) this.el; 
                try {
                    if(el!=null) {
                    JAXBContext jc = JAXBContext.newInstance(el.getDeclaredType());
                    Marshaller m = jc.createMarshaller();
                    m.marshal(el.getValue(), writer);}
                } catch (JAXBException ex) {
                    throw new RuntimeException(ex.getCause());
                }
            }
            else throw new RuntimeException("Unknown XML-Schema-Type");
        }


        /// <summary>
        /// Outputs the wrapped element to the specified <see cref="Stream"/> instance.
        /// </summary>
        /// <param name="stream">The stream.</param>
        public void save(OutputStream stream)
        {
            if(this.el instanceof JAXBElement) {
                JAXBElement<?> el = (JAXBElement<?>) this.el; 
                try {
                    if(el!=null) {
                    JAXBContext jc = JAXBContext.newInstance(el.getDeclaredType());
                    Marshaller m = jc.createMarshaller();
                    m.marshal(el.getValue(), stream);}
                } catch (JAXBException ex) {
                    throw new RuntimeException(ex.getCause());
                }
                }
            else throw new RuntimeException("Unknown XML-Schema-Type");
            }
            
        



        /// <summary>
        /// Outputs the wrapped element to the specified <see cref="TextWriter"/> instance.
        /// </summary>
        /// <param name="textWriter">The text writer.</param>
        public void save(Writer textWriter)
        {
            if(this.el instanceof JAXBElement) {
                JAXBElement<?> el = (JAXBElement<?>) this.el; 
                try {
                    if(el!=null) {
                    JAXBContext jc = JAXBContext.newInstance(el.getDeclaredType());
                    Marshaller m = jc.createMarshaller();
                    m.marshal(el.getValue(), textWriter);
                    }
                } catch (JAXBException ex) {
                    throw new RuntimeException(ex.getCause());
                }
            }
            else throw new RuntimeException("Unknown XML-Schema-Type");
        }
        
        public void save(XMLStreamWriter textWriter)
        {
            if(this.el instanceof JAXBElement) {
                JAXBElement<?> el = (JAXBElement<?>) this.el; 
                try {
                    if(el!=null) {
                    JAXBContext jc = JAXBContext.newInstance(el.getDeclaredType());
                    Marshaller m = jc.createMarshaller();
                    m.marshal(el.getValue(), textWriter);
                    }
                } catch (JAXBException ex) {
                    throw new RuntimeException(ex.getCause());
                }
            }
            else throw new RuntimeException("Unknown XML-Schema-Type");
        }
}
