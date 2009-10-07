import twitter4j.*
import twitter4j.http.*
import javax.swing.JOptionPane
class GriffonOAuthController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        // this method is called after model and view are injected
    }

    def login = {
		model.twitter = new Twitter()
		model.twitter.setOAuthConsumer(model.consumerKey, model.secretKey)
		model.requestToken = model.twitter.getOAuthRequestToken()
		def url = model.requestToken.getAuthorizationURL()
		BareBonesBrowserLaunch.openURL(url)
		view.done.enabled = true
	}
	
	def showLastTweet = {
		try {
			if (!model.accessToken) {
				model.accessToken = model.twitter.getOAuthAccessToken(model.requestToken, view.pinCode.text)
				
			}
			def msg = model.twitter.getDirectMessages(new Paging(1,1))[0]
			def sender = msg.getSender().getName()
			def text = msg.getText()
			def recipient = msg.getRecipient().getName()
			def output = "From ${sender} to ${recipient} \n : ${text}"
			edt {
					JOptionPane.showMessageDialog(null, output)
				}
		} catch (TwitterException te) {
			if (te.getStatusCode() == 401) {
				edt {
					JOptionPane.showMessageDialog(null, "Unable to get access token.")
				}
			} else {
				te.printStackTrace()
			}				
		} 
	}
}
