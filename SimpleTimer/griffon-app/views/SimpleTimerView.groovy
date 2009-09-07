import java.awt.Color

application(title:'SimpleTimer',
  size:[250,150],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]
) {
    panel(background: new Color(240, 250, 208)) {
		vbox {
			button(text:'Start', actionPerformed: {
				model.time = new java.util.Date()
				controller.wrapLabelText(view.status, "Stop watch started at ${model.time}")
			})
			button(text:'Stop', actionPerformed:{
				def elapsed = (new java.util.Date().getTime() - model.time.getTime())/1000.0f
				view.status.text = "<html>Stopped, <strong>${elapsed}</strong> seconds elapsed.";
				
			})
			label(id:'status', text:'<html>Press <strong>start</strong> to begin timing</html>')
		}
	}
}
