package validators

object LoginValidator {
    fun isValid(username: String, password: String): Boolean {
//        Inputs are trimmed.
//        Empty/blank values are rejected.
        return isValidInputs(username, password) &&
                username.trim() == "user"
                && password.trim() == "pass" //Only correct credentials are accepted.
    }

    fun isValidInputs(username: String, password: String): Boolean {
        return username.isNotBlank() &&
                password.isNotBlank();
    }
}