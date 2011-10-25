package org.statsclub.watr.client;

import org.statsclub.watr.client.desktop.WatrAppShellDesktop;

import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * Default implementation of {@link ClientFactory}. Used by desktop version.
 */
class ClientFactoryImpl implements ClientFactory {
	private final EventBus eventBus = new SimpleEventBus();

	private WatrAppShell shell;

	public ClientFactoryImpl() {
	}

	public App getApp() {
		return new App(getShell());
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	public WatrAppShell getShell() {
		if (shell == null) {
			shell = createShell();
		}
		return shell;
	}

	protected WatrAppShell createShell() {
		return new WatrAppShellDesktop();
	}
}
