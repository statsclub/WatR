package org.statsclub.watr.client.mobile;

import org.statsclub.watr.client.WatrAppShell;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.DeckLayoutPanel;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;

/**
 * Mobile version of the UI shell.
 */
public class WatrAppShellMobile extends ResizeComposite implements WatrAppShell {

	interface WatrAppShellMobileUiBinder extends UiBinder<Widget, WatrAppShellMobile> {
	}

	private static WatrAppShellMobileUiBinder uiBinder = GWT.create(WatrAppShellMobileUiBinder.class);

	@UiField
	DeckLayoutPanel contentContainer;

	public WatrAppShellMobile() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
