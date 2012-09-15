package icanapp

class Category {
    String title
	String picture
	static belongsTo = Qualification
	static hasMany= [qualifications:Qualification]
    static constraints = {
    }
}
