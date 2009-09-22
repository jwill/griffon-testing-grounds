import java.awt.Font
import java.awt.Color
import java.awt.GradientPaint
import org.jdesktop.swingx.painter.*

application(title:'SimpleCalc',
  //size:[320,480],
  pack:true,
  //location:[50,50],
  locationByPlatform:true,
  iconImage: imageIcon('/griffon-icon-48x48.png').image,
  iconImages: [imageIcon('/griffon-icon-48x48.png').image,
               imageIcon('/griffon-icon-32x32.png').image,
               imageIcon('/griffon-icon-16x16.png').image]
) {
	jxpanel(backgroundPainter:new MattePainter(new GradientPaint(200,0,new Color(238,238,204), 200,200,new Color(153,153,102)))){
	vbox {
		hbox {
			label(font:new Font("Arial", Font.BOLD, 12), text:bind{model.number})
		}
		hbox {
			button("7", actionPerformed:{controller.pressNumber(7)})
			button("8", actionPerformed:{controller.pressNumber(8)})
			button("9", actionPerformed:{controller.pressNumber(9)})
			button("/", actionPerformed:{controller.doOperation("/")})
		}
		hbox {
			button("4", actionPerformed:{controller.pressNumber(4)})
			button("5", actionPerformed:{controller.pressNumber(5)})
			button("6", actionPerformed:{controller.pressNumber(6)})
			button("*", actionPerformed:{controller.doOperation("*")})
		}
		hbox {
			button("1", actionPerformed:{controller.pressNumber(1)})
			button("2", actionPerformed:{controller.pressNumber(2)})
			button("3", actionPerformed:{controller.pressNumber(3)})
			button("-", actionPerformed:{controller.doOperation("-")})
		}
		hbox {
			button("0", actionPerformed:{controller.pressNumber(0)})
			button("Clr", actionPerformed:{controller.clear()})
			button("=", actionPerformed:{controller.pressEquals()})
			button("+", actionPerformed:{controller.doOperation("+")})
		}
	}
	}
}
