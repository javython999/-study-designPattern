package study.designpattern.structuralpattern.adapter.after;

import study.designpattern.structuralpattern.adapter.before.Account;
import study.designpattern.structuralpattern.adapter.before.AccountService;
import study.designpattern.structuralpattern.adapter.before.security.UserDetails;
import study.designpattern.structuralpattern.adapter.before.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
