package study.designpattern.structuralpattern.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
