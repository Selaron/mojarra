/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

// TestFacesMessage.java

package com.sun.faces.application;
import com.sun.faces.cactus.ServletFacesTestCase;
import com.sun.faces.util.Util;

import java.io.*;

import javax.faces.application.FacesMessage;


/**
 *
 *  <B>TestFacesMessage</B> is a class ...
 *
 * <B>Lifetime And Scope</B> <P>
 *
 */

/**
 * This class tests the <code>FacesMessage</code> class
 * functionality.  It uses the xml configuration file:
 * <code>web/test/WEB-INF/faces-navigation.xml</code>.
 */
public class TestFacesMessage extends ServletFacesTestCase {
    
//
// Protected Constants
//
    
//
// Class Variables
//
    
//
// Instance Variables
//
    
// Attribute Instance Variables
    
// Relationship Instance Variables
    
//
// Constructors and Initializers
//
    
    public TestFacesMessage() {
        super("TestFacesMessage");
    }
    
    
    public TestFacesMessage(String name) {
        super(name);
    }
//
// Class methods
//
    
//
// Methods from TestCase
//
    
//
// General Methods
//
    
// THIS TEST HAS BEEN MOVED TO THE MAVEN BASED TEST HARNESS UNDER test/unit as
// FacesMessageTest.java

    public void testSerializeable() {
    }
    
} // end of class TestFacesMessage

