package study.designpattern.structuralpattern.adapter.after;

import study.designpattern.structuralpattern.adapter.before.Account;
import study.designpattern.structuralpattern.adapter.before.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }


    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
