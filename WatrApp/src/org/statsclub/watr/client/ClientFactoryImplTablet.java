package org.statsclub.watr.client;

import org.statsclub.watr.client.tablet.WatrAppShellTablet;
import org.statsclub.watr.client.tablet.TabletHomeView;
import org.statsclub.watr.client.ui.OrientationHelper;
import org.statsclub.watr.client.ui.WindowBasedOrientationHelper;
import org.statsclub.watr.presenter.HomeView;


/**
 * Tablet version of {@link ClientFactory}.
 */
public class ClientFactoryImplTablet extends ClientFactoryImplMobile {
	private final OrientationHelper orientationHelper = new WindowBasedOrientationHelper();

	@Override
	protected WatrAppShell createShell() {
		return new WatrAppShellTablet(this, orientationHelper,
				getHomeView());
	}

	@Override
	protected HomeView createHomeView() {
		return new TabletHomeView();
	}
}
