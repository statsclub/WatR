package org.statsclub.watr.client;

import org.statsclub.watr.client.tablet.WatrAppShellTablet;

/**
 * Tablet version of {@link ClientFactory}.
 */
public class ClientFactoryImplTablet extends ClientFactoryImplMobile {

	@Override
	protected WatrAppShell createShell() {
		return new WatrAppShellTablet();
	}
}
