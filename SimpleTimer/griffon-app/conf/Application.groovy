application {
    title='SimpleTimer'
    startupGroups = ['SimpleTimer']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "SimpleTimer"
    'SimpleTimer' {
        model = 'SimpleTimerModel'
        view = 'SimpleTimerView'
        controller = 'SimpleTimerController'
    }

}
