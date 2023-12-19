package mk.che.firstboot

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class ViewAccount(val id: Int, val name: String, val buildVersion: String)

@RestController
@RequestMapping("/accounts")
class AccountsController(
    @Value("\${che.firstboot.buildVersion}") val buildVersion: String,
) {
    @GetMapping()
    fun getAllAccounts(): Iterable<ViewAccount> {
        return listOf(ViewAccount(id = 1, name = "Test 1", buildVersion))
    }
}
