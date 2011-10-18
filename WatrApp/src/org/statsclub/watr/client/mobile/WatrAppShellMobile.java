package org.statsclub.watr.client.mobile;

import org.statsclub.watr.client.WatrAppShell;
import org.statsclub.watr.client.ui.OrientationHelper;
import org.statsclub.watr.presenter.HomeView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;

/**
 * Mobile version of the UI shell.
 */
public class WatrAppShellMobile extends ResizeComposite implements
		WatrAppShell {

	interface WatrAppShellMobileUiBinder extends
			UiBinder<Widget, WatrAppShellMobile> {
	}

	private static WatrAppShellMobileUiBinder uiBinder = GWT
			.create(WatrAppShellMobileUiBinder.class);

	/**
	 * The panel that holds the current content.
	 */
	@UiField
	SimpleLayoutPanel contentContainer;

	/**
	 * A boolean indicating that we have not yet seen the first content widget.
	 */
	private boolean firstContentWidget = true;

	/**
	 * Construct a new {@link WatrAppShellMobile}.
	 */
	public WatrAppShellMobile(final EventBus eventBus,
			OrientationHelper orientationHelper, HomeView homeView) {

		initWidget(uiBinder.createAndBindUi(this));

		contentContainer.add(homeView);

		orientationHelper.setCommands(this, new Command() {
			@Override
			public void execute() {
				onShiftToPortrait();
			}
		}, new Command() {
			@Override
			public void execute() {
				onShiftToLandscape();
			}
		});
	}

	/**
	 * Set the widget to display in content area.
	 * 
	 * @param content
	 *            the {@link Widget} to display
	 */
	public void setWidget(IsWidget content) {
		contentContainer.setWidget(content);

		// Do not animate the first time we show a widget.
		if (firstContentWidget) {
			firstContentWidget = false;
		}
	}

	private void onShiftToLandscape() {
		// TODO : Landscape
	}

	private void onShiftToPortrait() {
		// TODO : Portrait
	}
}
