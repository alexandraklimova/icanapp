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

	static hasMany = [qualifications: Qualification, subscriptions: Subscription, reservations: Reservation, reservationRequests: ReservationRequest]
	
	
	

	static constraints = {
		username blank: false, unique: true
		password blank: false
		description nullable:true
		email email: true, nullable: true
		sex  nullable: true
		
		
		qualifications nullable : true 
		subscriptions nullable : true 
		reservations nullable : true 
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
