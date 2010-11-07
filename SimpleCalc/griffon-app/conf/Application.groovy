application {
	title="SimpleCalc"
	startupGroups=["SimpleCalc"]
	autoShutdown=true
}
mvcGroups {
	SimpleCalc {
		model="SimpleCalcModel"
		controller="SimpleCalcController"
		view="SimpleCalcView"
	}
}
