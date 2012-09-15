import icanapp.*
class BootStrap {

    def init = { servletContext ->
		
		def roleAdmin = new Role(authority: 'ROLE_ADMIN').save(flush: true)
		def roleMaster = new Role(authority: 'ROLE_MASTER').save(flush: true)
		def roleCustomer = new Role(authority: 'ROLE_CUSTOMER').save(flush: true)
		
		
		def userAdmin = new User(username: 'admin', enabled: true, password: 'admin').save(flush: true)
		UserRole.create userAdmin, roleAdmin, true
		
		def userMaster1 = new User(username: 'master1', enabled: true, password: 'master1').save(flush: true)
		def userMaster2 = new User(username: 'master2', enabled: true, password: 'master2').save(flush: true)
		UserRole.create userMaster1, roleMaster, true
		UserRole.create userMaster2, roleMaster, true
		
		def userCustomer1 = new User(username: 'customer1', enabled: true, password: 'customer1').save(flush: true)
		def userCustomer2 = new User(username: 'customer2', enabled: true, password: 'customer2').save(flush: true)
		UserRole.create userCustomer1, roleCustomer, true
		UserRole.create userCustomer2, roleCustomer, true
		
		def userBoth = new User(username: 'both', enabled: true, password: 'both').save(flush: true)
		UserRole.create userBoth, roleMaster, true
		UserRole.create userBoth, roleCustomer, true
		
		
		assert User.count() == 6
		assert Role.count() == 3
		assert UserRole.count() == 7
    }
    def destroy = {
    }
}
