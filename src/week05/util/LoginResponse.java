package week05.util;

import week05.core.AtmObject;

/**
 * @author cruzem
 *
 */
public class LoginResponse extends AtmObject
{

    private boolean m_loggedIn;
    private long m_sessionId;

    /**
     * Constructor
     * Constructor that captures if loggedin and sessionId#
     * @param loggedIn true or false if log in is successfull
     * @param sessionId SessionId of user)
     */
    public LoginResponse(Boolean loggedIn, long sessionId)
    {
       m_loggedIn = loggedIn;
       m_sessionId = sessionId;
    }

    /**
     * Returns true or false if logged in
     * @return Boolean
     */
    public Boolean getLoggedIn()
    {
        return m_loggedIn;
    }

    /**
     * Retrieves session id
     * @return session id
     */
    public long getSessionId()
    {
        return m_sessionId;
    }

    /**
     * Overrides the Object.equals to compare two LoginRequest references.
     * The are equal if the attributes of the User instance are equal.
     *
     * @param obj The object on the right-hand side to evaluate
     * @return true if match, otherwise false
     */
    @Override
    public boolean equals(Object obj)
    {
        boolean result = false;
        if( obj instanceof LoginResponse)
        {
            LoginResponse rhs = (LoginResponse)obj;
            if( this.getLoggedIn() == rhs.getLoggedIn() &&
                    this.getSessionId() == rhs.getSessionId())
            {
                result = true;
            }
        }

        return result;
    }








}
