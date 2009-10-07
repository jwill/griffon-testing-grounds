import groovy.beans.Bindable

class GriffonOAuthModel {
   @Bindable twitter
   def consumerKey 
   def secretKey 
   @Bindable requestToken
   @Bindable accessToken
   
}
