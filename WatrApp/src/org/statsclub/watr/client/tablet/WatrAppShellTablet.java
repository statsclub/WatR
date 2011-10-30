package org.statsclub.watr.client.tablet;

import org.statsclub.watr.client.WatrAppShell;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class WatrAppShellTablet extends ResizeComposite implements WatrAppShell {

	interface WatrAppShellTabletUiBinder extends UiBinder<Widget, WatrAppShellTablet> {
	}

	private static WatrAppShellTabletUiBinder uiBinder = GWT.create(WatrAppShellTabletUiBinder.class);
		
	@UiField
	SimpleLayoutPanel outputPanel;

	public WatrAppShellTablet() {
		// Initialize this widget.
		initWidget(uiBinder.createAndBindUi(this));		
	}
}
