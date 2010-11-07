application {
	title="GriffonOAuth"
	startupGroups=["GriffonOAuth"]
	autoShutdown=true
}
mvcGroups {
	GriffonOAuth {
		model="GriffonOAuthModel"
		controller="GriffonOAuthController"
		view="GriffonOAuthView"
	}
}
