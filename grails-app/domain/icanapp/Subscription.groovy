package icanapp

/**
 * Subscription will trigger a notification to the subscribed customer in case a new Event is registered for the selected Qualification or by the selected Master 
 * 
 * @author aklimova
 */
class Subscription {
    String notification
    static constraints = {
		
    }
	
	static belongsTo = [customer:User, qualification:Qualification]
}
