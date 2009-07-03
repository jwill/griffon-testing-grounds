import processing.core.PApplet
class Proce55ingController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        // this method is called after model and view are injected
		model.pApplet.init()
		
    }
    /*
    def action = { evt = null ->
    }
    */
}