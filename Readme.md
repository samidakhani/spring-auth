# Spring security Concepts

- Spring Security adds servlet filters (DelegatingFilterProxy)
  to intercept the request for authentication and authorization.

- The 'Authentication' object

  1. Is passed to the AuthenticationProvider.authenticate() to authenticate the user.
  2. Before authentication it holds the credentials
  3. After authentication it holds the principal and authorities.

- The AuthenticationManager.authenticate() calls the appropriate AuthenticationProvider.authenticate() for authentication which intern calls the UserDetailsService.loadUserByUserName(). This method calls the Identify Store(like LDAP).

- The UserDetailsService returns a UserDetails object which hold the user's store details.

1. Authentication
2. Authorization
3. Principal (logged in user)
4. Role
5. Granted Athority (permission)

Principal (1)----->(N) Role (1)----->(N) Granted Authority
