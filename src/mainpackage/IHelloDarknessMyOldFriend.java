
package mainpackage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IHelloDarknessMyOldFriend", targetNamespace = "http://mainpackage/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IHelloDarknessMyOldFriend {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getString", targetNamespace = "http://mainpackage/", className = "mainpackage.GetString")
    @ResponseWrapper(localName = "getStringResponse", targetNamespace = "http://mainpackage/", className = "mainpackage.GetStringResponse")
    @Action(input = "http://mainpackage/IHelloDarknessMyOldFriend/getStringRequest", output = "http://mainpackage/IHelloDarknessMyOldFriend/getStringResponse")
    public String getString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
