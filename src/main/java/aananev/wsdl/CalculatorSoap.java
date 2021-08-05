package aananev.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "CalculatorSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface CalculatorSoap {

    /**
     * Adds two integers.This is a test WebService.
     *
     * @param intA
     * @param intB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Add", action = "http://tempuri.org/Add")
    @WebResult(name = "AddResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Add", targetNamespace = "http://tempuri.org/", className = "aananev.wsdl.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://tempuri.org/", className = "aananev.wsdl.AddResponse")
    public int add(
            @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
            int intA,
            @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
            int intB);

    /**
     *
     * @param intA
     * @param intB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Subtract", action = "http://tempuri.org/Subtract")
    @WebResult(name = "SubtractResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Subtract", targetNamespace = "http://tempuri.org/", className = "aananev.wsdl.Subtract")
    @ResponseWrapper(localName = "SubtractResponse", targetNamespace = "http://tempuri.org/", className = "aananev.wsdl.SubtractResponse")
    public int subtract(
            @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
            int intA,
            @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
            int intB);

    /**
     *
     * @param intA
     * @param intB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Multiply", action = "http://tempuri.org/Multiply")
    @WebResult(name = "MultiplyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Multiply", targetNamespace = "http://tempuri.org/", className = "aananev.wsdl.Multiply")
    @ResponseWrapper(localName = "MultiplyResponse", targetNamespace = "http://tempuri.org/", className = "aananev.wsdl.MultiplyResponse")
    public int multiply(
            @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
            int intA,
            @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
            int intB);

    /**
     *
     * @param intA
     * @param intB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Divide", action = "http://tempuri.org/Divide")
    @WebResult(name = "DivideResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Divide", targetNamespace = "http://tempuri.org/", className = "aananev.wsdl.Divide")
    @ResponseWrapper(localName = "DivideResponse", targetNamespace = "http://tempuri.org/", className = "aananev.wsdl.DivideResponse")
    public int divide(
            @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
            int intA,
            @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
            int intB);
}
