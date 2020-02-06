
package com.ektha.freshdeskwebservices.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ektha.freshdeskwebservices.service package. 
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
public class ObjectFactory {

    private final static QName _CreateTicket_QNAME = new QName("http://service.freshdeskwebservices.ektha.com/", "createTicket");
    private final static QName _CreateTicketResponse_QNAME = new QName("http://service.freshdeskwebservices.ektha.com/", "createTicketResponse");
    private final static QName _GetTicket_QNAME = new QName("http://service.freshdeskwebservices.ektha.com/", "getTicket");
    private final static QName _GetTicketResponse_QNAME = new QName("http://service.freshdeskwebservices.ektha.com/", "getTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ektha.freshdeskwebservices.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateTicket }
     * 
     */
    public CreateTicket createCreateTicket() {
        return new CreateTicket();
    }

    /**
     * Create an instance of {@link CreateTicketResponse }
     * 
     */
    public CreateTicketResponse createCreateTicketResponse() {
        return new CreateTicketResponse();
    }

    /**
     * Create an instance of {@link GetTicket }
     * 
     */
    public GetTicket createGetTicket() {
        return new GetTicket();
    }

    /**
     * Create an instance of {@link GetTicketResponse }
     * 
     */
    public GetTicketResponse createGetTicketResponse() {
        return new GetTicketResponse();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.freshdeskwebservices.ektha.com/", name = "createTicket")
    public JAXBElement<CreateTicket> createCreateTicket(CreateTicket value) {
        return new JAXBElement<CreateTicket>(_CreateTicket_QNAME, CreateTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.freshdeskwebservices.ektha.com/", name = "createTicketResponse")
    public JAXBElement<CreateTicketResponse> createCreateTicketResponse(CreateTicketResponse value) {
        return new JAXBElement<CreateTicketResponse>(_CreateTicketResponse_QNAME, CreateTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicket }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicket }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.freshdeskwebservices.ektha.com/", name = "getTicket")
    public JAXBElement<GetTicket> createGetTicket(GetTicket value) {
        return new JAXBElement<GetTicket>(_GetTicket_QNAME, GetTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTicketResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.freshdeskwebservices.ektha.com/", name = "getTicketResponse")
    public JAXBElement<GetTicketResponse> createGetTicketResponse(GetTicketResponse value) {
        return new JAXBElement<GetTicketResponse>(_GetTicketResponse_QNAME, GetTicketResponse.class, null, value);
    }

}
