package org.statsclub.watr.client.desktop;

import org.statsclub.watr.presenter.HomeView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class DesktopHomeView extends Composite implements HomeView {

	private static DesktopHomeViewUiBinder uiBinder = GWT
			.create(DesktopHomeViewUiBinder.class);

	interface DesktopHomeViewUiBinder extends UiBinder<Widget, DesktopHomeView> {
	}

	public DesktopHomeView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
