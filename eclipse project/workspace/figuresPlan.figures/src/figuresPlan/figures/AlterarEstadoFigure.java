package figuresPlan.figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class AlterarEstadoFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureAlterarEstadoLabelFigure;

	/**
	 * @generated
	 */
	public AlterarEstadoFigure() {
		this.setCornerDimensions(new Dimension(8, 8));
		this.setBorder(new MarginBorder(5, 5, 5, 5));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureAlterarEstadoLabelFigure = new WrappingLabel();

		fFigureAlterarEstadoLabelFigure.setText("AlterarEstado");

		this.add(fFigureAlterarEstadoLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureAlterarEstadoLabelFigure() {
		return fFigureAlterarEstadoLabelFigure;
	}

}
