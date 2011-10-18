package org.statsclub.watr.client.tablet;

import org.statsclub.watr.presenter.HomeView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class TabletHomeView extends Composite implements HomeView {

	private static TabletHomeViewUiBinder uiBinder = GWT
			.create(TabletHomeViewUiBinder.class);

	interface TabletHomeViewUiBinder extends UiBinder<Widget, TabletHomeView> {
	}

	public TabletHomeView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
