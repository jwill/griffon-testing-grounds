application {
    title='jmeSwing'
    startupGroups = ['jmeSwing']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "jmeSwing"
    'jmeSwing' {
        model = 'JmeSwingModel'
        controller = 'JmeSwingController'
		view = 'JmeSwingView'
        
    }

}
