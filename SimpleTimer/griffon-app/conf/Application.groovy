application {
	title="SimpleTimer"
	startupGroups=["SimpleTimer"]
	autoShutdown=true
}
mvcGroups {
	SimpleTimer {
		model="SimpleTimerModel"
		view="SimpleTimerView"
		controller="SimpleTimerController"
	}
}
