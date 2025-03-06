
package com.itson.soapcliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "SOAPImpl", targetNamespace = "http://webServices/", wsdlLocation = "http://localhost:8081/?wsdl")
public class SOAPImpl_Service
    extends Service
{

    private static final URL SOAPIMPL_WSDL_LOCATION;
    private static final WebServiceException SOAPIMPL_EXCEPTION;
    private static final QName SOAPIMPL_QNAME = new QName("http://webServices/", "SOAPImpl");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPIMPL_WSDL_LOCATION = url;
        SOAPIMPL_EXCEPTION = e;
    }

    public SOAPImpl_Service() {
        super(__getWsdlLocation(), SOAPIMPL_QNAME);
    }

    public SOAPImpl_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPIMPL_QNAME, features);
    }

    public SOAPImpl_Service(URL wsdlLocation) {
        super(wsdlLocation, SOAPIMPL_QNAME);
    }

    public SOAPImpl_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPIMPL_QNAME, features);
    }

    public SOAPImpl_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SOAPImpl_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SOAPImpl
     */
    @WebEndpoint(name = "SOAPImplPort")
    public SOAPImpl getSOAPImplPort() {
        return super.getPort(new QName("http://webServices/", "SOAPImplPort"), SOAPImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SOAPImpl
     */
    @WebEndpoint(name = "SOAPImplPort")
    public SOAPImpl getSOAPImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webServices/", "SOAPImplPort"), SOAPImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPIMPL_EXCEPTION!= null) {
            throw SOAPIMPL_EXCEPTION;
        }
        return SOAPIMPL_WSDL_LOCATION;
    }

}
