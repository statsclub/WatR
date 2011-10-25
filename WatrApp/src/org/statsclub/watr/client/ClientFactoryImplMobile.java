package org.statsclub.watr.client;

import org.statsclub.watr.client.mobile.WatrAppShellMobile;

/**
 * Mobile version of {@link ClientFactory}.
 */
public class ClientFactoryImplMobile extends ClientFactoryImpl {
	@Override
	protected WatrAppShell createShell() {
		return new WatrAppShellMobile();
	}
}
