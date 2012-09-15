package icanapp

/**Qualification will be given to master user and belongs to specified category
 * @author aklimova
 *
 */
class Qualification {
    String title
	String description
	String rating
	
	static hasMany =[subscriptions: Subscription, categories: Category]
	
	static belongsTo =[master:User]
	
	static constraints = {
		title()
		description()
	//	rating(inList:"bad","soso","good","super")
    }
	
}
