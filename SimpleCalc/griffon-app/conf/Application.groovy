application {
    title='SimpleCalc'
    startupGroups = ['SimpleCalc']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "SimpleCalc"
    'SimpleCalc' {
        model = 'SimpleCalcModel'
        controller = 'SimpleCalcController'
        view = 'SimpleCalcView'
    }

}
