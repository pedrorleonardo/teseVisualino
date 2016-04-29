package figuresPlan.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import figuresPlan.figures.activator.PluginActivator;

/**
 * @generated
 */
public class ParaleloFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureParaleloLabelFigure;

	/**
	 * @generated
	 */
	public ParaleloFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/paralelo.png").createImage(), 0);	

	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureParaleloLabelFigure = new WrappingLabel();

		fFigureParaleloLabelFigure.setText("Paralelo");

		this.add(fFigureParaleloLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureParaleloLabelFigure() {
		return fFigureParaleloLabelFigure;
	}

}
