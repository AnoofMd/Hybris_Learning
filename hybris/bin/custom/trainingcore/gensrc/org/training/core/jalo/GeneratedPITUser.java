/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-Dec-2022, 3:21:04 pm                     ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.PITAddress;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PITUser}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPITUser extends GenericItem
{
	/** Qualifier of the <code>PITUser.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>PITUser.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>PITUser.job_title</code> attribute **/
	public static final String JOB_TITLE = "job_title";
	/** Qualifier of the <code>PITUser.address</code> attribute **/
	public static final String ADDRESS = "address";
	/**
	* {@link OneToManyHandler} for handling 1:n ADDRESS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PITAddress> ADDRESSHANDLER = new OneToManyHandler<PITAddress>(
	TrainingCoreConstants.TC.PITADDRESS,
	true,
	"user",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(JOB_TITLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.address</code> attribute.
	 * @return the address
	 */
	public Collection<PITAddress> getAddress(final SessionContext ctx)
	{
		return ADDRESSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.address</code> attribute.
	 * @return the address
	 */
	public Collection<PITAddress> getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Collection<PITAddress> value)
	{
		ADDRESSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Collection<PITAddress> value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to address. 
	 * @param value the item to add to address
	 */
	public void addToAddress(final SessionContext ctx, final PITAddress value)
	{
		ADDRESSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to address. 
	 * @param value the item to add to address
	 */
	public void addToAddress(final PITAddress value)
	{
		addToAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from address. 
	 * @param value the item to remove from address
	 */
	public void removeFromAddress(final SessionContext ctx, final PITAddress value)
	{
		ADDRESSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from address. 
	 * @param value the item to remove from address
	 */
	public void removeFromAddress(final PITAddress value)
	{
		removeFromAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.id</code> attribute.
	 * @return the id - PIT ID of the User.
	 */
	public Integer getId(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUser.getId requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.id</code> attribute.
	 * @return the id - PIT ID of the User.
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.id</code> attribute. 
	 * @return the id - PIT ID of the User.
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.id</code> attribute. 
	 * @return the id - PIT ID of the User.
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.id</code> attribute. 
	 * @return the localized id - PIT ID of the User.
	 */
	public Map<Language,Integer> getAllId(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,ID,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.id</code> attribute. 
	 * @return the localized id - PIT ID of the User.
	 */
	public Map<Language,Integer> getAllId()
	{
		return getAllId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.id</code> attribute. 
	 * @param value the id - PIT ID of the User.
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUser.setId requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.id</code> attribute. 
	 * @param value the id - PIT ID of the User.
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.id</code> attribute. 
	 * @param value the id - PIT ID of the User.
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.id</code> attribute. 
	 * @param value the id - PIT ID of the User.
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.id</code> attribute. 
	 * @param value the id - PIT ID of the User.
	 */
	public void setAllId(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.id</code> attribute. 
	 * @param value the id - PIT ID of the User.
	 */
	public void setAllId(final Map<Language,Integer> value)
	{
		setAllId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.job_title</code> attribute.
	 * @return the job_title - Job Title of the user.
	 */
	public String getJob_title(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUser.getJob_title requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, JOB_TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.job_title</code> attribute.
	 * @return the job_title - Job Title of the user.
	 */
	public String getJob_title()
	{
		return getJob_title( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.job_title</code> attribute. 
	 * @return the localized job_title - Job Title of the user.
	 */
	public Map<Language,String> getAllJob_title(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,JOB_TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.job_title</code> attribute. 
	 * @return the localized job_title - Job Title of the user.
	 */
	public Map<Language,String> getAllJob_title()
	{
		return getAllJob_title( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.job_title</code> attribute. 
	 * @param value the job_title - Job Title of the user.
	 */
	public void setJob_title(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUser.setJob_title requires a session language", 0 );
		}
		setLocalizedProperty(ctx, JOB_TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.job_title</code> attribute. 
	 * @param value the job_title - Job Title of the user.
	 */
	public void setJob_title(final String value)
	{
		setJob_title( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.job_title</code> attribute. 
	 * @param value the job_title - Job Title of the user.
	 */
	public void setAllJob_title(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,JOB_TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.job_title</code> attribute. 
	 * @param value the job_title - Job Title of the user.
	 */
	public void setAllJob_title(final Map<Language,String> value)
	{
		setAllJob_title( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.name</code> attribute.
	 * @return the name - Name of the User.
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUser.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.name</code> attribute.
	 * @return the name - Name of the User.
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.name</code> attribute. 
	 * @return the localized name - Name of the User.
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITUser.name</code> attribute. 
	 * @return the localized name - Name of the User.
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.name</code> attribute. 
	 * @param value the name - Name of the User.
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITUser.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.name</code> attribute. 
	 * @param value the name - Name of the User.
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.name</code> attribute. 
	 * @param value the name - Name of the User.
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITUser.name</code> attribute. 
	 * @param value the name - Name of the User.
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}