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

package com.sun.faces.test.servlet40.exactmapping;

import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;


@FacesConfig(
	version = JSF_2_3 
)
@Named
@RequestScoped
public class ExactMappingBean {
    
    @Inject
    private FacesContext context;
    
    private String message; 
    private String message2;

    public void foo() {
        message = "foo method invoked";
    }
    
    public void ajax() {
        message = "should not see this";
        message2 = "partial request = " + context.getPartialViewContext().isPartialRequest();
    }
    
    public String getMessage() {
        return message;
    }
    
    public String getMessage2() {
        return message2;
    }
   
  
}
