application {
    title='GriffonOAuth'
    startupGroups = ['GriffonOAuth']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "GriffonOAuth"
    'GriffonOAuth' {
        model = 'GriffonOAuthModel'
        controller = 'GriffonOAuthController'
        view = 'GriffonOAuthView'
    }

}
