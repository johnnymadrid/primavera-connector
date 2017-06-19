package org.mule.modules.primavera.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {
	
	/**
	 * Database name alias
	 */
	@Configurable
	@Default("P6_Pro")
	private String alias;
	

	/**
	 * Login Database Oracle Primavera
	 */
	@Configurable
	@Default("admin")
	private String login;
	

	/**
	 * Password Database Oracle Primavera
	 */
	@Configurable
	@Default("London2017!")
	private String password;
	
	/**
	 * URL connection Oracle Primavera 
	 */
	@Configurable
	private String url;
	

    /**
     * Greeting message
     */
    @Configurable
    @Default("Hello")
    private String greeting;

    /**
     * Reply message
     */
    @Configurable
    @Default("How are you?")
    private String reply;
    
    /**
     * Set greeting message
     *
     * @param greeting the greeting message
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     * Get greeting message
     */
    public String getGreeting() {
        return this.greeting;
    }

    /**
     * Set reply
     *
     * @param reply the reply
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * Get reply
     */
    public String getReply() {
        return this.reply;
    }

    /**
     * Get database name alias
     * @return
     */
	public String getAlias() {
		return alias;
	}

	/** 
	 * Set database name alias
	 * 
	 * @param alias the database name
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/** 
	 * Retrieve Login Details
	 * 
	 * @return
	 */
	public String getLogin() {
		return login;
	}

	/** 
	 * Setup Login Details 
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/** 
	 * Retrieve details about Connnection to Oracle Primavera
	 * 
	 * @return
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Set up url connection to Oracle Primavera
	 * 
	 * @param url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
    
    

}