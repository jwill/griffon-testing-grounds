import com.jme.input.KeyInput
import java.awt.event.KeyListener
import com.jme.input.InputHandler
import com.jme.system.DisplaySystem
import com.jmex.awt.lwjgl.LWJGLCanvas
import com.jme.system.canvas.JMECanvas
import java.awt.event.ComponentListener
import com.jmex.awt.input.AWTMouseInput
import com.jme.system.lwjgl.LWJGLSystemProvider
import com.jme.system.canvas.JMECanvasImplementor
import com.jmex.awt.lwjgl.LWJGLAWTCanvasConstructor

class JmeSwingController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
		// make the canvas:
		model.display = DisplaySystem.getDisplaySystem(LWJGLSystemProvider.LWJGL_SYSTEM_IDENTIFIER);
		model.display.registerCanvasConstructor("AWT", LWJGLAWTCanvasConstructor.class);
		model.canvas = (LWJGLCanvas)model.display.createCanvas(model.width, model.height);
		model.canvas.setUpdateInput(true);
		model.canvas.setTargetRate(60);			
		
		// Setup key and mouse input
		KeyInput.setProvider(KeyInput.INPUT_AWT);
		KeyListener kl = (KeyListener) KeyInput.get();
		model.canvas.addKeyListener(kl);
		AWTMouseInput.setup(model.canvas, false);

		// Important! Here is where we add the guts to the panel:
		model.impl = new MyImplementor(model.width, model.height);
		model.canvas.setImplementor(model.impl);
		model.canvas.setBounds(0, 0, model.width, model.height);
    }
}
