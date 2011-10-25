package org.statsclub.watr.client;

import com.google.web.bindery.event.shared.EventBus;

public interface ClientFactory {
	App getApp();

	EventBus getEventBus();

	WatrAppShell getShell();
}
