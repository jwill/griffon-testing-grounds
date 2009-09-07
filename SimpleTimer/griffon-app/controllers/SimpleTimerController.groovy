import java.awt.Container;
import java.awt.FontMetrics;
import java.text.BreakIterator;
import javax.swing.SwingUtilities;

class SimpleTimerController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        // this method is called after model and view are injected
    }
	
	// tweaked from sample on http://www.geekyramblings.org/2005/06/30/wrap-jlabel-text/
	private void wrapLabelText(label, text) {
		FontMetrics fm = label.getFontMetrics(label.getFont())
		Container container = label.getParent()
		int containerWidth = container.getWidth()

		BreakIterator boundary = BreakIterator.getWordInstance()
		boundary.setText(text)

		StringBuffer trial = new StringBuffer()
		StringBuffer real = new StringBuffer("<html>")

		def words = text.split(" ")

		for (word in words) {
			trial.append(" "+word)
			int trialWidth = SwingUtilities.computeStringWidth(fm,
				trial.toString());
			if (trialWidth > containerWidth) {
				trial = new StringBuffer(word)
				real.append("<br>")
			}
			real.append(" "+word)
		}

		label.setText(real.toString())
	}
}
