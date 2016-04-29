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
public class EsperaFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureEsperaLabelFigure;

	/**
	 * @generated
	 */
	public EsperaFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/espera.png").createImage(), 0);	
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureEsperaLabelFigure = new WrappingLabel();

		fFigureEsperaLabelFigure.setText("Espera");

		this.add(fFigureEsperaLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureEsperaLabelFigure() {
		return fFigureEsperaLabelFigure;
	}

}
