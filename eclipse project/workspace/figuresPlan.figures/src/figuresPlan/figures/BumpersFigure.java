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
public class BumpersFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureBumpersLabelFigure;

	/**
	 * @generated
	 */
	public BumpersFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/bumpers.png").createImage(), 0);	
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureBumpersLabelFigure = new WrappingLabel();

		fFigureBumpersLabelFigure.setText("Bumpers");

		this.add(fFigureBumpersLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureBumpersLabelFigure() {
		return fFigureBumpersLabelFigure;
	}

}
