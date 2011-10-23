package org.statsclub.watr.client.desktop;

import java.util.Arrays;
import java.util.List;

import org.statsclub.watr.presenter.HomeView;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class DesktopHomeView extends Composite implements HomeView {

	private static DesktopHomeViewUiBinder uiBinder = GWT.create(DesktopHomeViewUiBinder.class);

	interface DesktopHomeViewUiBinder extends UiBinder<Widget, DesktopHomeView> {
	}

	@UiField
	SimpleLayoutPanel topLayout;

	@UiField
	SimpleLayoutPanel centerLayout;

	public DesktopHomeView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		Button uploadButton = new Button("Upload");
		topLayout.add(uploadButton);
		
		TextCell textCell = new TextCell();
		CellList<String> cellList = new CellList<String>(textCell);		
		cellList.setRowData(0, Arrays.asList("Test1", "Test2"));
		centerLayout.add(cellList);
	}
}