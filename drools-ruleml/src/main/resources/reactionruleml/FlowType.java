//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2-70- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.02 at 03:31:08 PM MEZ 
//


package reactionruleml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flow.type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow.type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.ruleml.org/1.0/xsd}Flow.content"/>
 *       &lt;attGroup ref="{http://www.ruleml.org/1.0/xsd}Flow.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow.type", propOrder = {
    "oid",
    "actionContent"
})
public class FlowType {

    protected OidType oid;
    @XmlElements({
        @XmlElement(name = "Ind", type = IndType.class),
        @XmlElement(name = "Flow", type = FlowType.class),
        @XmlElement(name = "Loop", type = LoopType.class),
        @XmlElement(name = "Rule", type = RuleType.class),
        @XmlElement(name = "Var", type = VarType.class),
        @XmlElement(name = "Update", type = UpdateType.class),
        @XmlElement(name = "Message", type = MessageType.class),
        @XmlElement(name = "Assert", type = AssertType.class),
        @XmlElement(name = "Retract", type = RetractType.class),
        @XmlElement(name = "Atom", type = AtomType.class),
        @XmlElement(name = "Choice", type = ChoiceType.class),
        @XmlElement(name = "do", type = DoType.class),
        @XmlElement(name = "Expr", type = ExprType.class),
        @XmlElement(name = "Succession", type = SuccessionType.class)
    })
    protected List<Object> actionContent;

    /**
     * Gets the value of the oid property.
     * 
     * @return
     *     possible object is
     *     {@link OidType }
     *     
     */
    public OidType getOid() {
        return oid;
    }

    /**
     * Sets the value of the oid property.
     * 
     * @param value
     *     allowed object is
     *     {@link OidType }
     *     
     */
    public void setOid(OidType value) {
        this.oid = value;
    }

    /**
     * Gets the value of the actionContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndType }
     * {@link FlowType }
     * {@link LoopType }
     * {@link RuleType }
     * {@link VarType }
     * {@link UpdateType }
     * {@link MessageType }
     * {@link AssertType }
     * {@link RetractType }
     * {@link AtomType }
     * {@link ChoiceType }
     * {@link DoType }
     * {@link ExprType }
     * {@link SuccessionType }
     * 
     * 
     */
    public List<Object> getActionContent() {
        if (actionContent == null) {
            actionContent = new ArrayList<Object>();
        }
        return this.actionContent;
    }

}
