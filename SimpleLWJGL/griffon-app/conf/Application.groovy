application {
    title='SimpleLWJGL'
    startupGroups = ['SimpleLWJGL']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "SimpleLWJGL"
    'SimpleLWJGL' {
        model = 'SimpleLWJGLModel'
        view = 'SimpleLWJGLView'
        controller = 'SimpleLWJGLController'
    }

}
