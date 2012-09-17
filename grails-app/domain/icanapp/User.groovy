package icanapp

class User {

	transient springSecurityService

	String username
	String password
	boolean enabled
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	String email
	String sex
    String description

//	static hasMany = [userQualifications: UserQualification, subscriptions: Subscription, reservations: Reservation, reservationRequests: ReservationRequest]
	
	static hasMany = [userQualifications: UserQualification]
	

	static constraints = {
		username blank: false, unique: true
		password blank: false
		description nullable:true
		email email: true, nullable: true,  unique: true
		sex  nullable: true
		
		
		userQualifications nullable : true 
//		subscriptions nullable : true 
//		reservations nullable : true 
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}
}
