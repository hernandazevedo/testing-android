package validators

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class LoginValidatorTest {

    //Subject
    var loginValidator = LoginValidator


//    Valid credentials.
    @Test
    fun shouldResultValidCredentialsWhenUserLogsInWithRightCredentials() {
        //Given
        val user = "user"
        val password = "pass"


        //When
        val result = loginValidator.isValid(user, password)

        //Then
        Assert.assertTrue(result)
    }

    //    Invalid username.
    @Test
    fun shouldResultInvalidCredentialsWhenUserLogsInWithWrongUsername() {
        //Given
        val user = "wrong"
        val password = "pass" //right

        //When
        val result = loginValidator.isValid(user, password)

        //Then
        Assert.assertFalse(result)
    }

    //Invalid password.
    @Test
    fun shouldResultInvalidCredentialsWhenUserLogsInWithWrongPassword() {
        //Given
        val user = "user"//right
        val password = "wrong"

        //When
        val result = loginValidator.isValid(user, password)

        //Then
        Assert.assertFalse(result)
    }

    //Whitespace/blank handling.
    @Test
    fun shouldResultInvalidCredentialsWhenUserLogsInWithUserWhitespaceBlank() {
        //Given
        val user = ""//right
        val password = "pass"

        //When
        val result = loginValidator.isValid(user, password)

        //Then
        Assert.assertFalse(result)
    }

    //Whitespace/blank handling.
    @Test
    fun shouldResultInvalidCredentialsWhenUserLogsInWithPassWhitespaceBlank() {
        //Given
        val user = "user"//right
        val password = ""

        //When
        val result = loginValidator.isValid(user, password)

        //Then
        Assert.assertFalse(result)
    }

    //Whitespace/blank handling.
    @Test
    fun shouldResultInvalidCredentialsWhenUserLogsInWithBothCredentialsWhitespaceBlank() {
        //Given
        val user = ""//right
        val password = ""

        //When
        val result = loginValidator.isValid(user, password)

        //Then
        Assert.assertFalse(result)
    }

    //Whitespace/blank handling.
    @Test
    fun shouldResultInvalidCredentialsWhenUserLogsInWithBothCredentialsWhitespaceBlank11() {
        //Given
        val user = " user "
        val password = " pass "

        //When
        val result = loginValidator.isValid(user, password)

        //Then
        Assert.assertTrue(result)
    }

}