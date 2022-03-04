interface Mailer {
    fun sendMessage(email: String, message: String)
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
fun main(){
    fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
    ) {
        if (client == null || message == null) return

        val personalInfo: PersonalInfo = client.personalInfo?: return

        val email: String = personalInfo.email ?: return

        mailer.sendMessage(email, message)
    }
}