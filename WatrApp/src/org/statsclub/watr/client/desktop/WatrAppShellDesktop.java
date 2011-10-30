package org.statsclub.watr.client.desktop;

import org.statsclub.watr.client.WatrAppShell;
import org.statsclub.watr.client.mobile.WatrAppShellMobile;
import org.statsclub.watr.client.tablet.WatrAppShellTablet;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class WatrAppShellDesktop extends ResizeComposite implements WatrAppShell {

	private static WatrAppShellDesktopUiBinder uiBinder = GWT.create(WatrAppShellDesktopUiBinder.class);

	interface WatrAppShellDesktopUiBinder extends UiBinder<Widget, WatrAppShellDesktop> {
	}

	@UiField
	SimpleLayoutPanel contentPanel;

	@UiField
	SimpleLayoutPanel menuPanel;

	public WatrAppShellDesktop() {
		initWidget(uiBinder.createAndBindUi(this));

		Command cmd = new Command() {
			public void execute() {
				Window.alert("You selected a menu item!");
			}
		};

		MenuBar fileMenu = new MenuBar(true);
		fileMenu.addItem("Open", cmd);
		fileMenu.addItem("Close", cmd);
		fileMenu.addItem("Exit", cmd);

		MenuBar viewMenu = new MenuBar(true);
		viewMenu.addItem("Tablet View", new Command() {
			public void execute() {
				contentPanel.setWidget(new WatrAppShellTablet());
			}
		});
		
		viewMenu.addItem("Mobile View", new Command() {
			public void execute() {
				contentPanel.setWidget(new WatrAppShellMobile());
			}
		});

		MenuBar menuBar = new MenuBar();
		menuBar.addItem("File", fileMenu);
		menuBar.addItem("View", viewMenu);

		menuPanel.setWidget(menuBar);
	}
}