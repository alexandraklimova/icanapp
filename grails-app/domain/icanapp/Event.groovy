package icanapp

class Event {
    Date date
	String description
	String location
	Integer maxReservation
	boolean mode
	static belongsTo = [userQualification:UserQualification]
	static hasMany = [reservations:Reservation]
	
    static constraints = {
    }
}
