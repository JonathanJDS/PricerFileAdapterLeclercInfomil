//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.05.14 � 05:05:05 PM CEST 
//


package generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="COMMENTAIRE" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ARTS" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="MART" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TAX">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DEEE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="D3EM" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;fractionDigits value="2"/>
 *                                                     &lt;totalDigits value="7"/>
 *                                                     &lt;maxInclusive value="99999.99"/>
 *                                                     &lt;minInclusive value="0.00"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="D3ET" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="1"/>
 *                                                     &lt;pattern value="[0-9]|[A-Z]"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TAXE" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="CT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="VAL" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="TVA" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;pattern value="[0-9]|[A-Z]"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PXQT">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="PRXU" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="QTEU">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTES">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTEQ">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="PESEE">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;length value="1"/>
 *                                                               &lt;enumeration value="O"/>
 *                                                               &lt;enumeration value="N"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="UNITE">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="3"/>
 *                                                               &lt;enumeration value="KG"/>
 *                                                               &lt;enumeration value="L"/>
 *                                                               &lt;enumeration value="M"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTEC">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="UNITE">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="3"/>
 *                                                               &lt;enumeration value="KG"/>
 *                                                               &lt;enumeration value="L"/>
 *                                                               &lt;enumeration value="M"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/choice>
 *                                               &lt;attribute name="PUTTC" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;minInclusive value="0.00"/>
 *                                                     &lt;maxInclusive value="999999"/>
 *                                                     &lt;fractionDigits value="2"/>
 *                                                     &lt;totalDigits value="7"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="SEUIL">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;minInclusive value="0.000"/>
 *                                                     &lt;totalDigits value="8"/>
 *                                                     &lt;fractionDigits value="3"/>
 *                                                     &lt;maxInclusive value="99999.999"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PRXS">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="QTEU">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTES">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTEQ">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="PESEE">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;length value="1"/>
 *                                                               &lt;enumeration value="O"/>
 *                                                               &lt;enumeration value="N"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="UNITE">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="3"/>
 *                                                               &lt;enumeration value="KG"/>
 *                                                               &lt;enumeration value="L"/>
 *                                                               &lt;enumeration value="M"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTEC">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="UNITE">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;maxLength value="3"/>
 *                                                               &lt;enumeration value="KG"/>
 *                                                               &lt;enumeration value="L"/>
 *                                                               &lt;enumeration value="M"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PRXC">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="QTES">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTEU">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/choice>
 *                                     &lt;attribute name="PXZ">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="O"/>
 *                                           &lt;enumeration value="N"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CHA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="13"/>
 *                                   &lt;pattern value="\d{13}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="STM" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CN" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="2"/>
 *                                           &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="CE" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="15"/>
 *                                           &lt;pattern value="\d{1,15}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DCOG" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="IUM" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="PUM" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;minInclusive value="0.00"/>
 *                                                     &lt;maxInclusive value="99999.99"/>
 *                                                     &lt;totalDigits value="7"/>
 *                                                     &lt;fractionDigits value="2"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="LIBU">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="20"/>
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;pattern value=".{1,20}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="CONT" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="CONTV" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;minInclusive value="000.000"/>
 *                                                     &lt;maxInclusive value="999.999"/>
 *                                                     &lt;totalDigits value="6"/>
 *                                                     &lt;fractionDigits value="3"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="LIBU">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="20"/>
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;pattern value=".{1,20}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="CONTT">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="20"/>
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;pattern value=".{1,20}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="CIA">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="15"/>
 *                                           &lt;pattern value="\d{1,15}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="NAC">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="12"/>
 *                                           &lt;pattern value="\d{4}\d{5}\d{2}[A-Z0-9]"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="CLEC">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="9"/>
 *                                           &lt;pattern value="\d{9}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="LIBS">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="80"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="MARQ">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="31"/>
 *                                           &lt;minLength value="1"/>
 *                                           &lt;pattern value=".{1,31}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="NF">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="31"/>
 *                                           &lt;minLength value="1"/>
 *                                           &lt;pattern value=".{1,31}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="DISP">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="O"/>
 *                                           &lt;enumeration value="N"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="PROM">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="N"/>
 *                                           &lt;enumeration value="O"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="PDRF">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;minInclusive value="0.00"/>
 *                                           &lt;maxInclusive value="99999.99"/>
 *                                           &lt;totalDigits value="7"/>
 *                                           &lt;fractionDigits value="2"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="TRPR">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;minInclusive value="1"/>
 *                                           &lt;maxInclusive value="100"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="TXPRC">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="15"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="TXPRL">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="50"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="RFPR">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="50"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="APAR">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="10"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DCOT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TAS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="DFL" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="ORIG">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="30"/>
 *                                                     &lt;pattern value=".{1,30}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="CAL">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="10"/>
 *                                                     &lt;pattern value=".{1,10}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="CAT">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="5"/>
 *                                                     &lt;pattern value=".{1,5}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="VART">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="30"/>
 *                                                     &lt;pattern value=".{1,30}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="PLUB">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="6"/>
 *                                                     &lt;pattern value="\d{1,6}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="BIO">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="0"/>
 *                                                     &lt;maxLength value="3"/>
 *                                                     &lt;enumeration value="BIO"/>
 *                                                     &lt;enumeration value=""/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="MESP1">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="30"/>
 *                                                     &lt;pattern value=".{1,30}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="MESP2">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="30"/>
 *                                                     &lt;pattern value=".{1,30}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="CBAL">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="4"/>
 *                                                     &lt;pattern value=".{1,5}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TRTFL" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="0"/>
 *                                             &lt;maxLength value="300"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="BCO2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="VCUV">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;totalDigits value="6"/>
 *                                                     &lt;fractionDigits value="2"/>
 *                                                     &lt;minInclusive value="0"/>
 *                                                     &lt;maxInclusive value="9999.99"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="VCUM">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;minInclusive value="0"/>
 *                                                     &lt;maxInclusive value="9999.99"/>
 *                                                     &lt;totalDigits value="6"/>
 *                                                     &lt;fractionDigits value="2"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="LIBU">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;maxLength value="20"/>
 *                                                     &lt;pattern value=".{1,20}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="LYT">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="40"/>
 *                                           &lt;pattern value=".{1,40}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="LMRG">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;pattern value="[A-Z]"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DCOC" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ITCS" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="LGN" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="TXT" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;maxLength value="40"/>
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;pattern value=".{1,40}"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="SIZ" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;length value="2"/>
 *                                                               &lt;enumeration value="DH"/>
 *                                                               &lt;enumeration value="DL"/>
 *                                                               &lt;enumeration value="DD"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="NOTG" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="1"/>
 *                                                     &lt;enumeration value="O"/>
 *                                                     &lt;enumeration value="N"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ITCC" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="LGN" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="TXT" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;maxLength value="40"/>
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;pattern value=".{1,40}"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="SIZ" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;length value="2"/>
 *                                                               &lt;enumeration value="DH"/>
 *                                                               &lt;enumeration value="DL"/>
 *                                                               &lt;enumeration value="DD"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="NOTG" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="1"/>
 *                                                     &lt;enumeration value="O"/>
 *                                                     &lt;enumeration value="N"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="LIBT" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="30"/>
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;pattern value=".{1,30}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="TXT">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="160"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="MSG">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="160"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="AVOL">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="O"/>
 *                                           &lt;enumeration value="N"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="SSC">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="O"/>
 *                                           &lt;enumeration value="N"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DTECH" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GTIE" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LGAR" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="100"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="DGAR">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;fractionDigits value="2"/>
 *                                                     &lt;totalDigits value="7"/>
 *                                                     &lt;minExclusive value="0"/>
 *                                                     &lt;maxExclusive value="100000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="UGAR">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="20"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PIEC" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="LPIE" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="100"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="DPIE">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;totalDigits value="7"/>
 *                                                     &lt;fractionDigits value="2"/>
 *                                                     &lt;minExclusive value="0"/>
 *                                                     &lt;maxExclusive value="100000"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="UPIE">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="20"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="LDNC">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="100"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ART" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="13"/>
 *                                 &lt;pattern value="\d{13}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="LIB" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="31"/>
 *                                 &lt;minLength value="1"/>
 *                                 &lt;pattern value=".{1,31}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VCR">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="31"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SART" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ART" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="13"/>
 *                                 &lt;pattern value="\d{13}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VCR">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="31"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MCON" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PXQT">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="PRXU" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="QTEU">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTES">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/choice>
 *                                               &lt;attribute name="PUTTC" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;minInclusive value="0.00"/>
 *                                                     &lt;maxInclusive value="999999"/>
 *                                                     &lt;fractionDigits value="2"/>
 *                                                     &lt;totalDigits value="7"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="SEUIL">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                     &lt;minInclusive value="0.000"/>
 *                                                     &lt;totalDigits value="8"/>
 *                                                     &lt;fractionDigits value="3"/>
 *                                                     &lt;maxInclusive value="99999.999"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PRXS">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="QTEU">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="QTES">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PRXC">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="QTEU">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/choice>
 *                                     &lt;attribute name="PXZ">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="1"/>
 *                                           &lt;enumeration value="O"/>
 *                                           &lt;enumeration value="N"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CHA" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;length value="13"/>
 *                                   &lt;pattern value="\d{13}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="DCOG" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CIA">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="15"/>
 *                                           &lt;pattern value="\d{1,15}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="CLEC">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;length value="9"/>
 *                                           &lt;pattern value="\d{9}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="LIBS">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="80"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="MARQ">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="31"/>
 *                                           &lt;minLength value="1"/>
 *                                           &lt;pattern value=".{1,31}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="NF">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="31"/>
 *                                           &lt;minLength value="1"/>
 *                                           &lt;pattern value=".{1,31}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DCOT" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TAS" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DCOC" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ITCS" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="LGN" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="TXT" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;maxLength value="40"/>
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;pattern value=".{1,40}"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="SIZ" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;length value="2"/>
 *                                                               &lt;enumeration value="DH"/>
 *                                                               &lt;enumeration value="DL"/>
 *                                                               &lt;enumeration value="DD"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="NOTG" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="1"/>
 *                                                     &lt;enumeration value="O"/>
 *                                                     &lt;enumeration value="N"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ITCC" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="LGN" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="TXT" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;maxLength value="40"/>
 *                                                               &lt;minLength value="1"/>
 *                                                               &lt;pattern value=".{1,40}"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                         &lt;attribute name="SIZ" use="required">
 *                                                           &lt;simpleType>
 *                                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;length value="2"/>
 *                                                               &lt;enumeration value="DH"/>
 *                                                               &lt;enumeration value="DL"/>
 *                                                               &lt;enumeration value="DD"/>
 *                                                             &lt;/restriction>
 *                                                           &lt;/simpleType>
 *                                                         &lt;/attribute>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="NOTG" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="1"/>
 *                                                     &lt;enumeration value="O"/>
 *                                                     &lt;enumeration value="N"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                               &lt;attribute name="LIBT" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;maxLength value="30"/>
 *                                                     &lt;minLength value="1"/>
 *                                                     &lt;pattern value=".{1,30}"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="TXT">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="160"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="MSG">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;maxLength value="160"/>
 *                                           &lt;minLength value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ART" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="13"/>
 *                                 &lt;pattern value="\d{13}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="LIB" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="31"/>
 *                                 &lt;minLength value="1"/>
 *                                 &lt;pattern value=".{1,31}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VCR">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="31"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SCON" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ART" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="13"/>
 *                                 &lt;pattern value="\d{13}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VCR">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="31"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TTVA" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="MTVA" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CTVA" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                                 &lt;pattern value="[0-9]|[A-Z]"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="TAUX" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;minInclusive value="0.00"/>
 *                                 &lt;maxInclusive value="99.99"/>
 *                                 &lt;totalDigits value="4"/>
 *                                 &lt;fractionDigits value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VCR">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="31"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="STVA" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CTVA" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="1"/>
 *                                 &lt;pattern value="[0-9]|[A-Z]"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VCR">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="31"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="STRM" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded">
 *                   &lt;element name="MSTM" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="STMR" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CNR" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="2"/>
 *                                           &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="CER" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="15"/>
 *                                           &lt;pattern value="\d{1,15}"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CN" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="2"/>
 *                                 &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="CE" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="15"/>
 *                                 &lt;pattern value="\d{1,15}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="LE" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="30"/>
 *                                 &lt;pattern value=".{1,30}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VCR">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="31"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SSTM" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="CN" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="2"/>
 *                                 &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="CE" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="15"/>
 *                                 &lt;pattern value="\d{1,15}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="VCR">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="31"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MONNAIE" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="3"/>
 *             &lt;pattern value="\d{3}"/>
 *             &lt;enumeration value="978"/>
 *             &lt;enumeration value="705"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CR">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *             &lt;enumeration value="O"/>
 *             &lt;enumeration value="N"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="VERSION" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="3"/>
 *             &lt;pattern value="\d{1}\.\d{1}"/>
 *             &lt;enumeration value="1.0"/>
 *             &lt;enumeration value="1.1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "commentaireAndARTSAndTTVA"
})
@XmlRootElement(name = "MDA")
public class MDA {

    @XmlElements({
        @XmlElement(name = "COMMENTAIRE", type = String.class),
        @XmlElement(name = "ARTS", type = MDA.ARTS.class),
        @XmlElement(name = "TTVA", type = MDA.TTVA.class),
        @XmlElement(name = "STRM", type = MDA.STRM.class)
    })
    protected List<Object> commentaireAndARTSAndTTVA;
    @XmlAttribute(name = "MONNAIE", required = true)
    protected String monnaie;
    @XmlAttribute(name = "CR")
    protected String cr;
    @XmlAttribute(name = "VERSION", required = true)
    protected String version;

    /**
     * Gets the value of the commentaireAndARTSAndTTVA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commentaireAndARTSAndTTVA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOMMENTAIREAndARTSAndTTVA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link MDA.ARTS }
     * {@link MDA.TTVA }
     * {@link MDA.STRM }
     * 
     * 
     */
    public List<Object> getCOMMENTAIREAndARTSAndTTVA() {
        if (commentaireAndARTSAndTTVA == null) {
            commentaireAndARTSAndTTVA = new ArrayList<Object>();
        }
        return this.commentaireAndARTSAndTTVA;
    }

