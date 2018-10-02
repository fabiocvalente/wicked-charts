package de.adesso.wickedcharts.showcase;

import de.adesso.wickedcharts.chartjs.ChartConfiguration;
import de.adesso.wickedcharts.wicket8.chartjs.Chart;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/**
 * Wicket-component that adds the appropriate code container for the displayed charts to the page.
 */
public class CodeComponent extends Panel {

    public CodeComponent(ChartConfiguration chartConfig)
    {
        super("code");
        Label codeContainer = new Label("code", new StringFromResourceModel(
                chartConfig.getClass(), chartConfig.getClass().getSimpleName()
                + ".java"));
        codeContainer.setOutputMarkupId (true);
        this.add(codeContainer);
    }
}
