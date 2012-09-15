package icanapp

class Reservation {
	Date dateWhenCreated
	
	static belongsTo = [event:Event, customer:User]
	
	
	
	
	
	
    static constraints = {
    }
}
