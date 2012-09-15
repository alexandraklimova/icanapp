package icanapp

class Event {
    Date date
	String description
	String location
	Integer maxReservations
	
	static belongsTo = [qualification:Qualification, master:User]
	static hasMany = [reservations:Reservation]
	
    static constraints = {
    }
}
