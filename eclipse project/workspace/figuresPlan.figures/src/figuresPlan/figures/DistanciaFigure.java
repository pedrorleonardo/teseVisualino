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
public class DistanciaFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureDistanciaLabelFigure;

	/**
	 * @generated
	 */
	public DistanciaFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/ir.png").createImage(), 0);	
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureDistanciaLabelFigure = new WrappingLabel();

		fFigureDistanciaLabelFigure.setText("Distancia");

		this.add(fFigureDistanciaLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureDistanciaLabelFigure() {
		return fFigureDistanciaLabelFigure;
	}

}
