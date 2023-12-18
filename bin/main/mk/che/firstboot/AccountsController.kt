package mk.che.firstboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class ViewAccount(val id: Int, val name: String)

@RestController
@RequestMapping("/accounts")
class AccountsController {
    @GetMapping("", "/a", "/b")
    fun getAllAccounts(): Iterable<ViewAccount> {
        return listOf(ViewAccount(id = 1, name = "Test 1"))
    }
}