    /**
     * Obtient la valeur de la propri�t� monnaie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMONNAIE() {
        return monnaie;
    }

    /**
     * D�finit la valeur de la propri�t� monnaie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMONNAIE(String value) {
        this.monnaie = value;
    }

    /**
     * Obtient la valeur de la propri�t� cr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCR() {
        return cr;
    }

    /**
     * D�finit la valeur de la propri�t� cr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCR(String value) {
        this.cr = value;
    }

    /**
     * Obtient la valeur de la propri�t� version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSION() {
        return version;
    }

    /**
     * D�finit la valeur de la propri�t� version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSION(String value) {
        this.version = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="MART" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TAX">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DEEE" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="D3EM" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;fractionDigits value="2"/>
     *                                           &lt;totalDigits value="7"/>
     *                                           &lt;maxInclusive value="99999.99"/>
     *                                           &lt;minInclusive value="0.00"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="D3ET" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="1"/>
     *                                           &lt;pattern value="[0-9]|[A-Z]"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TAXE" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="CT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="VAL" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="TVA" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;pattern value="[0-9]|[A-Z]"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PXQT">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="PRXU" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="QTEU">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTES">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTEQ">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="PESEE">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;length value="1"/>
     *                                                     &lt;enumeration value="O"/>
     *                                                     &lt;enumeration value="N"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="UNITE">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="3"/>
     *                                                     &lt;enumeration value="KG"/>
     *                                                     &lt;enumeration value="L"/>
     *                                                     &lt;enumeration value="M"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTEC">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="UNITE">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="3"/>
     *                                                     &lt;enumeration value="KG"/>
     *                                                     &lt;enumeration value="L"/>
     *                                                     &lt;enumeration value="M"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                     &lt;attribute name="PUTTC" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;minInclusive value="0.00"/>
     *                                           &lt;maxInclusive value="999999"/>
     *                                           &lt;fractionDigits value="2"/>
     *                                           &lt;totalDigits value="7"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="SEUIL">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;minInclusive value="0.000"/>
     *                                           &lt;totalDigits value="8"/>
     *                                           &lt;fractionDigits value="3"/>
     *                                           &lt;maxInclusive value="99999.999"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PRXS">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="QTEU">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTES">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTEQ">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="PESEE">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;length value="1"/>
     *                                                     &lt;enumeration value="O"/>
     *                                                     &lt;enumeration value="N"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="UNITE">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="3"/>
     *                                                     &lt;enumeration value="KG"/>
     *                                                     &lt;enumeration value="L"/>
     *                                                     &lt;enumeration value="M"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTEC">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="UNITE">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;maxLength value="3"/>
     *                                                     &lt;enumeration value="KG"/>
     *                                                     &lt;enumeration value="L"/>
     *                                                     &lt;enumeration value="M"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PRXC">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="QTES">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTEU">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                           &lt;attribute name="PXZ">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;enumeration value="O"/>
     *                                 &lt;enumeration value="N"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CHA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="13"/>
     *                         &lt;pattern value="\d{13}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="STM" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CN" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="2"/>
     *                                 &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="CE" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="15"/>
     *                                 &lt;pattern value="\d{1,15}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DCOG" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="IUM" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="PUM" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;minInclusive value="0.00"/>
     *                                           &lt;maxInclusive value="99999.99"/>
     *                                           &lt;totalDigits value="7"/>
     *                                           &lt;fractionDigits value="2"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="LIBU">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="20"/>
     *                                           &lt;minLength value="1"/>
     *                                           &lt;pattern value=".{1,20}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="CONT" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="CONTV" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;minInclusive value="000.000"/>
     *                                           &lt;maxInclusive value="999.999"/>
     *                                           &lt;totalDigits value="6"/>
     *                                           &lt;fractionDigits value="3"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="LIBU">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="20"/>
     *                                           &lt;minLength value="1"/>
     *                                           &lt;pattern value=".{1,20}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="CONTT">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="20"/>
     *                                           &lt;minLength value="1"/>
     *                                           &lt;pattern value=".{1,20}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="CIA">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="15"/>
     *                                 &lt;pattern value="\d{1,15}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="NAC">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="12"/>
     *                                 &lt;pattern value="\d{4}\d{5}\d{2}[A-Z0-9]"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="CLEC">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="9"/>
     *                                 &lt;pattern value="\d{9}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="LIBS">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="80"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="MARQ">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="31"/>
     *                                 &lt;minLength value="1"/>
     *                                 &lt;pattern value=".{1,31}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="NF">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="31"/>
     *                                 &lt;minLength value="1"/>
     *                                 &lt;pattern value=".{1,31}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="DISP">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;enumeration value="O"/>
     *                                 &lt;enumeration value="N"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="PROM">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;enumeration value="N"/>
     *                                 &lt;enumeration value="O"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="PDRF">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;minInclusive value="0.00"/>
     *                                 &lt;maxInclusive value="99999.99"/>
     *                                 &lt;totalDigits value="7"/>
     *                                 &lt;fractionDigits value="2"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="TRPR">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;minInclusive value="1"/>
     *                                 &lt;maxInclusive value="100"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="TXPRC">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="15"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="TXPRL">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="50"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="RFPR">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="50"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="APAR">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="10"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DCOT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TAS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="DFL" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="ORIG">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="30"/>
     *                                           &lt;pattern value=".{1,30}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="CAL">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="10"/>
     *                                           &lt;pattern value=".{1,10}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="CAT">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="5"/>
     *                                           &lt;pattern value=".{1,5}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="VART">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="30"/>
     *                                           &lt;pattern value=".{1,30}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="PLUB">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="6"/>
     *                                           &lt;pattern value="\d{1,6}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="BIO">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="0"/>
     *                                           &lt;maxLength value="3"/>
     *                                           &lt;enumeration value="BIO"/>
     *                                           &lt;enumeration value=""/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="MESP1">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="30"/>
     *                                           &lt;pattern value=".{1,30}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="MESP2">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="30"/>
     *                                           &lt;pattern value=".{1,30}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="CBAL">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="4"/>
     *                                           &lt;pattern value=".{1,5}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TRTFL" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="0"/>
     *                                   &lt;maxLength value="300"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="BCO2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="VCUV">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;totalDigits value="6"/>
     *                                           &lt;fractionDigits value="2"/>
     *                                           &lt;minInclusive value="0"/>
     *                                           &lt;maxInclusive value="9999.99"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="VCUM">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;minInclusive value="0"/>
     *                                           &lt;maxInclusive value="9999.99"/>
     *                                           &lt;totalDigits value="6"/>
     *                                           &lt;fractionDigits value="2"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="LIBU">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;minLength value="1"/>
     *                                           &lt;maxLength value="20"/>
     *                                           &lt;pattern value=".{1,20}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="LYT">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="40"/>
     *                                 &lt;pattern value=".{1,40}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="LMRG">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;pattern value="[A-Z]"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DCOC" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ITCS" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="LGN" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="TXT" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;maxLength value="40"/>
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;pattern value=".{1,40}"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="SIZ" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;length value="2"/>
     *                                                     &lt;enumeration value="DH"/>
     *                                                     &lt;enumeration value="DL"/>
     *                                                     &lt;enumeration value="DD"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="NOTG" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="1"/>
     *                                           &lt;enumeration value="O"/>
     *                                           &lt;enumeration value="N"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ITCC" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="LGN" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="TXT" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;maxLength value="40"/>
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;pattern value=".{1,40}"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="SIZ" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;length value="2"/>
     *                                                     &lt;enumeration value="DH"/>
     *                                                     &lt;enumeration value="DL"/>
     *                                                     &lt;enumeration value="DD"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="NOTG" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="1"/>
     *                                           &lt;enumeration value="O"/>
     *                                           &lt;enumeration value="N"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="LIBT" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="30"/>
     *                                           &lt;minLength value="1"/>
     *                                           &lt;pattern value=".{1,30}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="TXT">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="160"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="MSG">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="160"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="AVOL">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;enumeration value="O"/>
     *                                 &lt;enumeration value="N"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="SSC">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;enumeration value="O"/>
     *                                 &lt;enumeration value="N"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DTECH" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GTIE" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LGAR" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="100"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="DGAR">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;fractionDigits value="2"/>
     *                                           &lt;totalDigits value="7"/>
     *                                           &lt;minExclusive value="0"/>
     *                                           &lt;maxExclusive value="100000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="UGAR">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="20"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PIEC" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="LPIE" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="100"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="DPIE">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;totalDigits value="7"/>
     *                                           &lt;fractionDigits value="2"/>
     *                                           &lt;minExclusive value="0"/>
     *                                           &lt;maxExclusive value="100000"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="UPIE">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="20"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="LDNC">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="100"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ART" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="13"/>
     *                       &lt;pattern value="\d{13}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="LIB" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;maxLength value="31"/>
     *                       &lt;minLength value="1"/>
     *                       &lt;pattern value=".{1,31}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VCR">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="31"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SART" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ART" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="13"/>
     *                       &lt;pattern value="\d{13}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VCR">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="31"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MCON" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PXQT">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="PRXU" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="QTEU">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTES">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                     &lt;attribute name="PUTTC" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;minInclusive value="0.00"/>
     *                                           &lt;maxInclusive value="999999"/>
     *                                           &lt;fractionDigits value="2"/>
     *                                           &lt;totalDigits value="7"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="SEUIL">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                           &lt;minInclusive value="0.000"/>
     *                                           &lt;totalDigits value="8"/>
     *                                           &lt;fractionDigits value="3"/>
     *                                           &lt;maxInclusive value="99999.999"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PRXS">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="QTEU">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="QTES">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PRXC">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="QTEU">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                           &lt;attribute name="PXZ">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="1"/>
     *                                 &lt;enumeration value="O"/>
     *                                 &lt;enumeration value="N"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CHA" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;length value="13"/>
     *                         &lt;pattern value="\d{13}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="DCOG" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CIA">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="15"/>
     *                                 &lt;pattern value="\d{1,15}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="CLEC">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;length value="9"/>
     *                                 &lt;pattern value="\d{9}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="LIBS">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="80"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="MARQ">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="31"/>
     *                                 &lt;minLength value="1"/>
     *                                 &lt;pattern value=".{1,31}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="NF">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="31"/>
     *                                 &lt;minLength value="1"/>
     *                                 &lt;pattern value=".{1,31}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DCOT" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TAS" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DCOC" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ITCS" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="LGN" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="TXT" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;maxLength value="40"/>
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;pattern value=".{1,40}"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="SIZ" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;length value="2"/>
     *                                                     &lt;enumeration value="DH"/>
     *                                                     &lt;enumeration value="DL"/>
     *                                                     &lt;enumeration value="DD"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="NOTG" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="1"/>
     *                                           &lt;enumeration value="O"/>
     *                                           &lt;enumeration value="N"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ITCC" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="LGN" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="TXT" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;maxLength value="40"/>
     *                                                     &lt;minLength value="1"/>
     *                                                     &lt;pattern value=".{1,40}"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                               &lt;attribute name="SIZ" use="required">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;length value="2"/>
     *                                                     &lt;enumeration value="DH"/>
     *                                                     &lt;enumeration value="DL"/>
     *                                                     &lt;enumeration value="DD"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="NOTG" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="1"/>
     *                                           &lt;enumeration value="O"/>
     *                                           &lt;enumeration value="N"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                     &lt;attribute name="LIBT" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;maxLength value="30"/>
     *                                           &lt;minLength value="1"/>
     *                                           &lt;pattern value=".{1,30}"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="TXT">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="160"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="MSG">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;maxLength value="160"/>
     *                                 &lt;minLength value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ART" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="13"/>
     *                       &lt;pattern value="\d{13}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="LIB" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;maxLength value="31"/>
     *                       &lt;minLength value="1"/>
     *                       &lt;pattern value=".{1,31}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VCR">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="31"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SCON" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ART" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="13"/>
     *                       &lt;pattern value="\d{13}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VCR">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="31"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "martAndSARTAndMCON"
    })
    public static class ARTS {

        @XmlElements({
            @XmlElement(name = "MART", type = MDA.ARTS.MART.class),
            @XmlElement(name = "SART", type = MDA.ARTS.SART.class),
            @XmlElement(name = "MCON", type = MDA.ARTS.MCON.class),
            @XmlElement(name = "SCON", type = MDA.ARTS.SCON.class)
        })
        protected List<Object> martAndSARTAndMCON;

        /**
         * Gets the value of the martAndSARTAndMCON property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the martAndSARTAndMCON property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMARTAndSARTAndMCON().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MDA.ARTS.MART }
         * {@link MDA.ARTS.SART }
         * {@link MDA.ARTS.MCON }
         * {@link MDA.ARTS.SCON }
         * 
         * 
         */
        public List<Object> getMARTAndSARTAndMCON() {
            if (martAndSARTAndMCON == null) {
                martAndSARTAndMCON = new ArrayList<Object>();
            }
            return this.martAndSARTAndMCON;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TAX">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DEEE" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="D3EM" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;fractionDigits value="2"/>
         *                                 &lt;totalDigits value="7"/>
         *                                 &lt;maxInclusive value="99999.99"/>
         *                                 &lt;minInclusive value="0.00"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="D3ET" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="1"/>
         *                                 &lt;pattern value="[0-9]|[A-Z]"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TAXE" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="CT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="VAL" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="TVA" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;pattern value="[0-9]|[A-Z]"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PXQT">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="PRXU" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="QTEU">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTES">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTEQ">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="PESEE">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;length value="1"/>
         *                                           &lt;enumeration value="O"/>
         *                                           &lt;enumeration value="N"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="UNITE">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="3"/>
         *                                           &lt;enumeration value="KG"/>
         *                                           &lt;enumeration value="L"/>
         *                                           &lt;enumeration value="M"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTEC">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="UNITE">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="3"/>
         *                                           &lt;enumeration value="KG"/>
         *                                           &lt;enumeration value="L"/>
         *                                           &lt;enumeration value="M"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                           &lt;attribute name="PUTTC" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;minInclusive value="0.00"/>
         *                                 &lt;maxInclusive value="999999"/>
         *                                 &lt;fractionDigits value="2"/>
         *                                 &lt;totalDigits value="7"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="SEUIL">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;minInclusive value="0.000"/>
         *                                 &lt;totalDigits value="8"/>
         *                                 &lt;fractionDigits value="3"/>
         *                                 &lt;maxInclusive value="99999.999"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PRXS">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="QTEU">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTES">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTEQ">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="PESEE">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;length value="1"/>
         *                                           &lt;enumeration value="O"/>
         *                                           &lt;enumeration value="N"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="UNITE">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="3"/>
         *                                           &lt;enumeration value="KG"/>
         *                                           &lt;enumeration value="L"/>
         *                                           &lt;enumeration value="M"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTEC">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="UNITE">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;minLength value="1"/>
         *                                           &lt;maxLength value="3"/>
         *                                           &lt;enumeration value="KG"/>
         *                                           &lt;enumeration value="L"/>
         *                                           &lt;enumeration value="M"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PRXC">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="QTES">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTEU">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *                 &lt;attribute name="PXZ">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;enumeration value="O"/>
         *                       &lt;enumeration value="N"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CHA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="13"/>
         *               &lt;pattern value="\d{13}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="STM" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CN" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="2"/>
         *                       &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="CE" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="15"/>
         *                       &lt;pattern value="\d{1,15}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DCOG" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="IUM" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="PUM" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;minInclusive value="0.00"/>
         *                                 &lt;maxInclusive value="99999.99"/>
         *                                 &lt;totalDigits value="7"/>
         *                                 &lt;fractionDigits value="2"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="LIBU">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="20"/>
         *                                 &lt;minLength value="1"/>
         *                                 &lt;pattern value=".{1,20}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="CONT" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="CONTV" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;minInclusive value="000.000"/>
         *                                 &lt;maxInclusive value="999.999"/>
         *                                 &lt;totalDigits value="6"/>
         *                                 &lt;fractionDigits value="3"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="LIBU">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="20"/>
         *                                 &lt;minLength value="1"/>
         *                                 &lt;pattern value=".{1,20}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="CONTT">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="20"/>
         *                                 &lt;minLength value="1"/>
         *                                 &lt;pattern value=".{1,20}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="CIA">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="15"/>
         *                       &lt;pattern value="\d{1,15}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="NAC">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="12"/>
         *                       &lt;pattern value="\d{4}\d{5}\d{2}[A-Z0-9]"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="CLEC">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="9"/>
         *                       &lt;pattern value="\d{9}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="LIBS">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="80"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="MARQ">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="31"/>
         *                       &lt;minLength value="1"/>
         *                       &lt;pattern value=".{1,31}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="NF">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="31"/>
         *                       &lt;minLength value="1"/>
         *                       &lt;pattern value=".{1,31}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="DISP">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;enumeration value="O"/>
         *                       &lt;enumeration value="N"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="PROM">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;enumeration value="N"/>
         *                       &lt;enumeration value="O"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="PDRF">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;minInclusive value="0.00"/>
         *                       &lt;maxInclusive value="99999.99"/>
         *                       &lt;totalDigits value="7"/>
         *                       &lt;fractionDigits value="2"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="TRPR">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;minInclusive value="1"/>
         *                       &lt;maxInclusive value="100"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="TXPRC">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="15"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="TXPRL">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="50"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="RFPR">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="50"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="APAR">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="10"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DCOT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TAS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="DFL" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="ORIG">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="30"/>
         *                                 &lt;pattern value=".{1,30}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="CAL">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="10"/>
         *                                 &lt;pattern value=".{1,10}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="CAT">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="5"/>
         *                                 &lt;pattern value=".{1,5}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="VART">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="30"/>
         *                                 &lt;pattern value=".{1,30}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="PLUB">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="6"/>
         *                                 &lt;pattern value="\d{1,6}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="BIO">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="0"/>
         *                                 &lt;maxLength value="3"/>
         *                                 &lt;enumeration value="BIO"/>
         *                                 &lt;enumeration value=""/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="MESP1">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="30"/>
         *                                 &lt;pattern value=".{1,30}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="MESP2">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="30"/>
         *                                 &lt;pattern value=".{1,30}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="CBAL">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="4"/>
         *                                 &lt;pattern value=".{1,5}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TRTFL" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="0"/>
         *                         &lt;maxLength value="300"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="BCO2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="VCUV">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;totalDigits value="6"/>
         *                                 &lt;fractionDigits value="2"/>
         *                                 &lt;minInclusive value="0"/>
         *                                 &lt;maxInclusive value="9999.99"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="VCUM">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;minInclusive value="0"/>
         *                                 &lt;maxInclusive value="9999.99"/>
         *                                 &lt;totalDigits value="6"/>
         *                                 &lt;fractionDigits value="2"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="LIBU">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;minLength value="1"/>
         *                                 &lt;maxLength value="20"/>
         *                                 &lt;pattern value=".{1,20}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="LYT">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="40"/>
         *                       &lt;pattern value=".{1,40}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="LMRG">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;pattern value="[A-Z]"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DCOC" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ITCS" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="LGN" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="TXT" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;maxLength value="40"/>
         *                                           &lt;minLength value="1"/>
         *                                           &lt;pattern value=".{1,40}"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="SIZ" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;length value="2"/>
         *                                           &lt;enumeration value="DH"/>
         *                                           &lt;enumeration value="DL"/>
         *                                           &lt;enumeration value="DD"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="NOTG" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="1"/>
         *                                 &lt;enumeration value="O"/>
         *                                 &lt;enumeration value="N"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ITCC" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="LGN" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="TXT" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;maxLength value="40"/>
         *                                           &lt;minLength value="1"/>
         *                                           &lt;pattern value=".{1,40}"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="SIZ" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;length value="2"/>
         *                                           &lt;enumeration value="DH"/>
         *                                           &lt;enumeration value="DL"/>
         *                                           &lt;enumeration value="DD"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="NOTG" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="1"/>
         *                                 &lt;enumeration value="O"/>
         *                                 &lt;enumeration value="N"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="LIBT" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="30"/>
         *                                 &lt;minLength value="1"/>
         *                                 &lt;pattern value=".{1,30}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="TXT">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="160"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="MSG">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="160"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="AVOL">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;enumeration value="O"/>
         *                       &lt;enumeration value="N"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="SSC">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;enumeration value="O"/>
         *                       &lt;enumeration value="N"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DTECH" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GTIE" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="LGAR" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="100"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="DGAR">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;fractionDigits value="2"/>
         *                                 &lt;totalDigits value="7"/>
         *                                 &lt;minExclusive value="0"/>
         *                                 &lt;maxExclusive value="100000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="UGAR">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="20"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PIEC" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="LPIE" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="100"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="DPIE">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;totalDigits value="7"/>
         *                                 &lt;fractionDigits value="2"/>
         *                                 &lt;minExclusive value="0"/>
         *                                 &lt;maxExclusive value="100000"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="UPIE">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="20"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="LDNC">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="100"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ART" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="13"/>
         *             &lt;pattern value="\d{13}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="LIB" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;maxLength value="31"/>
         *             &lt;minLength value="1"/>
         *             &lt;pattern value=".{1,31}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VCR">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="31"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tax",
            "pxqt",
            "cha",
            "stm",
            "dcog",
            "dcot",
            "dcoc",
            "dtech"
        })
        public static class MART {

            @XmlElement(name = "TAX", required = true)
            protected MDA.ARTS.MART.TAX tax;
            @XmlElement(name = "PXQT", required = true)
            protected MDA.ARTS.MART.PXQT pxqt;
            @XmlElement(name = "CHA")
            protected String cha;
            @XmlElement(name = "STM", required = true)
            protected List<MDA.ARTS.MART.STM> stm;
            @XmlElement(name = "DCOG")
            protected MDA.ARTS.MART.DCOG dcog;
            @XmlElement(name = "DCOT")
            protected MDA.ARTS.MART.DCOT dcot;
            @XmlElement(name = "DCOC")
            protected MDA.ARTS.MART.DCOC dcoc;
            @XmlElement(name = "DTECH")
            protected MDA.ARTS.MART.DTECH dtech;
            @XmlAttribute(name = "ART", required = true)
            protected String art;
            @XmlAttribute(name = "LIB", required = true)
            protected String lib;
            @XmlAttribute(name = "VCR")
            protected String vcr;

            /**
             * Obtient la valeur de la propri�t� tax.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MART.TAX }
             *     
             */
            public MDA.ARTS.MART.TAX getTAX() {
                return tax;
            }

            /**
             * D�finit la valeur de la propri�t� tax.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MART.TAX }
             *     
             */
            public void setTAX(MDA.ARTS.MART.TAX value) {
                this.tax = value;
            }

            /**
             * Obtient la valeur de la propri�t� pxqt.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MART.PXQT }
             *     
             */
            public MDA.ARTS.MART.PXQT getPXQT() {
                return pxqt;
            }

            /**
             * D�finit la valeur de la propri�t� pxqt.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MART.PXQT }
             *     
             */
            public void setPXQT(MDA.ARTS.MART.PXQT value) {
                this.pxqt = value;
            }

            /**
             * Obtient la valeur de la propri�t� cha.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHA() {
                return cha;
            }

            /**
             * D�finit la valeur de la propri�t� cha.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHA(String value) {
                this.cha = value;
            }

            /**
             * Gets the value of the stm property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stm property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSTM().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MDA.ARTS.MART.STM }
             * 
             * 
             */
            public List<MDA.ARTS.MART.STM> getSTM() {
                if (stm == null) {
                    stm = new ArrayList<MDA.ARTS.MART.STM>();
                }
                return this.stm;
            }

            /**
             * Obtient la valeur de la propri�t� dcog.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MART.DCOG }
             *     
             */
            public MDA.ARTS.MART.DCOG getDCOG() {
                return dcog;
            }

            /**
             * D�finit la valeur de la propri�t� dcog.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MART.DCOG }
             *     
             */
            public void setDCOG(MDA.ARTS.MART.DCOG value) {
                this.dcog = value;
            }

            /**
             * Obtient la valeur de la propri�t� dcot.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MART.DCOT }
             *     
             */
            public MDA.ARTS.MART.DCOT getDCOT() {
                return dcot;
            }

            /**
             * D�finit la valeur de la propri�t� dcot.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MART.DCOT }
             *     
             */
            public void setDCOT(MDA.ARTS.MART.DCOT value) {
                this.dcot = value;
            }

            /**
             * Obtient la valeur de la propri�t� dcoc.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MART.DCOC }
             *     
             */
            public MDA.ARTS.MART.DCOC getDCOC() {
                return dcoc;
            }

            /**
             * D�finit la valeur de la propri�t� dcoc.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MART.DCOC }
             *     
             */
            public void setDCOC(MDA.ARTS.MART.DCOC value) {
                this.dcoc = value;
            }

            /**
             * Obtient la valeur de la propri�t� dtech.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MART.DTECH }
             *     
             */
            public MDA.ARTS.MART.DTECH getDTECH() {
                return dtech;
            }

            /**
             * D�finit la valeur de la propri�t� dtech.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MART.DTECH }
             *     
             */
            public void setDTECH(MDA.ARTS.MART.DTECH value) {
                this.dtech = value;
            }

            /**
             * Obtient la valeur de la propri�t� art.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getART() {
                return art;
            }

            /**
             * D�finit la valeur de la propri�t� art.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setART(String value) {
                this.art = value;
            }

            /**
             * Obtient la valeur de la propri�t� lib.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIB() {
                return lib;
            }

            /**
             * D�finit la valeur de la propri�t� lib.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIB(String value) {
                this.lib = value;
            }

            /**
             * Obtient la valeur de la propri�t� vcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCR() {
                return vcr;
            }

            /**
             * D�finit la valeur de la propri�t� vcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCR(String value) {
                this.vcr = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ITCS" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="LGN" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="TXT" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;maxLength value="40"/>
             *                                 &lt;minLength value="1"/>
             *                                 &lt;pattern value=".{1,40}"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="SIZ" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;length value="2"/>
             *                                 &lt;enumeration value="DH"/>
             *                                 &lt;enumeration value="DL"/>
             *                                 &lt;enumeration value="DD"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="NOTG" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="1"/>
             *                       &lt;enumeration value="O"/>
             *                       &lt;enumeration value="N"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ITCC" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="LGN" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="TXT" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;maxLength value="40"/>
             *                                 &lt;minLength value="1"/>
             *                                 &lt;pattern value=".{1,40}"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="SIZ" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;length value="2"/>
             *                                 &lt;enumeration value="DH"/>
             *                                 &lt;enumeration value="DL"/>
             *                                 &lt;enumeration value="DD"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="NOTG" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="1"/>
             *                       &lt;enumeration value="O"/>
             *                       &lt;enumeration value="N"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="LIBT" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="30"/>
             *                       &lt;minLength value="1"/>
             *                       &lt;pattern value=".{1,30}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="TXT">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="160"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="MSG">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="160"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="AVOL">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;enumeration value="O"/>
             *             &lt;enumeration value="N"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="SSC">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;enumeration value="O"/>
             *             &lt;enumeration value="N"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "itcs",
                "itcc"
            })
            public static class DCOC {

                @XmlElement(name = "ITCS")
                protected MDA.ARTS.MART.DCOC.ITCS itcs;
                @XmlElement(name = "ITCC")
                protected List<MDA.ARTS.MART.DCOC.ITCC> itcc;
                @XmlAttribute(name = "TXT")
                protected String txt;
                @XmlAttribute(name = "MSG")
                protected String msg;
                @XmlAttribute(name = "AVOL")
                protected String avol;
                @XmlAttribute(name = "SSC")
                protected String ssc;

                /**
                 * Obtient la valeur de la propri�t� itcs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.DCOC.ITCS }
                 *     
                 */
                public MDA.ARTS.MART.DCOC.ITCS getITCS() {
                    return itcs;
                }

                /**
                 * D�finit la valeur de la propri�t� itcs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.DCOC.ITCS }
                 *     
                 */
                public void setITCS(MDA.ARTS.MART.DCOC.ITCS value) {
                    this.itcs = value;
                }

                /**
                 * Gets the value of the itcc property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itcc property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getITCC().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MDA.ARTS.MART.DCOC.ITCC }
                 * 
                 * 
                 */
                public List<MDA.ARTS.MART.DCOC.ITCC> getITCC() {
                    if (itcc == null) {
                        itcc = new ArrayList<MDA.ARTS.MART.DCOC.ITCC>();
                    }
                    return this.itcc;
                }

                /**
                 * Obtient la valeur de la propri�t� txt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTXT() {
                    return txt;
                }

                /**
                 * D�finit la valeur de la propri�t� txt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTXT(String value) {
                    this.txt = value;
                }

                /**
                 * Obtient la valeur de la propri�t� msg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMSG() {
                    return msg;
                }

                /**
                 * D�finit la valeur de la propri�t� msg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMSG(String value) {
                    this.msg = value;
                }

                /**
                 * Obtient la valeur de la propri�t� avol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAVOL() {
                    return avol;
                }

                /**
                 * D�finit la valeur de la propri�t� avol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAVOL(String value) {
                    this.avol = value;
                }

                /**
                 * Obtient la valeur de la propri�t� ssc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSSC() {
                    return ssc;
                }

                /**
                 * D�finit la valeur de la propri�t� ssc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSSC(String value) {
                    this.ssc = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="LGN" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="TXT" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;maxLength value="40"/>
                 *                       &lt;minLength value="1"/>
                 *                       &lt;pattern value=".{1,40}"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="SIZ" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;length value="2"/>
                 *                       &lt;enumeration value="DH"/>
                 *                       &lt;enumeration value="DL"/>
                 *                       &lt;enumeration value="DD"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="NOTG" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="1"/>
                 *             &lt;enumeration value="O"/>
                 *             &lt;enumeration value="N"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="LIBT" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="30"/>
                 *             &lt;minLength value="1"/>
                 *             &lt;pattern value=".{1,30}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "lgn"
                })
                public static class ITCC {

                    @XmlElement(name = "LGN", required = true)
                    protected List<MDA.ARTS.MART.DCOC.ITCC.LGN> lgn;
                    @XmlAttribute(name = "NOTG", required = true)
                    protected String notg;
                    @XmlAttribute(name = "LIBT", required = true)
                    protected String libt;

                    /**
                     * Gets the value of the lgn property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lgn property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLGN().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MDA.ARTS.MART.DCOC.ITCC.LGN }
                     * 
                     * 
                     */
                    public List<MDA.ARTS.MART.DCOC.ITCC.LGN> getLGN() {
                        if (lgn == null) {
                            lgn = new ArrayList<MDA.ARTS.MART.DCOC.ITCC.LGN>();
                        }
                        return this.lgn;
                    }

                    /**
                     * Obtient la valeur de la propri�t� notg.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNOTG() {
                        return notg;
                    }

                    /**
                     * D�finit la valeur de la propri�t� notg.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNOTG(String value) {
                        this.notg = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� libt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLIBT() {
                        return libt;
                    }

                    /**
                     * D�finit la valeur de la propri�t� libt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLIBT(String value) {
                        this.libt = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="TXT" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;maxLength value="40"/>
                     *             &lt;minLength value="1"/>
                     *             &lt;pattern value=".{1,40}"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="SIZ" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;length value="2"/>
                     *             &lt;enumeration value="DH"/>
                     *             &lt;enumeration value="DL"/>
                     *             &lt;enumeration value="DD"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class LGN {

                        @XmlAttribute(name = "TXT", required = true)
                        protected String txt;
                        @XmlAttribute(name = "SIZ", required = true)
                        protected String siz;

                        /**
                         * Obtient la valeur de la propri�t� txt.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTXT() {
                            return txt;
                        }

                        /**
                         * D�finit la valeur de la propri�t� txt.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTXT(String value) {
                            this.txt = value;
                        }

                        /**
                         * Obtient la valeur de la propri�t� siz.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSIZ() {
                            return siz;
                        }

                        /**
                         * D�finit la valeur de la propri�t� siz.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSIZ(String value) {
                            this.siz = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="LGN" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="TXT" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;maxLength value="40"/>
                 *                       &lt;minLength value="1"/>
                 *                       &lt;pattern value=".{1,40}"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="SIZ" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;length value="2"/>
                 *                       &lt;enumeration value="DH"/>
                 *                       &lt;enumeration value="DL"/>
                 *                       &lt;enumeration value="DD"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="NOTG" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="1"/>
                 *             &lt;enumeration value="O"/>
                 *             &lt;enumeration value="N"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "lgn"
                })
                public static class ITCS {

                    @XmlElement(name = "LGN", required = true)
                    protected List<MDA.ARTS.MART.DCOC.ITCS.LGN> lgn;
                    @XmlAttribute(name = "NOTG", required = true)
                    protected String notg;

                    /**
                     * Gets the value of the lgn property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lgn property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLGN().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MDA.ARTS.MART.DCOC.ITCS.LGN }
                     * 
                     * 
                     */
                    public List<MDA.ARTS.MART.DCOC.ITCS.LGN> getLGN() {
                        if (lgn == null) {
                            lgn = new ArrayList<MDA.ARTS.MART.DCOC.ITCS.LGN>();
                        }
                        return this.lgn;
                    }

                    /**
                     * Obtient la valeur de la propri�t� notg.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNOTG() {
                        return notg;
                    }

                    /**
                     * D�finit la valeur de la propri�t� notg.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNOTG(String value) {
                        this.notg = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="TXT" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;maxLength value="40"/>
                     *             &lt;minLength value="1"/>
                     *             &lt;pattern value=".{1,40}"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="SIZ" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;length value="2"/>
                     *             &lt;enumeration value="DH"/>
                     *             &lt;enumeration value="DL"/>
                     *             &lt;enumeration value="DD"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class LGN {

                        @XmlAttribute(name = "TXT", required = true)
                        protected String txt;
                        @XmlAttribute(name = "SIZ", required = true)
                        protected String siz;

                        /**
                         * Obtient la valeur de la propri�t� txt.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTXT() {
                            return txt;
                        }

                        /**
                         * D�finit la valeur de la propri�t� txt.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTXT(String value) {
                            this.txt = value;
                        }

                        /**
                         * Obtient la valeur de la propri�t� siz.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSIZ() {
                            return siz;
                        }

                        /**
                         * D�finit la valeur de la propri�t� siz.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSIZ(String value) {
                            this.siz = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="IUM" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="PUM" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;minInclusive value="0.00"/>
             *                       &lt;maxInclusive value="99999.99"/>
             *                       &lt;totalDigits value="7"/>
             *                       &lt;fractionDigits value="2"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="LIBU">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="20"/>
             *                       &lt;minLength value="1"/>
             *                       &lt;pattern value=".{1,20}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="CONT" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="CONTV" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;minInclusive value="000.000"/>
             *                       &lt;maxInclusive value="999.999"/>
             *                       &lt;totalDigits value="6"/>
             *                       &lt;fractionDigits value="3"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="LIBU">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="20"/>
             *                       &lt;minLength value="1"/>
             *                       &lt;pattern value=".{1,20}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="CONTT">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="20"/>
             *                       &lt;minLength value="1"/>
             *                       &lt;pattern value=".{1,20}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="CIA">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="15"/>
             *             &lt;pattern value="\d{1,15}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="NAC">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="12"/>
             *             &lt;pattern value="\d{4}\d{5}\d{2}[A-Z0-9]"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="CLEC">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="9"/>
             *             &lt;pattern value="\d{9}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="LIBS">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="80"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="MARQ">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="31"/>
             *             &lt;minLength value="1"/>
             *             &lt;pattern value=".{1,31}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="NF">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="31"/>
             *             &lt;minLength value="1"/>
             *             &lt;pattern value=".{1,31}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="DISP">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;enumeration value="O"/>
             *             &lt;enumeration value="N"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="PROM">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;enumeration value="N"/>
             *             &lt;enumeration value="O"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="PDRF">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;minInclusive value="0.00"/>
             *             &lt;maxInclusive value="99999.99"/>
             *             &lt;totalDigits value="7"/>
             *             &lt;fractionDigits value="2"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="TRPR">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;minInclusive value="1"/>
             *             &lt;maxInclusive value="100"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="TXPRC">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="15"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="TXPRL">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="50"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="RFPR">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="50"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="APAR">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="10"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ium",
                "cont"
            })
            public static class DCOG {

                @XmlElement(name = "IUM")
                protected MDA.ARTS.MART.DCOG.IUM ium;
                @XmlElement(name = "CONT")
                protected MDA.ARTS.MART.DCOG.CONT cont;
                @XmlAttribute(name = "CIA")
                protected String cia;
                @XmlAttribute(name = "NAC")
                protected String nac;
                @XmlAttribute(name = "CLEC")
                protected String clec;
                @XmlAttribute(name = "LIBS")
                protected String libs;
                @XmlAttribute(name = "MARQ")
                protected String marq;
                @XmlAttribute(name = "NF")
                protected String nf;
                @XmlAttribute(name = "DISP")
                protected String disp;
                @XmlAttribute(name = "PROM")
                protected String prom;
                @XmlAttribute(name = "PDRF")
                protected BigDecimal pdrf;
                @XmlAttribute(name = "TRPR")
                protected Integer trpr;
                @XmlAttribute(name = "TXPRC")
                protected String txprc;
                @XmlAttribute(name = "TXPRL")
                protected String txprl;
                @XmlAttribute(name = "RFPR")
                protected String rfpr;
                @XmlAttribute(name = "APAR")
                protected String apar;

                /**
                 * Obtient la valeur de la propri�t� ium.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.DCOG.IUM }
                 *     
                 */
                public MDA.ARTS.MART.DCOG.IUM getIUM() {
                    return ium;
                }

                /**
                 * D�finit la valeur de la propri�t� ium.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.DCOG.IUM }
                 *     
                 */
                public void setIUM(MDA.ARTS.MART.DCOG.IUM value) {
                    this.ium = value;
                }

                /**
                 * Obtient la valeur de la propri�t� cont.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.DCOG.CONT }
                 *     
                 */
                public MDA.ARTS.MART.DCOG.CONT getCONT() {
                    return cont;
                }

                /**
                 * D�finit la valeur de la propri�t� cont.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.DCOG.CONT }
                 *     
                 */
                public void setCONT(MDA.ARTS.MART.DCOG.CONT value) {
                    this.cont = value;
                }

                /**
                 * Obtient la valeur de la propri�t� cia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCIA() {
                    return cia;
                }

                /**
                 * D�finit la valeur de la propri�t� cia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCIA(String value) {
                    this.cia = value;
                }

                /**
                 * Obtient la valeur de la propri�t� nac.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAC() {
                    return nac;
                }

                /**
                 * D�finit la valeur de la propri�t� nac.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAC(String value) {
                    this.nac = value;
                }

                /**
                 * Obtient la valeur de la propri�t� clec.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCLEC() {
                    return clec;
                }

                /**
                 * D�finit la valeur de la propri�t� clec.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCLEC(String value) {
                    this.clec = value;
                }

                /**
                 * Obtient la valeur de la propri�t� libs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLIBS() {
                    return libs;
                }

                /**
                 * D�finit la valeur de la propri�t� libs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLIBS(String value) {
                    this.libs = value;
                }

                /**
                 * Obtient la valeur de la propri�t� marq.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMARQ() {
                    return marq;
                }

                /**
                 * D�finit la valeur de la propri�t� marq.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMARQ(String value) {
                    this.marq = value;
                }

                /**
                 * Obtient la valeur de la propri�t� nf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNF() {
                    return nf;
                }

                /**
                 * D�finit la valeur de la propri�t� nf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNF(String value) {
                    this.nf = value;
                }

                /**
                 * Obtient la valeur de la propri�t� disp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDISP() {
                    return disp;
                }

                /**
                 * D�finit la valeur de la propri�t� disp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDISP(String value) {
                    this.disp = value;
                }

                /**
                 * Obtient la valeur de la propri�t� prom.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPROM() {
                    return prom;
                }

                /**
                 * D�finit la valeur de la propri�t� prom.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPROM(String value) {
                    this.prom = value;
                }

                /**
                 * Obtient la valeur de la propri�t� pdrf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPDRF() {
                    return pdrf;
                }

                /**
                 * D�finit la valeur de la propri�t� pdrf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPDRF(BigDecimal value) {
                    this.pdrf = value;
                }

                /**
                 * Obtient la valeur de la propri�t� trpr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getTRPR() {
                    return trpr;
                }

                /**
                 * D�finit la valeur de la propri�t� trpr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setTRPR(Integer value) {
                    this.trpr = value;
                }

                /**
                 * Obtient la valeur de la propri�t� txprc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTXPRC() {
                    return txprc;
                }

                /**
                 * D�finit la valeur de la propri�t� txprc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTXPRC(String value) {
                    this.txprc = value;
                }

                /**
                 * Obtient la valeur de la propri�t� txprl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTXPRL() {
                    return txprl;
                }

                /**
                 * D�finit la valeur de la propri�t� txprl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTXPRL(String value) {
                    this.txprl = value;
                }

                /**
                 * Obtient la valeur de la propri�t� rfpr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRFPR() {
                    return rfpr;
                }

                /**
                 * D�finit la valeur de la propri�t� rfpr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRFPR(String value) {
                    this.rfpr = value;
                }

                /**
                 * Obtient la valeur de la propri�t� apar.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAPAR() {
                    return apar;
                }

                /**
                 * D�finit la valeur de la propri�t� apar.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAPAR(String value) {
                    this.apar = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="CONTV" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;minInclusive value="000.000"/>
                 *             &lt;maxInclusive value="999.999"/>
                 *             &lt;totalDigits value="6"/>
                 *             &lt;fractionDigits value="3"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="LIBU">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="20"/>
                 *             &lt;minLength value="1"/>
                 *             &lt;pattern value=".{1,20}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="CONTT">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="20"/>
                 *             &lt;minLength value="1"/>
                 *             &lt;pattern value=".{1,20}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class CONT {

                    @XmlAttribute(name = "CONTV", required = true)
                    protected BigDecimal contv;
                    @XmlAttribute(name = "LIBU")
                    protected String libu;
                    @XmlAttribute(name = "CONTT")
                    protected String contt;

                    /**
                     * Obtient la valeur de la propri�t� contv.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getCONTV() {
                        return contv;
                    }

                    /**
                     * D�finit la valeur de la propri�t� contv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setCONTV(BigDecimal value) {
                        this.contv = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� libu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLIBU() {
                        return libu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� libu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLIBU(String value) {
                        this.libu = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� contt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCONTT() {
                        return contt;
                    }

                    /**
                     * D�finit la valeur de la propri�t� contt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCONTT(String value) {
                        this.contt = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="PUM" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;minInclusive value="0.00"/>
                 *             &lt;maxInclusive value="99999.99"/>
                 *             &lt;totalDigits value="7"/>
                 *             &lt;fractionDigits value="2"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="LIBU">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="20"/>
                 *             &lt;minLength value="1"/>
                 *             &lt;pattern value=".{1,20}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class IUM {

                    @XmlAttribute(name = "PUM", required = true)
                    protected BigDecimal pum;
                    @XmlAttribute(name = "LIBU")
                    protected String libu;

                    /**
                     * Obtient la valeur de la propri�t� pum.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPUM() {
                        return pum;
                    }

                    /**
                     * D�finit la valeur de la propri�t� pum.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPUM(BigDecimal value) {
                        this.pum = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� libu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLIBU() {
                        return libu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� libu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLIBU(String value) {
                        this.libu = value;
                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="TAS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="DFL" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ORIG">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="30"/>
             *                       &lt;pattern value=".{1,30}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="CAL">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="10"/>
             *                       &lt;pattern value=".{1,10}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="CAT">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="5"/>
             *                       &lt;pattern value=".{1,5}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="VART">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="30"/>
             *                       &lt;pattern value=".{1,30}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="PLUB">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="6"/>
             *                       &lt;pattern value="\d{1,6}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="BIO">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="0"/>
             *                       &lt;maxLength value="3"/>
             *                       &lt;enumeration value="BIO"/>
             *                       &lt;enumeration value=""/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="MESP1">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="30"/>
             *                       &lt;pattern value=".{1,30}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="MESP2">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="30"/>
             *                       &lt;pattern value=".{1,30}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="CBAL">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="4"/>
             *                       &lt;pattern value=".{1,5}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TRTFL" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="0"/>
             *               &lt;maxLength value="300"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="BCO2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="VCUV">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;totalDigits value="6"/>
             *                       &lt;fractionDigits value="2"/>
             *                       &lt;minInclusive value="0"/>
             *                       &lt;maxInclusive value="9999.99"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="VCUM">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;minInclusive value="0"/>
             *                       &lt;maxInclusive value="9999.99"/>
             *                       &lt;totalDigits value="6"/>
             *                       &lt;fractionDigits value="2"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="LIBU">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;minLength value="1"/>
             *                       &lt;maxLength value="20"/>
             *                       &lt;pattern value=".{1,20}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="LYT">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="40"/>
             *             &lt;pattern value=".{1,40}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="LMRG">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;pattern value="[A-Z]"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tas",
                "dfl",
                "trtfl",
                "bco2"
            })
            public static class DCOT {

                @XmlElement(name = "TAS")
                protected String tas;
                @XmlElement(name = "DFL")
                protected MDA.ARTS.MART.DCOT.DFL dfl;
                @XmlElement(name = "TRTFL")
                protected String trtfl;
                @XmlElement(name = "BCO2")
                protected MDA.ARTS.MART.DCOT.BCO2 bco2;
                @XmlAttribute(name = "LYT")
                protected String lyt;
                @XmlAttribute(name = "LMRG")
                protected String lmrg;

                /**
                 * Obtient la valeur de la propri�t� tas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTAS() {
                    return tas;
                }

                /**
                 * D�finit la valeur de la propri�t� tas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTAS(String value) {
                    this.tas = value;
                }

                /**
                 * Obtient la valeur de la propri�t� dfl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.DCOT.DFL }
                 *     
                 */
                public MDA.ARTS.MART.DCOT.DFL getDFL() {
                    return dfl;
                }

                /**
                 * D�finit la valeur de la propri�t� dfl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.DCOT.DFL }
                 *     
                 */
                public void setDFL(MDA.ARTS.MART.DCOT.DFL value) {
                    this.dfl = value;
                }

                /**
                 * Obtient la valeur de la propri�t� trtfl.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTRTFL() {
                    return trtfl;
                }

                /**
                 * D�finit la valeur de la propri�t� trtfl.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTRTFL(String value) {
                    this.trtfl = value;
                }

                /**
                 * Obtient la valeur de la propri�t� bco2.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.DCOT.BCO2 }
                 *     
                 */
                public MDA.ARTS.MART.DCOT.BCO2 getBCO2() {
                    return bco2;
                }

                /**
                 * D�finit la valeur de la propri�t� bco2.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.DCOT.BCO2 }
                 *     
                 */
                public void setBCO2(MDA.ARTS.MART.DCOT.BCO2 value) {
                    this.bco2 = value;
                }

                /**
                 * Obtient la valeur de la propri�t� lyt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLYT() {
                    return lyt;
                }

                /**
                 * D�finit la valeur de la propri�t� lyt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLYT(String value) {
                    this.lyt = value;
                }

                /**
                 * Obtient la valeur de la propri�t� lmrg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLMRG() {
                    return lmrg;
                }

                /**
                 * D�finit la valeur de la propri�t� lmrg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLMRG(String value) {
                    this.lmrg = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="VCUV">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;totalDigits value="6"/>
                 *             &lt;fractionDigits value="2"/>
                 *             &lt;minInclusive value="0"/>
                 *             &lt;maxInclusive value="9999.99"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="VCUM">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;minInclusive value="0"/>
                 *             &lt;maxInclusive value="9999.99"/>
                 *             &lt;totalDigits value="6"/>
                 *             &lt;fractionDigits value="2"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="LIBU">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="20"/>
                 *             &lt;pattern value=".{1,20}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class BCO2 {

                    @XmlAttribute(name = "VCUV")
                    protected BigDecimal vcuv;
                    @XmlAttribute(name = "VCUM")
                    protected BigDecimal vcum;
                    @XmlAttribute(name = "LIBU")
                    protected String libu;

                    /**
                     * Obtient la valeur de la propri�t� vcuv.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVCUV() {
                        return vcuv;
                    }

                    /**
                     * D�finit la valeur de la propri�t� vcuv.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVCUV(BigDecimal value) {
                        this.vcuv = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� vcum.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVCUM() {
                        return vcum;
                    }

                    /**
                     * D�finit la valeur de la propri�t� vcum.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVCUM(BigDecimal value) {
                        this.vcum = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� libu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLIBU() {
                        return libu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� libu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLIBU(String value) {
                        this.libu = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="ORIG">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="30"/>
                 *             &lt;pattern value=".{1,30}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="CAL">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="10"/>
                 *             &lt;pattern value=".{1,10}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="CAT">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="5"/>
                 *             &lt;pattern value=".{1,5}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="VART">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="30"/>
                 *             &lt;pattern value=".{1,30}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="PLUB">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="6"/>
                 *             &lt;pattern value="\d{1,6}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="BIO">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="0"/>
                 *             &lt;maxLength value="3"/>
                 *             &lt;enumeration value="BIO"/>
                 *             &lt;enumeration value=""/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="MESP1">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="30"/>
                 *             &lt;pattern value=".{1,30}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="MESP2">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="30"/>
                 *             &lt;pattern value=".{1,30}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="CBAL">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;minLength value="1"/>
                 *             &lt;maxLength value="4"/>
                 *             &lt;pattern value=".{1,5}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DFL {

                    @XmlAttribute(name = "ORIG")
                    protected String orig;
                    @XmlAttribute(name = "CAL")
                    protected String cal;
                    @XmlAttribute(name = "CAT")
                    protected String cat;
                    @XmlAttribute(name = "VART")
                    protected String vart;
                    @XmlAttribute(name = "PLUB")
                    protected String plub;
                    @XmlAttribute(name = "BIO")
                    protected String bio;
                    @XmlAttribute(name = "MESP1")
                    protected String mesp1;
                    @XmlAttribute(name = "MESP2")
                    protected String mesp2;
                    @XmlAttribute(name = "CBAL")
                    protected String cbal;

                    /**
                     * Obtient la valeur de la propri�t� orig.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getORIG() {
                        return orig;
                    }

                    /**
                     * D�finit la valeur de la propri�t� orig.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setORIG(String value) {
                        this.orig = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� cal.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCAL() {
                        return cal;
                    }

                    /**
                     * D�finit la valeur de la propri�t� cal.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCAL(String value) {
                        this.cal = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� cat.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCAT() {
                        return cat;
                    }

                    /**
                     * D�finit la valeur de la propri�t� cat.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCAT(String value) {
                        this.cat = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� vart.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVART() {
                        return vart;
                    }

                    /**
                     * D�finit la valeur de la propri�t� vart.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVART(String value) {
                        this.vart = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� plub.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPLUB() {
                        return plub;
                    }

                    /**
                     * D�finit la valeur de la propri�t� plub.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPLUB(String value) {
                        this.plub = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� bio.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBIO() {
                        return bio;
                    }

                    /**
                     * D�finit la valeur de la propri�t� bio.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBIO(String value) {
                        this.bio = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� mesp1.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMESP1() {
                        return mesp1;
                    }

                    /**
                     * D�finit la valeur de la propri�t� mesp1.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMESP1(String value) {
                        this.mesp1 = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� mesp2.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMESP2() {
                        return mesp2;
                    }

                    /**
                     * D�finit la valeur de la propri�t� mesp2.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMESP2(String value) {
                        this.mesp2 = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� cbal.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCBAL() {
                        return cbal;
                    }

                    /**
                     * D�finit la valeur de la propri�t� cbal.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCBAL(String value) {
                        this.cbal = value;
                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="GTIE" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LGAR" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="100"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="DGAR">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;fractionDigits value="2"/>
             *                       &lt;totalDigits value="7"/>
             *                       &lt;minExclusive value="0"/>
             *                       &lt;maxExclusive value="100000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="UGAR">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="20"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PIEC" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="LPIE" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="100"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="DPIE">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;totalDigits value="7"/>
             *                       &lt;fractionDigits value="2"/>
             *                       &lt;minExclusive value="0"/>
             *                       &lt;maxExclusive value="100000"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="UPIE">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="20"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="LDNC">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="100"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "gtie",
                "piec"
            })
            public static class DTECH {

                @XmlElement(name = "GTIE")
                protected MDA.ARTS.MART.DTECH.GTIE gtie;
                @XmlElement(name = "PIEC")
                protected MDA.ARTS.MART.DTECH.PIEC piec;
                @XmlAttribute(name = "LDNC")
                protected String ldnc;

                /**
                 * Obtient la valeur de la propri�t� gtie.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.DTECH.GTIE }
                 *     
                 */
                public MDA.ARTS.MART.DTECH.GTIE getGTIE() {
                    return gtie;
                }

                /**
                 * D�finit la valeur de la propri�t� gtie.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.DTECH.GTIE }
                 *     
                 */
                public void setGTIE(MDA.ARTS.MART.DTECH.GTIE value) {
                    this.gtie = value;
                }

                /**
                 * Obtient la valeur de la propri�t� piec.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.DTECH.PIEC }
                 *     
                 */
                public MDA.ARTS.MART.DTECH.PIEC getPIEC() {
                    return piec;
                }

                /**
                 * D�finit la valeur de la propri�t� piec.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.DTECH.PIEC }
                 *     
                 */
                public void setPIEC(MDA.ARTS.MART.DTECH.PIEC value) {
                    this.piec = value;
                }

                /**
                 * Obtient la valeur de la propri�t� ldnc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLDNC() {
                    return ldnc;
                }

                /**
                 * D�finit la valeur de la propri�t� ldnc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLDNC(String value) {
                    this.ldnc = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="LGAR" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="100"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="DGAR">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;fractionDigits value="2"/>
                 *             &lt;totalDigits value="7"/>
                 *             &lt;minExclusive value="0"/>
                 *             &lt;maxExclusive value="100000"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="UGAR">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="20"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class GTIE {

                    @XmlAttribute(name = "LGAR", required = true)
                    protected String lgar;
                    @XmlAttribute(name = "DGAR")
                    protected BigDecimal dgar;
                    @XmlAttribute(name = "UGAR")
                    protected String ugar;

                    /**
                     * Obtient la valeur de la propri�t� lgar.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLGAR() {
                        return lgar;
                    }

                    /**
                     * D�finit la valeur de la propri�t� lgar.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLGAR(String value) {
                        this.lgar = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� dgar.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getDGAR() {
                        return dgar;
                    }

                    /**
                     * D�finit la valeur de la propri�t� dgar.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setDGAR(BigDecimal value) {
                        this.dgar = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� ugar.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUGAR() {
                        return ugar;
                    }

                    /**
                     * D�finit la valeur de la propri�t� ugar.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUGAR(String value) {
                        this.ugar = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="LPIE" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="100"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="DPIE">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;totalDigits value="7"/>
                 *             &lt;fractionDigits value="2"/>
                 *             &lt;minExclusive value="0"/>
                 *             &lt;maxExclusive value="100000"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="UPIE">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="20"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class PIEC {

                    @XmlAttribute(name = "LPIE", required = true)
                    protected String lpie;
                    @XmlAttribute(name = "DPIE")
                    protected BigDecimal dpie;
                    @XmlAttribute(name = "UPIE")
                    protected String upie;

                    /**
                     * Obtient la valeur de la propri�t� lpie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLPIE() {
                        return lpie;
                    }

                    /**
                     * D�finit la valeur de la propri�t� lpie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLPIE(String value) {
                        this.lpie = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� dpie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getDPIE() {
                        return dpie;
                    }

                    /**
                     * D�finit la valeur de la propri�t� dpie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setDPIE(BigDecimal value) {
                        this.dpie = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� upie.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUPIE() {
                        return upie;
                    }

                    /**
                     * D�finit la valeur de la propri�t� upie.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUPIE(String value) {
                        this.upie = value;
                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element name="PRXU" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="QTEU">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTES">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTEQ">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="PESEE">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;length value="1"/>
             *                                 &lt;enumeration value="O"/>
             *                                 &lt;enumeration value="N"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="UNITE">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;minLength value="1"/>
             *                                 &lt;maxLength value="3"/>
             *                                 &lt;enumeration value="KG"/>
             *                                 &lt;enumeration value="L"/>
             *                                 &lt;enumeration value="M"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTEC">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="UNITE">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;minLength value="1"/>
             *                                 &lt;maxLength value="3"/>
             *                                 &lt;enumeration value="KG"/>
             *                                 &lt;enumeration value="L"/>
             *                                 &lt;enumeration value="M"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *                 &lt;attribute name="PUTTC" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;minInclusive value="0.00"/>
             *                       &lt;maxInclusive value="999999"/>
             *                       &lt;fractionDigits value="2"/>
             *                       &lt;totalDigits value="7"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="SEUIL">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;minInclusive value="0.000"/>
             *                       &lt;totalDigits value="8"/>
             *                       &lt;fractionDigits value="3"/>
             *                       &lt;maxInclusive value="99999.999"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PRXS">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="QTEU">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTES">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTEQ">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="PESEE">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;length value="1"/>
             *                                 &lt;enumeration value="O"/>
             *                                 &lt;enumeration value="N"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="UNITE">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;minLength value="1"/>
             *                                 &lt;maxLength value="3"/>
             *                                 &lt;enumeration value="KG"/>
             *                                 &lt;enumeration value="L"/>
             *                                 &lt;enumeration value="M"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTEC">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="UNITE">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;minLength value="1"/>
             *                                 &lt;maxLength value="3"/>
             *                                 &lt;enumeration value="KG"/>
             *                                 &lt;enumeration value="L"/>
             *                                 &lt;enumeration value="M"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PRXC">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="QTES">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTEU">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *       &lt;attribute name="PXZ">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;enumeration value="O"/>
             *             &lt;enumeration value="N"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "prxu",
                "prxs",
                "prxc"
            })
            public static class PXQT {

                @XmlElement(name = "PRXU")
                protected List<MDA.ARTS.MART.PXQT.PRXU> prxu;
                @XmlElement(name = "PRXS")
                protected MDA.ARTS.MART.PXQT.PRXS prxs;
                @XmlElement(name = "PRXC")
                protected MDA.ARTS.MART.PXQT.PRXC prxc;
                @XmlAttribute(name = "PXZ")
                protected String pxz;

                /**
                 * Gets the value of the prxu property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the prxu property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPRXU().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MDA.ARTS.MART.PXQT.PRXU }
                 * 
                 * 
                 */
                public List<MDA.ARTS.MART.PXQT.PRXU> getPRXU() {
                    if (prxu == null) {
                        prxu = new ArrayList<MDA.ARTS.MART.PXQT.PRXU>();
                    }
                    return this.prxu;
                }

                /**
                 * Obtient la valeur de la propri�t� prxs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.PXQT.PRXS }
                 *     
                 */
                public MDA.ARTS.MART.PXQT.PRXS getPRXS() {
                    return prxs;
                }

                /**
                 * D�finit la valeur de la propri�t� prxs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.PXQT.PRXS }
                 *     
                 */
                public void setPRXS(MDA.ARTS.MART.PXQT.PRXS value) {
                    this.prxs = value;
                }

                /**
                 * Obtient la valeur de la propri�t� prxc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.PXQT.PRXC }
                 *     
                 */
                public MDA.ARTS.MART.PXQT.PRXC getPRXC() {
                    return prxc;
                }

                /**
                 * D�finit la valeur de la propri�t� prxc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.PXQT.PRXC }
                 *     
                 */
                public void setPRXC(MDA.ARTS.MART.PXQT.PRXC value) {
                    this.prxc = value;
                }

                /**
                 * Obtient la valeur de la propri�t� pxz.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPXZ() {
                    return pxz;
                }

                /**
                 * D�finit la valeur de la propri�t� pxz.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPXZ(String value) {
                    this.pxz = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="QTES">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTEU">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "qtes",
                    "qteu"
                })
                public static class PRXC {

                    @XmlElement(name = "QTES")
                    protected MDA.ARTS.MART.PXQT.PRXC.QTES qtes;
                    @XmlElement(name = "QTEU")
                    protected MDA.ARTS.MART.PXQT.PRXC.QTEU qteu;

                    /**
                     * Obtient la valeur de la propri�t� qtes.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXC.QTES }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXC.QTES getQTES() {
                        return qtes;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qtes.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXC.QTES }
                     *     
                     */
                    public void setQTES(MDA.ARTS.MART.PXQT.PRXC.QTES value) {
                        this.qtes = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qteu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXC.QTEU }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXC.QTEU getQTEU() {
                        return qteu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qteu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXC.QTEU }
                     *     
                     */
                    public void setQTEU(MDA.ARTS.MART.PXQT.PRXC.QTEU value) {
                        this.qteu = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTES {


                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEU {


                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="QTEU">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTES">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTEQ">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="PESEE">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;length value="1"/>
                 *                       &lt;enumeration value="O"/>
                 *                       &lt;enumeration value="N"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="UNITE">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;minLength value="1"/>
                 *                       &lt;maxLength value="3"/>
                 *                       &lt;enumeration value="KG"/>
                 *                       &lt;enumeration value="L"/>
                 *                       &lt;enumeration value="M"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTEC">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="UNITE">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;minLength value="1"/>
                 *                       &lt;maxLength value="3"/>
                 *                       &lt;enumeration value="KG"/>
                 *                       &lt;enumeration value="L"/>
                 *                       &lt;enumeration value="M"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "qteu",
                    "qtes",
                    "qteq",
                    "qtec"
                })
                public static class PRXS {

                    @XmlElement(name = "QTEU")
                    protected MDA.ARTS.MART.PXQT.PRXS.QTEU qteu;
                    @XmlElement(name = "QTES")
                    protected MDA.ARTS.MART.PXQT.PRXS.QTES qtes;
                    @XmlElement(name = "QTEQ")
                    protected MDA.ARTS.MART.PXQT.PRXS.QTEQ qteq;
                    @XmlElement(name = "QTEC")
                    protected MDA.ARTS.MART.PXQT.PRXS.QTEC qtec;

                    /**
                     * Obtient la valeur de la propri�t� qteu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXS.QTEU }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXS.QTEU getQTEU() {
                        return qteu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qteu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXS.QTEU }
                     *     
                     */
                    public void setQTEU(MDA.ARTS.MART.PXQT.PRXS.QTEU value) {
                        this.qteu = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qtes.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXS.QTES }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXS.QTES getQTES() {
                        return qtes;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qtes.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXS.QTES }
                     *     
                     */
                    public void setQTES(MDA.ARTS.MART.PXQT.PRXS.QTES value) {
                        this.qtes = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qteq.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXS.QTEQ }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXS.QTEQ getQTEQ() {
                        return qteq;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qteq.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXS.QTEQ }
                     *     
                     */
                    public void setQTEQ(MDA.ARTS.MART.PXQT.PRXS.QTEQ value) {
                        this.qteq = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qtec.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXS.QTEC }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXS.QTEC getQTEC() {
                        return qtec;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qtec.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXS.QTEC }
                     *     
                     */
                    public void setQTEC(MDA.ARTS.MART.PXQT.PRXS.QTEC value) {
                        this.qtec = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="UNITE">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;minLength value="1"/>
                     *             &lt;maxLength value="3"/>
                     *             &lt;enumeration value="KG"/>
                     *             &lt;enumeration value="L"/>
                     *             &lt;enumeration value="M"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEC {

                        @XmlAttribute(name = "UNITE")
                        protected String unite;

                        /**
                         * Obtient la valeur de la propri�t� unite.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUNITE() {
                            return unite;
                        }

                        /**
                         * D�finit la valeur de la propri�t� unite.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUNITE(String value) {
                            this.unite = value;
                        }

                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="PESEE">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;length value="1"/>
                     *             &lt;enumeration value="O"/>
                     *             &lt;enumeration value="N"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="UNITE">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;minLength value="1"/>
                     *             &lt;maxLength value="3"/>
                     *             &lt;enumeration value="KG"/>
                     *             &lt;enumeration value="L"/>
                     *             &lt;enumeration value="M"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEQ {

                        @XmlAttribute(name = "PESEE")
                        protected String pesee;
                        @XmlAttribute(name = "UNITE")
                        protected String unite;

                        /**
                         * Obtient la valeur de la propri�t� pesee.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPESEE() {
                            return pesee;
                        }

                        /**
                         * D�finit la valeur de la propri�t� pesee.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPESEE(String value) {
                            this.pesee = value;
                        }

                        /**
                         * Obtient la valeur de la propri�t� unite.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUNITE() {
                            return unite;
                        }

                        /**
                         * D�finit la valeur de la propri�t� unite.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUNITE(String value) {
                            this.unite = value;
                        }

                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTES {


                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEU {


                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="QTEU">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTES">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTEQ">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="PESEE">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;length value="1"/>
                 *                       &lt;enumeration value="O"/>
                 *                       &lt;enumeration value="N"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="UNITE">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;minLength value="1"/>
                 *                       &lt;maxLength value="3"/>
                 *                       &lt;enumeration value="KG"/>
                 *                       &lt;enumeration value="L"/>
                 *                       &lt;enumeration value="M"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTEC">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="UNITE">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;minLength value="1"/>
                 *                       &lt;maxLength value="3"/>
                 *                       &lt;enumeration value="KG"/>
                 *                       &lt;enumeration value="L"/>
                 *                       &lt;enumeration value="M"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *       &lt;attribute name="PUTTC" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;minInclusive value="0.00"/>
                 *             &lt;maxInclusive value="999999"/>
                 *             &lt;fractionDigits value="2"/>
                 *             &lt;totalDigits value="7"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="SEUIL">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;minInclusive value="0.000"/>
                 *             &lt;totalDigits value="8"/>
                 *             &lt;fractionDigits value="3"/>
                 *             &lt;maxInclusive value="99999.999"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "qteu",
                    "qtes",
                    "qteq",
                    "qtec"
                })
                public static class PRXU {

                    @XmlElement(name = "QTEU")
                    protected MDA.ARTS.MART.PXQT.PRXU.QTEU qteu;
                    @XmlElement(name = "QTES")
                    protected MDA.ARTS.MART.PXQT.PRXU.QTES qtes;
                    @XmlElement(name = "QTEQ")
                    protected MDA.ARTS.MART.PXQT.PRXU.QTEQ qteq;
                    @XmlElement(name = "QTEC")
                    protected MDA.ARTS.MART.PXQT.PRXU.QTEC qtec;
                    @XmlAttribute(name = "PUTTC", required = true)
                    protected BigDecimal puttc;
                    @XmlAttribute(name = "SEUIL")
                    protected BigDecimal seuil;

                    /**
                     * Obtient la valeur de la propri�t� qteu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXU.QTEU }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXU.QTEU getQTEU() {
                        return qteu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qteu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXU.QTEU }
                     *     
                     */
                    public void setQTEU(MDA.ARTS.MART.PXQT.PRXU.QTEU value) {
                        this.qteu = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qtes.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXU.QTES }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXU.QTES getQTES() {
                        return qtes;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qtes.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXU.QTES }
                     *     
                     */
                    public void setQTES(MDA.ARTS.MART.PXQT.PRXU.QTES value) {
                        this.qtes = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qteq.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXU.QTEQ }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXU.QTEQ getQTEQ() {
                        return qteq;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qteq.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXU.QTEQ }
                     *     
                     */
                    public void setQTEQ(MDA.ARTS.MART.PXQT.PRXU.QTEQ value) {
                        this.qteq = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qtec.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXU.QTEC }
                     *     
                     */
                    public MDA.ARTS.MART.PXQT.PRXU.QTEC getQTEC() {
                        return qtec;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qtec.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MART.PXQT.PRXU.QTEC }
                     *     
                     */
                    public void setQTEC(MDA.ARTS.MART.PXQT.PRXU.QTEC value) {
                        this.qtec = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� puttc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPUTTC() {
                        return puttc;
                    }

                    /**
                     * D�finit la valeur de la propri�t� puttc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPUTTC(BigDecimal value) {
                        this.puttc = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� seuil.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSEUIL() {
                        return seuil;
                    }

                    /**
                     * D�finit la valeur de la propri�t� seuil.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSEUIL(BigDecimal value) {
                        this.seuil = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="UNITE">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;minLength value="1"/>
                     *             &lt;maxLength value="3"/>
                     *             &lt;enumeration value="KG"/>
                     *             &lt;enumeration value="L"/>
                     *             &lt;enumeration value="M"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEC {

                        @XmlAttribute(name = "UNITE")
                        protected String unite;

                        /**
                         * Obtient la valeur de la propri�t� unite.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUNITE() {
                            return unite;
                        }

                        /**
                         * D�finit la valeur de la propri�t� unite.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUNITE(String value) {
                            this.unite = value;
                        }

                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="PESEE">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;length value="1"/>
                     *             &lt;enumeration value="O"/>
                     *             &lt;enumeration value="N"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="UNITE">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;minLength value="1"/>
                     *             &lt;maxLength value="3"/>
                     *             &lt;enumeration value="KG"/>
                     *             &lt;enumeration value="L"/>
                     *             &lt;enumeration value="M"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEQ {

                        @XmlAttribute(name = "PESEE")
                        protected String pesee;
                        @XmlAttribute(name = "UNITE")
                        protected String unite;

                        /**
                         * Obtient la valeur de la propri�t� pesee.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPESEE() {
                            return pesee;
                        }

                        /**
                         * D�finit la valeur de la propri�t� pesee.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPESEE(String value) {
                            this.pesee = value;
                        }

                        /**
                         * Obtient la valeur de la propri�t� unite.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUNITE() {
                            return unite;
                        }

                        /**
                         * D�finit la valeur de la propri�t� unite.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUNITE(String value) {
                            this.unite = value;
                        }

                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTES {


                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEU {


                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="CN" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="2"/>
             *             &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="CE" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="15"/>
             *             &lt;pattern value="\d{1,15}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STM {

                @XmlAttribute(name = "CN", required = true)
                protected String cn;
                @XmlAttribute(name = "CE", required = true)
                protected String ce;

                /**
                 * Obtient la valeur de la propri�t� cn.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCN() {
                    return cn;
                }

                /**
                 * D�finit la valeur de la propri�t� cn.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCN(String value) {
                    this.cn = value;
                }

                /**
                 * Obtient la valeur de la propri�t� ce.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCE() {
                    return ce;
                }

                /**
                 * D�finit la valeur de la propri�t� ce.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCE(String value) {
                    this.ce = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="DEEE" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="D3EM" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;fractionDigits value="2"/>
             *                       &lt;totalDigits value="7"/>
             *                       &lt;maxInclusive value="99999.99"/>
             *                       &lt;minInclusive value="0.00"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="D3ET" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="1"/>
             *                       &lt;pattern value="[0-9]|[A-Z]"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TAXE" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="CT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="VAL" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="TVA" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;pattern value="[0-9]|[A-Z]"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "deee",
                "taxe"
            })
            public static class TAX {

                @XmlElement(name = "DEEE")
                protected MDA.ARTS.MART.TAX.DEEE deee;
                @XmlElement(name = "TAXE")
                protected List<MDA.ARTS.MART.TAX.TAXE> taxe;
                @XmlAttribute(name = "TVA", required = true)
                protected String tva;

                /**
                 * Obtient la valeur de la propri�t� deee.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MART.TAX.DEEE }
                 *     
                 */
                public MDA.ARTS.MART.TAX.DEEE getDEEE() {
                    return deee;
                }

                /**
                 * D�finit la valeur de la propri�t� deee.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MART.TAX.DEEE }
                 *     
                 */
                public void setDEEE(MDA.ARTS.MART.TAX.DEEE value) {
                    this.deee = value;
                }

                /**
                 * Gets the value of the taxe property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the taxe property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTAXE().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MDA.ARTS.MART.TAX.TAXE }
                 * 
                 * 
                 */
                public List<MDA.ARTS.MART.TAX.TAXE> getTAXE() {
                    if (taxe == null) {
                        taxe = new ArrayList<MDA.ARTS.MART.TAX.TAXE>();
                    }
                    return this.taxe;
                }

                /**
                 * Obtient la valeur de la propri�t� tva.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTVA() {
                    return tva;
                }

                /**
                 * D�finit la valeur de la propri�t� tva.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTVA(String value) {
                    this.tva = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="D3EM" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;fractionDigits value="2"/>
                 *             &lt;totalDigits value="7"/>
                 *             &lt;maxInclusive value="99999.99"/>
                 *             &lt;minInclusive value="0.00"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="D3ET" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="1"/>
                 *             &lt;pattern value="[0-9]|[A-Z]"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DEEE {

                    @XmlAttribute(name = "D3EM", required = true)
                    protected BigDecimal d3EM;
                    @XmlAttribute(name = "D3ET", required = true)
                    protected String d3ET;

                    /**
                     * Obtient la valeur de la propri�t� d3EM.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getD3EM() {
                        return d3EM;
                    }

                    /**
                     * D�finit la valeur de la propri�t� d3EM.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setD3EM(BigDecimal value) {
                        this.d3EM = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� d3ET.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getD3ET() {
                        return d3ET;
                    }

                    /**
                     * D�finit la valeur de la propri�t� d3ET.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setD3ET(String value) {
                        this.d3ET = value;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="CT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="VAL" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class TAXE {

                    @XmlAttribute(name = "CT", required = true)
                    protected String ct;
                    @XmlAttribute(name = "VAL", required = true)
                    protected BigDecimal val;

                    /**
                     * Obtient la valeur de la propri�t� ct.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCT() {
                        return ct;
                    }

                    /**
                     * D�finit la valeur de la propri�t� ct.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCT(String value) {
                        this.ct = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� val.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getVAL() {
                        return val;
                    }

                    /**
                     * D�finit la valeur de la propri�t� val.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setVAL(BigDecimal value) {
                        this.val = value;
                    }

                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PXQT">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="PRXU" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="QTEU">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTES">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                           &lt;attribute name="PUTTC" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;minInclusive value="0.00"/>
         *                                 &lt;maxInclusive value="999999"/>
         *                                 &lt;fractionDigits value="2"/>
         *                                 &lt;totalDigits value="7"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="SEUIL">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                 &lt;minInclusive value="0.000"/>
         *                                 &lt;totalDigits value="8"/>
         *                                 &lt;fractionDigits value="3"/>
         *                                 &lt;maxInclusive value="99999.999"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PRXS">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="QTEU">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="QTES">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PRXC">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="QTEU">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *                 &lt;attribute name="PXZ">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="1"/>
         *                       &lt;enumeration value="O"/>
         *                       &lt;enumeration value="N"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CHA" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;length value="13"/>
         *               &lt;pattern value="\d{13}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="DCOG" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CIA">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="15"/>
         *                       &lt;pattern value="\d{1,15}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="CLEC">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;length value="9"/>
         *                       &lt;pattern value="\d{9}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="LIBS">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="80"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="MARQ">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="31"/>
         *                       &lt;minLength value="1"/>
         *                       &lt;pattern value=".{1,31}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="NF">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="31"/>
         *                       &lt;minLength value="1"/>
         *                       &lt;pattern value=".{1,31}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DCOT" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TAS" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DCOC" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ITCS" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="LGN" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="TXT" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;maxLength value="40"/>
         *                                           &lt;minLength value="1"/>
         *                                           &lt;pattern value=".{1,40}"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="SIZ" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;length value="2"/>
         *                                           &lt;enumeration value="DH"/>
         *                                           &lt;enumeration value="DL"/>
         *                                           &lt;enumeration value="DD"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="NOTG" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="1"/>
         *                                 &lt;enumeration value="O"/>
         *                                 &lt;enumeration value="N"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ITCC" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="LGN" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="TXT" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;maxLength value="40"/>
         *                                           &lt;minLength value="1"/>
         *                                           &lt;pattern value=".{1,40}"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                     &lt;attribute name="SIZ" use="required">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;length value="2"/>
         *                                           &lt;enumeration value="DH"/>
         *                                           &lt;enumeration value="DL"/>
         *                                           &lt;enumeration value="DD"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="NOTG" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="1"/>
         *                                 &lt;enumeration value="O"/>
         *                                 &lt;enumeration value="N"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                           &lt;attribute name="LIBT" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;maxLength value="30"/>
         *                                 &lt;minLength value="1"/>
         *                                 &lt;pattern value=".{1,30}"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="TXT">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="160"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="MSG">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;maxLength value="160"/>
         *                       &lt;minLength value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ART" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="13"/>
         *             &lt;pattern value="\d{13}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="LIB" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;maxLength value="31"/>
         *             &lt;minLength value="1"/>
         *             &lt;pattern value=".{1,31}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VCR">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="31"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pxqt",
            "cha",
            "dcog",
            "dcot",
            "dcoc"
        })
        public static class MCON {

            @XmlElement(name = "PXQT", required = true)
            protected MDA.ARTS.MCON.PXQT pxqt;
            @XmlElement(name = "CHA")
            protected String cha;
            @XmlElement(name = "DCOG")
            protected MDA.ARTS.MCON.DCOG dcog;
            @XmlElement(name = "DCOT")
            protected MDA.ARTS.MCON.DCOT dcot;
            @XmlElement(name = "DCOC")
            protected MDA.ARTS.MCON.DCOC dcoc;
            @XmlAttribute(name = "ART", required = true)
            protected String art;
            @XmlAttribute(name = "LIB", required = true)
            protected String lib;
            @XmlAttribute(name = "VCR")
            protected String vcr;

            /**
             * Obtient la valeur de la propri�t� pxqt.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MCON.PXQT }
             *     
             */
            public MDA.ARTS.MCON.PXQT getPXQT() {
                return pxqt;
            }

            /**
             * D�finit la valeur de la propri�t� pxqt.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MCON.PXQT }
             *     
             */
            public void setPXQT(MDA.ARTS.MCON.PXQT value) {
                this.pxqt = value;
            }

            /**
             * Obtient la valeur de la propri�t� cha.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCHA() {
                return cha;
            }

            /**
             * D�finit la valeur de la propri�t� cha.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCHA(String value) {
                this.cha = value;
            }

            /**
             * Obtient la valeur de la propri�t� dcog.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MCON.DCOG }
             *     
             */
            public MDA.ARTS.MCON.DCOG getDCOG() {
                return dcog;
            }

            /**
             * D�finit la valeur de la propri�t� dcog.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MCON.DCOG }
             *     
             */
            public void setDCOG(MDA.ARTS.MCON.DCOG value) {
                this.dcog = value;
            }

            /**
             * Obtient la valeur de la propri�t� dcot.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MCON.DCOT }
             *     
             */
            public MDA.ARTS.MCON.DCOT getDCOT() {
                return dcot;
            }

            /**
             * D�finit la valeur de la propri�t� dcot.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MCON.DCOT }
             *     
             */
            public void setDCOT(MDA.ARTS.MCON.DCOT value) {
                this.dcot = value;
            }

            /**
             * Obtient la valeur de la propri�t� dcoc.
             * 
             * @return
             *     possible object is
             *     {@link MDA.ARTS.MCON.DCOC }
             *     
             */
            public MDA.ARTS.MCON.DCOC getDCOC() {
                return dcoc;
            }

            /**
             * D�finit la valeur de la propri�t� dcoc.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.ARTS.MCON.DCOC }
             *     
             */
            public void setDCOC(MDA.ARTS.MCON.DCOC value) {
                this.dcoc = value;
            }

            /**
             * Obtient la valeur de la propri�t� art.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getART() {
                return art;
            }

            /**
             * D�finit la valeur de la propri�t� art.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setART(String value) {
                this.art = value;
            }

            /**
             * Obtient la valeur de la propri�t� lib.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLIB() {
                return lib;
            }

            /**
             * D�finit la valeur de la propri�t� lib.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLIB(String value) {
                this.lib = value;
            }

            /**
             * Obtient la valeur de la propri�t� vcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCR() {
                return vcr;
            }

            /**
             * D�finit la valeur de la propri�t� vcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCR(String value) {
                this.vcr = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ITCS" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="LGN" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="TXT" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;maxLength value="40"/>
             *                                 &lt;minLength value="1"/>
             *                                 &lt;pattern value=".{1,40}"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="SIZ" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;length value="2"/>
             *                                 &lt;enumeration value="DH"/>
             *                                 &lt;enumeration value="DL"/>
             *                                 &lt;enumeration value="DD"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="NOTG" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="1"/>
             *                       &lt;enumeration value="O"/>
             *                       &lt;enumeration value="N"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ITCC" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="LGN" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="TXT" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;maxLength value="40"/>
             *                                 &lt;minLength value="1"/>
             *                                 &lt;pattern value=".{1,40}"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                           &lt;attribute name="SIZ" use="required">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;length value="2"/>
             *                                 &lt;enumeration value="DH"/>
             *                                 &lt;enumeration value="DL"/>
             *                                 &lt;enumeration value="DD"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="NOTG" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="1"/>
             *                       &lt;enumeration value="O"/>
             *                       &lt;enumeration value="N"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="LIBT" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;maxLength value="30"/>
             *                       &lt;minLength value="1"/>
             *                       &lt;pattern value=".{1,30}"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="TXT">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="160"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="MSG">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="160"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "itcs",
                "itcc"
            })
            public static class DCOC {

                @XmlElement(name = "ITCS")
                protected MDA.ARTS.MCON.DCOC.ITCS itcs;
                @XmlElement(name = "ITCC")
                protected List<MDA.ARTS.MCON.DCOC.ITCC> itcc;
                @XmlAttribute(name = "TXT")
                protected String txt;
                @XmlAttribute(name = "MSG")
                protected String msg;

                /**
                 * Obtient la valeur de la propri�t� itcs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MCON.DCOC.ITCS }
                 *     
                 */
                public MDA.ARTS.MCON.DCOC.ITCS getITCS() {
                    return itcs;
                }

                /**
                 * D�finit la valeur de la propri�t� itcs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MCON.DCOC.ITCS }
                 *     
                 */
                public void setITCS(MDA.ARTS.MCON.DCOC.ITCS value) {
                    this.itcs = value;
                }

                /**
                 * Gets the value of the itcc property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the itcc property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getITCC().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MDA.ARTS.MCON.DCOC.ITCC }
                 * 
                 * 
                 */
                public List<MDA.ARTS.MCON.DCOC.ITCC> getITCC() {
                    if (itcc == null) {
                        itcc = new ArrayList<MDA.ARTS.MCON.DCOC.ITCC>();
                    }
                    return this.itcc;
                }

                /**
                 * Obtient la valeur de la propri�t� txt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTXT() {
                    return txt;
                }

                /**
                 * D�finit la valeur de la propri�t� txt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTXT(String value) {
                    this.txt = value;
                }

                /**
                 * Obtient la valeur de la propri�t� msg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMSG() {
                    return msg;
                }

                /**
                 * D�finit la valeur de la propri�t� msg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMSG(String value) {
                    this.msg = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="LGN" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="TXT" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;maxLength value="40"/>
                 *                       &lt;minLength value="1"/>
                 *                       &lt;pattern value=".{1,40}"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="SIZ" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;length value="2"/>
                 *                       &lt;enumeration value="DH"/>
                 *                       &lt;enumeration value="DL"/>
                 *                       &lt;enumeration value="DD"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="NOTG" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="1"/>
                 *             &lt;enumeration value="O"/>
                 *             &lt;enumeration value="N"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="LIBT" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;maxLength value="30"/>
                 *             &lt;minLength value="1"/>
                 *             &lt;pattern value=".{1,30}"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "lgn"
                })
                public static class ITCC {

                    @XmlElement(name = "LGN", required = true)
                    protected List<MDA.ARTS.MCON.DCOC.ITCC.LGN> lgn;
                    @XmlAttribute(name = "NOTG", required = true)
                    protected String notg;
                    @XmlAttribute(name = "LIBT", required = true)
                    protected String libt;

                    /**
                     * Gets the value of the lgn property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lgn property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLGN().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MDA.ARTS.MCON.DCOC.ITCC.LGN }
                     * 
                     * 
                     */
                    public List<MDA.ARTS.MCON.DCOC.ITCC.LGN> getLGN() {
                        if (lgn == null) {
                            lgn = new ArrayList<MDA.ARTS.MCON.DCOC.ITCC.LGN>();
                        }
                        return this.lgn;
                    }

                    /**
                     * Obtient la valeur de la propri�t� notg.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNOTG() {
                        return notg;
                    }

                    /**
                     * D�finit la valeur de la propri�t� notg.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNOTG(String value) {
                        this.notg = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� libt.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLIBT() {
                        return libt;
                    }

                    /**
                     * D�finit la valeur de la propri�t� libt.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLIBT(String value) {
                        this.libt = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="TXT" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;maxLength value="40"/>
                     *             &lt;minLength value="1"/>
                     *             &lt;pattern value=".{1,40}"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="SIZ" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;length value="2"/>
                     *             &lt;enumeration value="DH"/>
                     *             &lt;enumeration value="DL"/>
                     *             &lt;enumeration value="DD"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class LGN {

                        @XmlAttribute(name = "TXT", required = true)
                        protected String txt;
                        @XmlAttribute(name = "SIZ", required = true)
                        protected String siz;

                        /**
                         * Obtient la valeur de la propri�t� txt.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTXT() {
                            return txt;
                        }

                        /**
                         * D�finit la valeur de la propri�t� txt.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTXT(String value) {
                            this.txt = value;
                        }

                        /**
                         * Obtient la valeur de la propri�t� siz.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSIZ() {
                            return siz;
                        }

                        /**
                         * D�finit la valeur de la propri�t� siz.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSIZ(String value) {
                            this.siz = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="LGN" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="TXT" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;maxLength value="40"/>
                 *                       &lt;minLength value="1"/>
                 *                       &lt;pattern value=".{1,40}"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *                 &lt;attribute name="SIZ" use="required">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;length value="2"/>
                 *                       &lt;enumeration value="DH"/>
                 *                       &lt;enumeration value="DL"/>
                 *                       &lt;enumeration value="DD"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="NOTG" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="1"/>
                 *             &lt;enumeration value="O"/>
                 *             &lt;enumeration value="N"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "lgn"
                })
                public static class ITCS {

                    @XmlElement(name = "LGN", required = true)
                    protected List<MDA.ARTS.MCON.DCOC.ITCS.LGN> lgn;
                    @XmlAttribute(name = "NOTG", required = true)
                    protected String notg;

                    /**
                     * Gets the value of the lgn property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the lgn property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLGN().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MDA.ARTS.MCON.DCOC.ITCS.LGN }
                     * 
                     * 
                     */
                    public List<MDA.ARTS.MCON.DCOC.ITCS.LGN> getLGN() {
                        if (lgn == null) {
                            lgn = new ArrayList<MDA.ARTS.MCON.DCOC.ITCS.LGN>();
                        }
                        return this.lgn;
                    }

                    /**
                     * Obtient la valeur de la propri�t� notg.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNOTG() {
                        return notg;
                    }

                    /**
                     * D�finit la valeur de la propri�t� notg.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNOTG(String value) {
                        this.notg = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="TXT" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;maxLength value="40"/>
                     *             &lt;minLength value="1"/>
                     *             &lt;pattern value=".{1,40}"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *       &lt;attribute name="SIZ" use="required">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;length value="2"/>
                     *             &lt;enumeration value="DH"/>
                     *             &lt;enumeration value="DL"/>
                     *             &lt;enumeration value="DD"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class LGN {

                        @XmlAttribute(name = "TXT", required = true)
                        protected String txt;
                        @XmlAttribute(name = "SIZ", required = true)
                        protected String siz;

                        /**
                         * Obtient la valeur de la propri�t� txt.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTXT() {
                            return txt;
                        }

                        /**
                         * D�finit la valeur de la propri�t� txt.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTXT(String value) {
                            this.txt = value;
                        }

                        /**
                         * Obtient la valeur de la propri�t� siz.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSIZ() {
                            return siz;
                        }

                        /**
                         * D�finit la valeur de la propri�t� siz.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSIZ(String value) {
                            this.siz = value;
                        }

                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="CIA">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="15"/>
             *             &lt;pattern value="\d{1,15}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="CLEC">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="9"/>
             *             &lt;pattern value="\d{9}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="LIBS">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="80"/>
             *             &lt;minLength value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="MARQ">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="31"/>
             *             &lt;minLength value="1"/>
             *             &lt;pattern value=".{1,31}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="NF">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;maxLength value="31"/>
             *             &lt;minLength value="1"/>
             *             &lt;pattern value=".{1,31}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DCOG {

                @XmlAttribute(name = "CIA")
                protected String cia;
                @XmlAttribute(name = "CLEC")
                protected String clec;
                @XmlAttribute(name = "LIBS")
                protected String libs;
                @XmlAttribute(name = "MARQ")
                protected String marq;
                @XmlAttribute(name = "NF")
                protected String nf;

                /**
                 * Obtient la valeur de la propri�t� cia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCIA() {
                    return cia;
                }

                /**
                 * D�finit la valeur de la propri�t� cia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCIA(String value) {
                    this.cia = value;
                }

                /**
                 * Obtient la valeur de la propri�t� clec.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCLEC() {
                    return clec;
                }

                /**
                 * D�finit la valeur de la propri�t� clec.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCLEC(String value) {
                    this.clec = value;
                }

                /**
                 * Obtient la valeur de la propri�t� libs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLIBS() {
                    return libs;
                }

                /**
                 * D�finit la valeur de la propri�t� libs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLIBS(String value) {
                    this.libs = value;
                }

                /**
                 * Obtient la valeur de la propri�t� marq.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMARQ() {
                    return marq;
                }

                /**
                 * D�finit la valeur de la propri�t� marq.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMARQ(String value) {
                    this.marq = value;
                }

                /**
                 * Obtient la valeur de la propri�t� nf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNF() {
                    return nf;
                }

                /**
                 * D�finit la valeur de la propri�t� nf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNF(String value) {
                    this.nf = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="TAS" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tas"
            })
            public static class DCOT {

                @XmlElement(name = "TAS")
                protected String tas;

                /**
                 * Obtient la valeur de la propri�t� tas.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTAS() {
                    return tas;
                }

                /**
                 * D�finit la valeur de la propri�t� tas.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTAS(String value) {
                    this.tas = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice>
             *         &lt;element name="PRXU" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="QTEU">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTES">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *                 &lt;attribute name="PUTTC" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;minInclusive value="0.00"/>
             *                       &lt;maxInclusive value="999999"/>
             *                       &lt;fractionDigits value="2"/>
             *                       &lt;totalDigits value="7"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *                 &lt;attribute name="SEUIL">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                       &lt;minInclusive value="0.000"/>
             *                       &lt;totalDigits value="8"/>
             *                       &lt;fractionDigits value="3"/>
             *                       &lt;maxInclusive value="99999.999"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PRXS">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="QTEU">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="QTES">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PRXC">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="QTEU">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *       &lt;attribute name="PXZ">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;length value="1"/>
             *             &lt;enumeration value="O"/>
             *             &lt;enumeration value="N"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "prxu",
                "prxs",
                "prxc"
            })
            public static class PXQT {

                @XmlElement(name = "PRXU")
                protected List<MDA.ARTS.MCON.PXQT.PRXU> prxu;
                @XmlElement(name = "PRXS")
                protected MDA.ARTS.MCON.PXQT.PRXS prxs;
                @XmlElement(name = "PRXC")
                protected MDA.ARTS.MCON.PXQT.PRXC prxc;
                @XmlAttribute(name = "PXZ")
                protected String pxz;

                /**
                 * Gets the value of the prxu property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the prxu property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPRXU().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MDA.ARTS.MCON.PXQT.PRXU }
                 * 
                 * 
                 */
                public List<MDA.ARTS.MCON.PXQT.PRXU> getPRXU() {
                    if (prxu == null) {
                        prxu = new ArrayList<MDA.ARTS.MCON.PXQT.PRXU>();
                    }
                    return this.prxu;
                }

                /**
                 * Obtient la valeur de la propri�t� prxs.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MCON.PXQT.PRXS }
                 *     
                 */
                public MDA.ARTS.MCON.PXQT.PRXS getPRXS() {
                    return prxs;
                }

                /**
                 * D�finit la valeur de la propri�t� prxs.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MCON.PXQT.PRXS }
                 *     
                 */
                public void setPRXS(MDA.ARTS.MCON.PXQT.PRXS value) {
                    this.prxs = value;
                }

                /**
                 * Obtient la valeur de la propri�t� prxc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MDA.ARTS.MCON.PXQT.PRXC }
                 *     
                 */
                public MDA.ARTS.MCON.PXQT.PRXC getPRXC() {
                    return prxc;
                }

                /**
                 * D�finit la valeur de la propri�t� prxc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MDA.ARTS.MCON.PXQT.PRXC }
                 *     
                 */
                public void setPRXC(MDA.ARTS.MCON.PXQT.PRXC value) {
                    this.prxc = value;
                }

                /**
                 * Obtient la valeur de la propri�t� pxz.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPXZ() {
                    return pxz;
                }

                /**
                 * D�finit la valeur de la propri�t� pxz.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPXZ(String value) {
                    this.pxz = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="QTEU">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "qteu"
                })
                public static class PRXC {

                    @XmlElement(name = "QTEU", required = true)
                    protected MDA.ARTS.MCON.PXQT.PRXC.QTEU qteu;

                    /**
                     * Obtient la valeur de la propri�t� qteu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXC.QTEU }
                     *     
                     */
                    public MDA.ARTS.MCON.PXQT.PRXC.QTEU getQTEU() {
                        return qteu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qteu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXC.QTEU }
                     *     
                     */
                    public void setQTEU(MDA.ARTS.MCON.PXQT.PRXC.QTEU value) {
                        this.qteu = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEU {


                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="QTEU">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTES">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "qteu",
                    "qtes"
                })
                public static class PRXS {

                    @XmlElement(name = "QTEU")
                    protected MDA.ARTS.MCON.PXQT.PRXS.QTEU qteu;
                    @XmlElement(name = "QTES")
                    protected MDA.ARTS.MCON.PXQT.PRXS.QTES qtes;

                    /**
                     * Obtient la valeur de la propri�t� qteu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXS.QTEU }
                     *     
                     */
                    public MDA.ARTS.MCON.PXQT.PRXS.QTEU getQTEU() {
                        return qteu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qteu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXS.QTEU }
                     *     
                     */
                    public void setQTEU(MDA.ARTS.MCON.PXQT.PRXS.QTEU value) {
                        this.qteu = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qtes.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXS.QTES }
                     *     
                     */
                    public MDA.ARTS.MCON.PXQT.PRXS.QTES getQTES() {
                        return qtes;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qtes.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXS.QTES }
                     *     
                     */
                    public void setQTES(MDA.ARTS.MCON.PXQT.PRXS.QTES value) {
                        this.qtes = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTES {


                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEU {


                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="QTEU">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="QTES">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/choice>
                 *       &lt;attribute name="PUTTC" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;minInclusive value="0.00"/>
                 *             &lt;maxInclusive value="999999"/>
                 *             &lt;fractionDigits value="2"/>
                 *             &lt;totalDigits value="7"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *       &lt;attribute name="SEUIL">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *             &lt;minInclusive value="0.000"/>
                 *             &lt;totalDigits value="8"/>
                 *             &lt;fractionDigits value="3"/>
                 *             &lt;maxInclusive value="99999.999"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "qteu",
                    "qtes"
                })
                public static class PRXU {

                    @XmlElement(name = "QTEU")
                    protected MDA.ARTS.MCON.PXQT.PRXU.QTEU qteu;
                    @XmlElement(name = "QTES")
                    protected MDA.ARTS.MCON.PXQT.PRXU.QTES qtes;
                    @XmlAttribute(name = "PUTTC", required = true)
                    protected BigDecimal puttc;
                    @XmlAttribute(name = "SEUIL")
                    protected BigDecimal seuil;

                    /**
                     * Obtient la valeur de la propri�t� qteu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXU.QTEU }
                     *     
                     */
                    public MDA.ARTS.MCON.PXQT.PRXU.QTEU getQTEU() {
                        return qteu;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qteu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXU.QTEU }
                     *     
                     */
                    public void setQTEU(MDA.ARTS.MCON.PXQT.PRXU.QTEU value) {
                        this.qteu = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� qtes.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXU.QTES }
                     *     
                     */
                    public MDA.ARTS.MCON.PXQT.PRXU.QTES getQTES() {
                        return qtes;
                    }

                    /**
                     * D�finit la valeur de la propri�t� qtes.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MDA.ARTS.MCON.PXQT.PRXU.QTES }
                     *     
                     */
                    public void setQTES(MDA.ARTS.MCON.PXQT.PRXU.QTES value) {
                        this.qtes = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� puttc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPUTTC() {
                        return puttc;
                    }

                    /**
                     * D�finit la valeur de la propri�t� puttc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPUTTC(BigDecimal value) {
                        this.puttc = value;
                    }

                    /**
                     * Obtient la valeur de la propri�t� seuil.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSEUIL() {
                        return seuil;
                    }

                    /**
                     * D�finit la valeur de la propri�t� seuil.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSEUIL(BigDecimal value) {
                        this.seuil = value;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTES {


                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class QTEU {


                    }

                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ART" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="13"/>
         *             &lt;pattern value="\d{13}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VCR">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="31"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SART {

            @XmlAttribute(name = "ART", required = true)
            protected String art;
            @XmlAttribute(name = "VCR")
            protected String vcr;

            /**
             * Obtient la valeur de la propri�t� art.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getART() {
                return art;
            }

            /**
             * D�finit la valeur de la propri�t� art.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setART(String value) {
                this.art = value;
            }

            /**
             * Obtient la valeur de la propri�t� vcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCR() {
                return vcr;
            }

            /**
             * D�finit la valeur de la propri�t� vcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCR(String value) {
                this.vcr = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ART" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="13"/>
         *             &lt;pattern value="\d{13}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VCR">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="31"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SCON {

            @XmlAttribute(name = "ART", required = true)
            protected String art;
            @XmlAttribute(name = "VCR")
            protected String vcr;

            /**
             * Obtient la valeur de la propri�t� art.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getART() {
                return art;
            }

            /**
             * D�finit la valeur de la propri�t� art.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setART(String value) {
                this.art = value;
            }

            /**
             * Obtient la valeur de la propri�t� vcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCR() {
                return vcr;
            }

            /**
             * D�finit la valeur de la propri�t� vcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCR(String value) {
                this.vcr = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="MSTM" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="STMR" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CNR" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="2"/>
     *                                 &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="CER" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="15"/>
     *                                 &lt;pattern value="\d{1,15}"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CN" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="2"/>
     *                       &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="CE" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="15"/>
     *                       &lt;pattern value="\d{1,15}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="LE" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="30"/>
     *                       &lt;pattern value=".{1,30}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VCR">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="31"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SSTM" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CN" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="2"/>
     *                       &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="CE" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="15"/>
     *                       &lt;pattern value="\d{1,15}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VCR">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="31"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mstmAndSSTM"
    })
    public static class STRM {

        @XmlElements({
            @XmlElement(name = "MSTM", type = MDA.STRM.MSTM.class),
            @XmlElement(name = "SSTM", type = MDA.STRM.SSTM.class)
        })
        protected List<Object> mstmAndSSTM;

        /**
         * Gets the value of the mstmAndSSTM property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mstmAndSSTM property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMSTMAndSSTM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MDA.STRM.MSTM }
         * {@link MDA.STRM.SSTM }
         * 
         * 
         */
        public List<Object> getMSTMAndSSTM() {
            if (mstmAndSSTM == null) {
                mstmAndSSTM = new ArrayList<Object>();
            }
            return this.mstmAndSSTM;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="STMR" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CNR" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="2"/>
         *                       &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="CER" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="15"/>
         *                       &lt;pattern value="\d{1,15}"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CN" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="2"/>
         *             &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="CE" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="15"/>
         *             &lt;pattern value="\d{1,15}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="LE" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="30"/>
         *             &lt;pattern value=".{1,30}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VCR">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="31"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stmr"
        })
        public static class MSTM {

            @XmlElement(name = "STMR")
            protected MDA.STRM.MSTM.STMR stmr;
            @XmlAttribute(name = "CN", required = true)
            protected String cn;
            @XmlAttribute(name = "CE", required = true)
            protected String ce;
            @XmlAttribute(name = "LE", required = true)
            protected String le;
            @XmlAttribute(name = "VCR")
            protected String vcr;

            /**
             * Obtient la valeur de la propri�t� stmr.
             * 
             * @return
             *     possible object is
             *     {@link MDA.STRM.MSTM.STMR }
             *     
             */
            public MDA.STRM.MSTM.STMR getSTMR() {
                return stmr;
            }

            /**
             * D�finit la valeur de la propri�t� stmr.
             * 
             * @param value
             *     allowed object is
             *     {@link MDA.STRM.MSTM.STMR }
             *     
             */
            public void setSTMR(MDA.STRM.MSTM.STMR value) {
                this.stmr = value;
            }

            /**
             * Obtient la valeur de la propri�t� cn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCN() {
                return cn;
            }

            /**
             * D�finit la valeur de la propri�t� cn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCN(String value) {
                this.cn = value;
            }

            /**
             * Obtient la valeur de la propri�t� ce.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCE() {
                return ce;
            }

            /**
             * D�finit la valeur de la propri�t� ce.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCE(String value) {
                this.ce = value;
            }

            /**
             * Obtient la valeur de la propri�t� le.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLE() {
                return le;
            }

            /**
             * D�finit la valeur de la propri�t� le.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLE(String value) {
                this.le = value;
            }

            /**
             * Obtient la valeur de la propri�t� vcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCR() {
                return vcr;
            }

            /**
             * D�finit la valeur de la propri�t� vcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCR(String value) {
                this.vcr = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="CNR" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="2"/>
             *             &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="CER" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="15"/>
             *             &lt;pattern value="\d{1,15}"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class STMR {

                @XmlAttribute(name = "CNR", required = true)
                protected String cnr;
                @XmlAttribute(name = "CER", required = true)
                protected String cer;

                /**
                 * Obtient la valeur de la propri�t� cnr.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCNR() {
                    return cnr;
                }

                /**
                 * D�finit la valeur de la propri�t� cnr.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCNR(String value) {
                    this.cnr = value;
                }

                /**
                 * Obtient la valeur de la propri�t� cer.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCER() {
                    return cer;
                }

                /**
                 * D�finit la valeur de la propri�t� cer.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCER(String value) {
                    this.cer = value;
                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="CN" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="2"/>
         *             &lt;pattern value="[A-Z]|[0-9]|[0-9][0-9]|[0-9][A-Z]|[A-Z][0-9]|[A-Z][A-Z]"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="CE" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="15"/>
         *             &lt;pattern value="\d{1,15}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VCR">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="31"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SSTM {

            @XmlAttribute(name = "CN", required = true)
            protected String cn;
            @XmlAttribute(name = "CE", required = true)
            protected String ce;
            @XmlAttribute(name = "VCR")
            protected String vcr;

            /**
             * Obtient la valeur de la propri�t� cn.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCN() {
                return cn;
            }

            /**
             * D�finit la valeur de la propri�t� cn.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCN(String value) {
                this.cn = value;
            }

            /**
             * Obtient la valeur de la propri�t� ce.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCE() {
                return ce;
            }

            /**
             * D�finit la valeur de la propri�t� ce.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCE(String value) {
                this.ce = value;
            }

            /**
             * Obtient la valeur de la propri�t� vcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCR() {
                return vcr;
            }

            /**
             * D�finit la valeur de la propri�t� vcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCR(String value) {
                this.vcr = value;
            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="unbounded">
     *         &lt;element name="MTVA" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CTVA" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="1"/>
     *                       &lt;pattern value="[0-9]|[A-Z]"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="TAUX" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;minInclusive value="0.00"/>
     *                       &lt;maxInclusive value="99.99"/>
     *                       &lt;totalDigits value="4"/>
     *                       &lt;fractionDigits value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VCR">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="31"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="STVA" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="CTVA" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="1"/>
     *                       &lt;pattern value="[0-9]|[A-Z]"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VCR">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="31"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mtvaAndSTVA"
    })
    public static class TTVA {

        @XmlElements({
            @XmlElement(name = "MTVA", type = MDA.TTVA.MTVA.class),
            @XmlElement(name = "STVA", type = MDA.TTVA.STVA.class)
        })
        protected List<Object> mtvaAndSTVA;

        /**
         * Gets the value of the mtvaAndSTVA property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mtvaAndSTVA property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMTVAAndSTVA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MDA.TTVA.MTVA }
         * {@link MDA.TTVA.STVA }
         * 
         * 
         */
        public List<Object> getMTVAAndSTVA() {
            if (mtvaAndSTVA == null) {
                mtvaAndSTVA = new ArrayList<Object>();
            }
            return this.mtvaAndSTVA;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="CTVA" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="1"/>
         *             &lt;pattern value="[0-9]|[A-Z]"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="TAUX" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;minInclusive value="0.00"/>
         *             &lt;maxInclusive value="99.99"/>
         *             &lt;totalDigits value="4"/>
         *             &lt;fractionDigits value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VCR">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="31"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class MTVA {

            @XmlAttribute(name = "CTVA", required = true)
            protected String ctva;
            @XmlAttribute(name = "TAUX", required = true)
            protected BigDecimal taux;
            @XmlAttribute(name = "VCR")
            protected String vcr;

            /**
             * Obtient la valeur de la propri�t� ctva.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCTVA() {
                return ctva;
            }

            /**
             * D�finit la valeur de la propri�t� ctva.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCTVA(String value) {
                this.ctva = value;
            }

            /**
             * Obtient la valeur de la propri�t� taux.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTAUX() {
                return taux;
            }

            /**
             * D�finit la valeur de la propri�t� taux.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTAUX(BigDecimal value) {
                this.taux = value;
            }

            /**
             * Obtient la valeur de la propri�t� vcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCR() {
                return vcr;
            }

            /**
             * D�finit la valeur de la propri�t� vcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCR(String value) {
                this.vcr = value;
            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="CTVA" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="1"/>
         *             &lt;pattern value="[0-9]|[A-Z]"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VCR">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="31"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class STVA {

            @XmlAttribute(name = "CTVA", required = true)
            protected String ctva;
            @XmlAttribute(name = "VCR")
            protected String vcr;

            /**
             * Obtient la valeur de la propri�t� ctva.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCTVA() {
                return ctva;
            }

            /**
             * D�finit la valeur de la propri�t� ctva.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCTVA(String value) {
                this.ctva = value;
            }

            /**
             * Obtient la valeur de la propri�t� vcr.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVCR() {
                return vcr;
            }

            /**
             * D�finit la valeur de la propri�t� vcr.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVCR(String value) {
                this.vcr = value;
            }

        }

    }

}
