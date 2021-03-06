/*******************************************************************************
 * Copyright (c) 2012, 2020 Pivotal Software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Pivotal Software, Inc. - initial API and implementation
 *******************************************************************************/
package com.vmware.vfabric.ide.eclipse.tcserver.configurator.tests;

import org.eclipse.equinox.internal.p2.engine.ActionManager;
import org.eclipse.equinox.p2.engine.spi.ProvisioningAction;

import com.vmware.vfabric.ide.eclipse.tcserver.internal.configurator.Activator;

import junit.framework.TestCase;

public class ConfiguratorActionTest extends TestCase {

	public void testActionPresent() {
		ActionManager manager = new ActionManager();
		ProvisioningAction action = manager.getAction("com.springsource.sts.ide.configure", null);
		assertNotNull("Expected com.springsource.sts.ide.configure action, got null", action);
	}

	public void testConfiguratorActionRegistered() {
		assertNotNull(Activator.getDefault());
		assertTrue(Activator.getDefault().isConfigurationActionRegistered());
	}

}
