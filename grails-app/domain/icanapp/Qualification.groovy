package icanapp

/**Qualification will be given to master user and belongs to specified category
 * @author aklimova
 *
 */
class Qualification {
    String title
	String description
	
	
	static hasMany =[userQualification: UserQualification]
     static belongsTo = [categories: Category]	

	static constraints = {
		title()
		description()

    }
	
}
