application(title:'GriffonOAuth',
  //size:[320,480],
  pack:true,
  //location:[50,50],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]
) {
	vbox {
		button(id:"login", "Login with Twitter", actionPerformed: {controller.login() })
		textField(id:"pinCode", columns:10)
		button(id:"done", enabled:false, "Press here when done", actionPerformed: {controller.showLastTweet()})
	}
}
