import javax.swing.JFileChooser

class SimpleDialogsController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        // this method is called after model and view are injected
    }
	
	def confirm = {
		def result = JOptionPane.showConfirmDialog(null,"Would you like to proceed?")
		switch(result) {
			case YES_OPTION:
				view.result.text = "You selected Yes."
				break
			case NO_OPTION:
				view.result.text = "You selected No."
				break
			case CANCEL_OPTION:
				view.result.text = "You selected Cancel."
				break
	}
	
	def openSaveFileOrDir = { msg, openFile, selectionMode, prefix ->
		def result
		model.fileChooser.setDialogTitle(msg)
		model.fileChooser.setFileSelectionMode(selectionMode)
		if (openFile)
			result = model.fileChooser.showOpenDialog(null)
		else result = model.fileChooser.showSaveDialog(null)
		if (result == JFileChooser.APPROVE_OPTION) {
			def file = model.fileChooser.getSelectedFile()
			view.result.text = "You selected ${file.getName()}"
		}
	}
}
