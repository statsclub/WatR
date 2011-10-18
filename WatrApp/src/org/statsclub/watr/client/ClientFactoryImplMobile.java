package org.statsclub.watr.client;

import org.statsclub.watr.client.mobile.MobileHomeView;
import org.statsclub.watr.client.mobile.WatrAppShellMobile;
import org.statsclub.watr.client.ui.OrientationHelper;
import org.statsclub.watr.client.ui.WindowBasedOrientationHelper;
import org.statsclub.watr.presenter.HomeView;


/**
 * Mobile version of {@link ClientFactory}.
 */
public class ClientFactoryImplMobile extends ClientFactoryImpl {
	private final OrientationHelper orientationHelper = new WindowBasedOrientationHelper();

	@Override
	protected WatrAppShell createShell() {
		return new WatrAppShellMobile(getEventBus(), orientationHelper,
				getHomeView());
	}

	@Override
	protected HomeView createHomeView() {
		return new MobileHomeView();
	}
}
