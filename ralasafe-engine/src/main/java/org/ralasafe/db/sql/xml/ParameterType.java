/**
 * Copyright (c) 2004-2011 Wang Jinbao(Julian Wong), http://www.ralasafe.com
 * Licensed under the MIT license: http://www.opensource.org/licenses/mit-license.php
 */
/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.2</a>, using an XML
 * Schema.
 * $Id: ParameterType.java,v 1.2 2010/07/29 02:41:59 back Exp $
 */

package org.ralasafe.db.sql.xml;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * 
 * 
 * @version $Revision: 1.2 $ $Date: 2010/07/29 02:41:59 $
 */
public class ParameterType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Internal choice value storage
     */
    private java.lang.Object _choiceValue;

    /**
     * Field _simpleValue.
     */
    private org.ralasafe.db.sql.xml.SimpleValue _simpleValue;

    /**
     * Field _contextValue.
     */
    private org.ralasafe.db.sql.xml.ContextValue _contextValue;

    /**
     * Field _userValue.
     */
    private org.ralasafe.db.sql.xml.UserValue _userValue;

    /**
     * Field _hintValue.
     */
    private org.ralasafe.db.sql.xml.HintValue _hintValue;


      //----------------/
     //- Constructors -/
    //----------------/

    public ParameterType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'choiceValue'. The field
     * 'choiceValue' has the following description: Internal choice
     * value storage
     * 
     * @return the value of field 'ChoiceValue'.
     */
    public java.lang.Object getChoiceValue(
    ) {
        return this._choiceValue;
    }

    /**
     * Returns the value of field 'contextValue'.
     * 
     * @return the value of field 'ContextValue'.
     */
    public org.ralasafe.db.sql.xml.ContextValue getContextValue(
    ) {
        return this._contextValue;
    }

    /**
     * Returns the value of field 'hintValue'.
     * 
     * @return the value of field 'HintValue'.
     */
    public org.ralasafe.db.sql.xml.HintValue getHintValue(
    ) {
        return this._hintValue;
    }

    /**
     * Returns the value of field 'simpleValue'.
     * 
     * @return the value of field 'SimpleValue'.
     */
    public org.ralasafe.db.sql.xml.SimpleValue getSimpleValue(
    ) {
        return this._simpleValue;
    }

    /**
     * Returns the value of field 'userValue'.
     * 
     * @return the value of field 'UserValue'.
     */
    public org.ralasafe.db.sql.xml.UserValue getUserValue(
    ) {
        return this._userValue;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'contextValue'.
     * 
     * @param contextValue the value of field 'contextValue'.
     */
    public void setContextValue(
            final org.ralasafe.db.sql.xml.ContextValue contextValue) {
        this._contextValue = contextValue;
        this._choiceValue = contextValue;
    }

    /**
     * Sets the value of field 'hintValue'.
     * 
     * @param hintValue the value of field 'hintValue'.
     */
    public void setHintValue(
            final org.ralasafe.db.sql.xml.HintValue hintValue) {
        this._hintValue = hintValue;
        this._choiceValue = hintValue;
    }

    /**
     * Sets the value of field 'simpleValue'.
     * 
     * @param simpleValue the value of field 'simpleValue'.
     */
    public void setSimpleValue(
            final org.ralasafe.db.sql.xml.SimpleValue simpleValue) {
        this._simpleValue = simpleValue;
        this._choiceValue = simpleValue;
    }

    /**
     * Sets the value of field 'userValue'.
     * 
     * @param userValue the value of field 'userValue'.
     */
    public void setUserValue(
            final org.ralasafe.db.sql.xml.UserValue userValue) {
        this._userValue = userValue;
        this._choiceValue = userValue;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.ralasafe.db.sql.xml.ParameterType
     */
    public static org.ralasafe.db.sql.xml.ParameterType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.ralasafe.db.sql.xml.ParameterType) Unmarshaller.unmarshal(org.ralasafe.db.sql.xml.ParameterType.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
