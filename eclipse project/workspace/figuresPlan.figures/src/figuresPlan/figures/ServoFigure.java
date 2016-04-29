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
public class ServoFigure extends ImageFigure {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureServoLabelFigure;

	/**
	 * @generated
	 */
	public ServoFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/servo.png").createImage(), 0);	
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureServoLabelFigure = new WrappingLabel();

		fFigureServoLabelFigure.setText("Servo");

		this.add(fFigureServoLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureServoLabelFigure() {
		return fFigureServoLabelFigure;
	}

}
