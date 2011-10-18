package org.statsclub.watr.client.mobile;

import org.statsclub.watr.presenter.HomeView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MobileHomeView extends Composite implements HomeView {

	private static MobileHomeViewUiBinder uiBinder = GWT
			.create(MobileHomeViewUiBinder.class);

	interface MobileHomeViewUiBinder extends UiBinder<Widget, MobileHomeView> {
	}

	public MobileHomeView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
