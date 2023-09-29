package study.designpattern.structuralpattern.adapter.after;

import study.designpattern.structuralpattern.adapter.before.AccountService;
import study.designpattern.structuralpattern.adapter.before.security.LoginHandler;
import study.designpattern.structuralpattern.adapter.before.security.UserDetailsService;

public class AfterAdapterApp {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("kim", "kim");
        System.out.println(login);
    }
}
