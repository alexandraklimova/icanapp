package icanapp

class UserQualification {
	String rating
	static belongsTo = [master:User, qualification:Qualification]
	static hasMany = [events:Event]
    static constraints = {
		//	rating(inList:"bad","soso","good","super")
    }
}
