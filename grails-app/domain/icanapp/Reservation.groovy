package icanapp

class Reservation {
	Date createdDate	
	static belongsTo = [event:Event, customer:User]
    static constraints = {
    }
}
