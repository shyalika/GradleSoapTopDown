package com.shyali.service;

import javax.ejb.Startup;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;
import org.jboss.ws.api.annotation.WebContext;

@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@WebService(
        serviceName = "HelloService",
        portName = "HelloPort",
        endpointInterface = "com.shyali.service.Hello",
        targetNamespace = "http://service.shyali.com",
        wsdlLocation = "META-INF/wsdl/Hello.wsdl")
@WebContext(contextRoot = "/shyali/GradleSoapTopDown", urlPattern = "HelloService")
@SchemaValidation(type = SchemaValidationType.NONE)
@Stateless
@Startup
public class HelloServiceImpl implements Hello {

    @Override
    @WebMethod
    public String helloName(@WebParam(
            name = "name",
            targetNamespace = "http://service.shyali.com") String name) {
        return "Hello " + name + "!";
    }
}
