class SimpleCalcController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        // this method is called after model and view are injected
    }

    def pressNumber = { num ->
		model.number = (model.number * 10) + num
	}
	
	def clear = {
		model.number = 0
	}
	
	def pressEquals = {
		switch (model.op) {
			case '*':
				model.number = (model.previous).multiply(model.number)
				break
			case '/':
				model.number = (model.previous).div(model.number)
				break
			case '+':
				model.number = (model.previous).plus(model.number)
				break
			case '-':
				model.number = (model.previous).minus(model.number)
				break
		}
		model.previous = null
		model.op = null
	}
	
	def doOperation = { op ->
		if (model.op) {
			pressEquals()
		} else {
			model.op = op
			model.previous = model.number 
			model.number = 0
		}
	}
	
}
