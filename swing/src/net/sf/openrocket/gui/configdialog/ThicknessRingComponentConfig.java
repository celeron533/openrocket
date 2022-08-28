package net.sf.openrocket.gui.configdialog;


import javax.swing.JDialog;
import javax.swing.JPanel;

import net.sf.openrocket.document.OpenRocketDocument;
import net.sf.openrocket.gui.adaptors.CustomFocusTraversalPolicy;
import net.sf.openrocket.l10n.Translator;
import net.sf.openrocket.rocketcomponent.RocketComponent;
import net.sf.openrocket.startup.Application;



public class ThicknessRingComponentConfig extends RingComponentConfig {
	private static final Translator trans = Application.getTranslator();
	
	public ThicknessRingComponentConfig(OpenRocketDocument d, RocketComponent c, JDialog parent) {
		super(d, c, parent);
		
		JPanel tab;
		
		//// Outer diameter:
		//// Inner diameter:
		//// Wall thickness:
		//// Length:
		tab = generalTab(trans.get("ThicknessRingCompCfg.tab.Outerdiam"),
				trans.get("ThicknessRingCompCfg.tab.Innerdiam"),
				trans.get("ThicknessRingCompCfg.tab.Wallthickness"), trans.get("ThicknessRingCompCfg.tab.Length"));
		//// General and General properties
		tabbedPane.insertTab(trans.get("ThicknessRingCompCfg.tab.General"), null, tab,
				trans.get("ThicknessRingCompCfg.tab.Generalprop"), 0);
		tabbedPane.setSelectedIndex(0);

		// Apply the custom focus travel policy to this panel
		order.add(closeButton);		// Make sure the close button is the last component
		CustomFocusTraversalPolicy policy = new CustomFocusTraversalPolicy(order);
		parent.setFocusTraversalPolicy(policy);
	}
	
}