application {
    title='Proce55ing'
    startupGroups = ['Proce55ing']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "Proce55ing"
    'Proce55ing' {
        model = 'Proce55ingModel'
        view = 'Proce55ingView'
        controller = 'Proce55ingController'
    }

}
