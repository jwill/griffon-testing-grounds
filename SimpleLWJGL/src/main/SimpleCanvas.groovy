import org.lwjgl.LWJGLException
import org.lwjgl.opengl.AWTGLCanvas
import org.lwjgl.opengl.Display
import org.lwjgl.opengl.GL11

public class SimpleCanvas extends AWTGLCanvas {
 
    float angle = 0
 
    public SimpleCanvas() throws LWJGLException {
      // Launch a thread to repaint the canvas 60 fps
      Thread.start{
          while (true) {
            if (isVisible()) {
              repaint()
            }
            Display.sync(60)
          }
      }
    }
 
    public void paintGL() {
	  GL11.with {
		  glClear(GL_COLOR_BUFFER_BIT)
		  glMatrixMode(GL_PROJECTION_MATRIX)
		  glLoadIdentity()
		  glOrtho(0, 640, 0, 480, 1, -1)
		  glMatrixMode(GL_MODELVIEW_MATRIX)
	 
		  glPushMatrix()
		  glTranslatef(320, 240, 0.0f)
		  glRotatef(angle, 0, 0, 1.0f)
		  glBegin(GL_QUADS)
		  glVertex2i(-50, -50)
		  glVertex2i(50, -50)
		  glVertex2i(50, 50)
		  glVertex2i(-50, 50)
		  glEnd()
		  glPopMatrix()
	  }
      angle += 1
 
      try {
        swapBuffers()
      } catch (Exception e) {
      }
    }   
}
