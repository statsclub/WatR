package org.statsclub.watr.client.desktop;

import org.statsclub.watr.client.WatrAppShell;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.UrlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class WatrAppShellDesktop extends ResizeComposite implements WatrAppShell {

	private static WatrAppShellDesktopUiBinder uiBinder = GWT.create(WatrAppShellDesktopUiBinder.class);

	interface WatrAppShellDesktopUiBinder extends UiBinder<Widget, WatrAppShellDesktop> {
	}

	@UiField
	SimpleLayoutPanel contentPanel;

	public WatrAppShellDesktop() {
		initWidget(uiBinder.createAndBindUi(this));				
	}
}