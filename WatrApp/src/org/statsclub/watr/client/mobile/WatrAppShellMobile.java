package org.statsclub.watr.client.mobile;

import java.util.List;

import org.statsclub.watr.client.WatrAppShell;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.CellList.Style;
import com.google.gwt.user.client.ui.HasOneWidget;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

/**
 * Mobile version of the UI shell.
 */
public class WatrAppShellMobile extends ResizeComposite implements WatrAppShell {

	interface WatrAppShellMobileUiBinder extends UiBinder<Widget, WatrAppShellMobile> {
	}

	private static WatrAppShellMobileUiBinder uiBinder = GWT.create(WatrAppShellMobileUiBinder.class);

	@UiField
	TabLayoutPanel tabPanel;

	@UiField
	SimpleLayoutPanel projectPanel;

	@UiField
	SimpleLayoutPanel dataPanel;

	@UiField
	SimpleLayoutPanel modelPanel;

	@UiField
	SimpleLayoutPanel graphPanel;

	@UiField
	SimpleLayoutPanel tablePanel;

	@UiField
	SimpleLayoutPanel outputPanel;

	public WatrAppShellMobile() {
		initWidget(uiBinder.createAndBindUi(this));
		initInputPanel("project", projectPanel, dataPanel);
		initInputPanel("data", dataPanel, modelPanel);
		initInputPanel("model", modelPanel, graphPanel);
		initInputPanel("graph", graphPanel, outputPanel);
		initInputPanel("table", tablePanel, outputPanel);
		initOutputPanel();
	}

	private void initInputPanel(String name, HasOneWidget inputPanel, final Widget nextPanel) {
		CellList<String> cellList = new CellList<String>(new TextCell(), GWT.<DataCellListResources> create(DataCellListResources.class));
		inputPanel.setWidget(cellList);

		final ListDataProvider<String> dataProvider = new ListDataProvider<String>();
		dataProvider.addDataDisplay(cellList);

		final SingleSelectionModel<String> selectionModel = new SingleSelectionModel<String>();
		cellList.setSelectionModel(selectionModel);
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
			public void onSelectionChange(SelectionChangeEvent event) {
				String selected = selectionModel.getSelectedObject();
				if (selected != null) {
					tabPanel.selectTab(nextPanel);
				}
			}
		});

		List<String> dataList = dataProvider.getList();
		for (int i = 10; i < 20; i++) {
			dataList.add(name + i);
		}
	}

	private void initOutputPanel() {
		Image image = new Image();
		int width = RootLayoutPanel.get().getOffsetWidth();
		int height = RootLayoutPanel.get().getOffsetHeight();
		image.setUrl("http://beta1.opencpu.org/R/call/graphics/plot/png?x=cars&!width=" + width + "&!height=" + height);
		outputPanel.setWidget(image);
	}
}

interface DataCellListResources extends CellList.Resources {
	@Source({ "DataCellList.css" })
	@Override
	public Style cellListStyle();
}
