import java.awt.FlowLayout
import java.awt.Color
import javax.swing.JOptionPane
import static javax.swing.JFileChooser.*
import javax.swing.JColorChooser

application(title:'SimpleDialogs',
  size:[300,150],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image],
  layout:new FlowLayout()
) {
    button(text:'Ask', actionPerformed: {
		def result = JOptionPane.showInputDialog("What is your name?")
		view.result.text = "Your name is ${result}"
	})
	button(text:'Confirm', actionPerformed: {controller.confirm()})
	button(text:'Open File...', actionPerformed: {
		controller.openSaveFileOrDir('Open a File...', true, FILES_ONLY)
	})
	button(text:'Save File...',actionPerformed: {
		controller.openSaveFileOrDir('Open a File...', false, FILES_ONLY)
	})
	
	button(text:'Open Folder...', actionPerformed: {
		controller.openSaveFileOrDir('Open a Folder...', true, DIRECTORIES_ONLY)
	})
	button(text:'Save Folder...',actionPerformed: {
		controller.openSaveFileOrDir('Save a Folder...', false, DIRECTORIES_ONLY)
	})
	button(text:'Color', actionPerformed: {
		def color = JColorChooser.showDialog(null, "Pick a Color", Color.WHITE)
		view.result.text = "You selected R:${color.red},G:${color.green},B:${color.blue}"
	})
	label(id:'result')
}
