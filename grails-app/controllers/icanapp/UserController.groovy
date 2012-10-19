package icanapp
//extends grails.plugins.springsecurity.ui.UserController
class UserController  {
	static scaffold = true
	
def profile = {
	[message:"hello world"]
	}

def defaultAction = "profile"
}
