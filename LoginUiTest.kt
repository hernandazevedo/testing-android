import kotlinx.coroutines.sync.Mutex
import org.junit.Before
import org.junit.Test


class LoginUiTest {

    val mutex = Mutex()

    @Before
    fun setup() {
        clearInput()
    }

    private fun clearInput()  {
//        TODO("Not yet implemented")
        //should clear R.id.error
    }

    @Test
    fun invalidLoginShowError() {
        onView(withId(R.id.login)).check(matches(isDisplayed()))
        onView(withId(R.id.login)).perform()
        onView(withId()).check(matches(isDisplayed()))
    }

    @Test
    fun invalidLoginShowError1() {
        onView(withId(R.id.login)).check(matches(isDisplayed()))
        onView(withId(R.id.login)).perform()
        onView(withId(R.id.error)).check(matches(isDisplayed()))
    }

    /**

    Explain:
    ● What you test at unit vs UI level.
      For Unit Test -> Business logics (moking dependencies) (ViewModels,Respositories, Usecases, Services)
      For UI Level -> Test Screen behaviour (moking dependencies)
    ● How you avoid flaky tests.
     // Make every test independent of each other and dont rely on execution order.
     // Make sure every variable tested should be cleaned up before the test execution
     // Dont rely on Api (mocking is a good strategy, useing dependency inversion, maybe injection frameworks)
     */
}