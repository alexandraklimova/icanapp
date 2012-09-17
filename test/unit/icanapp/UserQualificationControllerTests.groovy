package icanapp



import org.junit.*
import grails.test.mixin.*

@TestFor(UserQualificationController)
@Mock(UserQualification)
class UserQualificationControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/userQualification/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.userQualificationInstanceList.size() == 0
        assert model.userQualificationInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.userQualificationInstance != null
    }

    void testSave() {
        controller.save()

        assert model.userQualificationInstance != null
        assert view == '/userQualification/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/userQualification/show/1'
        assert controller.flash.message != null
        assert UserQualification.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/userQualification/list'


        populateValidParams(params)
        def userQualification = new UserQualification(params)

        assert userQualification.save() != null

        params.id = userQualification.id

        def model = controller.show()

        assert model.userQualificationInstance == userQualification
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/userQualification/list'


        populateValidParams(params)
        def userQualification = new UserQualification(params)

        assert userQualification.save() != null

        params.id = userQualification.id

        def model = controller.edit()

        assert model.userQualificationInstance == userQualification
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/userQualification/list'

        response.reset()


        populateValidParams(params)
        def userQualification = new UserQualification(params)

        assert userQualification.save() != null

        // test invalid parameters in update
        params.id = userQualification.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/userQualification/edit"
        assert model.userQualificationInstance != null

        userQualification.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/userQualification/show/$userQualification.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        userQualification.clearErrors()

        populateValidParams(params)
        params.id = userQualification.id
        params.version = -1
        controller.update()

        assert view == "/userQualification/edit"
        assert model.userQualificationInstance != null
        assert model.userQualificationInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/userQualification/list'

        response.reset()

        populateValidParams(params)
        def userQualification = new UserQualification(params)

        assert userQualification.save() != null
        assert UserQualification.count() == 1

        params.id = userQualification.id

        controller.delete()

        assert UserQualification.count() == 0
        assert UserQualification.get(userQualification.id) == null
        assert response.redirectedUrl == '/userQualification/list'
    }
}
