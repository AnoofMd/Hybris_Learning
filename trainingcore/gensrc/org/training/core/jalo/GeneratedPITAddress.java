/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 04-Jan-2023, 6:23:22 pm                     ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.PITUser;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PITAddress}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPITAddress extends GenericItem
{
	/** Qualifier of the <code>PITAddress.line1</code> attribute **/
	public static final String LINE1 = "line1";
	/** Qualifier of the <code>PITAddress.line2</code> attribute **/
	public static final String LINE2 = "line2";
	/** Qualifier of the <code>PITAddress.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>PITAddress.zipCode</code> attribute **/
	public static final String ZIPCODE = "zipCode";
	/** Qualifier of the <code>PITAddress.user</code> attribute **/
	public static final String USER = "user";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n USER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPITAddress> USERHANDLER = new BidirectionalOneToManyHandler<GeneratedPITAddress>(
	TrainingCoreConstants.TC.PITADDRESS,
	false,
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
		tmp.put(LINE1, AttributeMode.INITIAL);
		tmp.put(LINE2, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(ZIPCODE, AttributeMode.INITIAL);
		tmp.put(USER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.city</code> attribute.
	 * @return the city - City Name.
	 */
	public String getCity(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITAddress.getCity requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.city</code> attribute.
	 * @return the city - City Name.
	 */
	public String getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.city</code> attribute. 
	 * @return the localized city - City Name.
	 */
	public Map<Language,String> getAllCity(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,CITY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.city</code> attribute. 
	 * @return the localized city - City Name.
	 */
	public Map<Language,String> getAllCity()
	{
		return getAllCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.city</code> attribute. 
	 * @param value the city - City Name.
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITAddress.setCity requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.city</code> attribute. 
	 * @param value the city - City Name.
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.city</code> attribute. 
	 * @param value the city - City Name.
	 */
	public void setAllCity(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.city</code> attribute. 
	 * @param value the city - City Name.
	 */
	public void setAllCity(final Map<Language,String> value)
	{
		setAllCity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		USERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line1</code> attribute.
	 * @return the line1 - 1st Line.
	 */
	public String getLine1(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITAddress.getLine1 requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LINE1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line1</code> attribute.
	 * @return the line1 - 1st Line.
	 */
	public String getLine1()
	{
		return getLine1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line1</code> attribute. 
	 * @return the localized line1 - 1st Line.
	 */
	public Map<Language,String> getAllLine1(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LINE1,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line1</code> attribute. 
	 * @return the localized line1 - 1st Line.
	 */
	public Map<Language,String> getAllLine1()
	{
		return getAllLine1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line1</code> attribute. 
	 * @param value the line1 - 1st Line.
	 */
	public void setLine1(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITAddress.setLine1 requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LINE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line1</code> attribute. 
	 * @param value the line1 - 1st Line.
	 */
	public void setLine1(final String value)
	{
		setLine1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line1</code> attribute. 
	 * @param value the line1 - 1st Line.
	 */
	public void setAllLine1(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LINE1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line1</code> attribute. 
	 * @param value the line1 - 1st Line.
	 */
	public void setAllLine1(final Map<Language,String> value)
	{
		setAllLine1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line2</code> attribute.
	 * @return the line2 - Line 2.
	 */
	public String getLine2(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITAddress.getLine2 requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LINE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line2</code> attribute.
	 * @return the line2 - Line 2.
	 */
	public String getLine2()
	{
		return getLine2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line2</code> attribute. 
	 * @return the localized line2 - Line 2.
	 */
	public Map<Language,String> getAllLine2(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LINE2,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line2</code> attribute. 
	 * @return the localized line2 - Line 2.
	 */
	public Map<Language,String> getAllLine2()
	{
		return getAllLine2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line2</code> attribute. 
	 * @param value the line2 - Line 2.
	 */
	public void setLine2(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITAddress.setLine2 requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LINE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line2</code> attribute. 
	 * @param value the line2 - Line 2.
	 */
	public void setLine2(final String value)
	{
		setLine2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line2</code> attribute. 
	 * @param value the line2 - Line 2.
	 */
	public void setAllLine2(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LINE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line2</code> attribute. 
	 * @param value the line2 - Line 2.
	 */
	public void setAllLine2(final Map<Language,String> value)
	{
		setAllLine2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.user</code> attribute.
	 * @return the user
	 */
	public PITUser getUser(final SessionContext ctx)
	{
		return (PITUser)getProperty( ctx, USER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.user</code> attribute.
	 * @return the user
	 */
	public PITUser getUser()
	{
		return getUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final SessionContext ctx, final PITUser value)
	{
		USERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final PITUser value)
	{
		setUser( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.zipCode</code> attribute.
	 * @return the zipCode - ZIP Code.
	 */
	public Integer getZipCode(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITAddress.getZipCode requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, ZIPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.zipCode</code> attribute.
	 * @return the zipCode - ZIP Code.
	 */
	public Integer getZipCode()
	{
		return getZipCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.zipCode</code> attribute. 
	 * @return the zipCode - ZIP Code.
	 */
	public int getZipCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getZipCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.zipCode</code> attribute. 
	 * @return the zipCode - ZIP Code.
	 */
	public int getZipCodeAsPrimitive()
	{
		return getZipCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.zipCode</code> attribute. 
	 * @return the localized zipCode - ZIP Code.
	 */
	public Map<Language,Integer> getAllZipCode(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,ZIPCODE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.zipCode</code> attribute. 
	 * @return the localized zipCode - ZIP Code.
	 */
	public Map<Language,Integer> getAllZipCode()
	{
		return getAllZipCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.zipCode</code> attribute. 
	 * @param value the zipCode - ZIP Code.
	 */
	public void setZipCode(final SessionContext ctx, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPITAddress.setZipCode requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ZIPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.zipCode</code> attribute. 
	 * @param value the zipCode - ZIP Code.
	 */
	public void setZipCode(final Integer value)
	{
		setZipCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.zipCode</code> attribute. 
	 * @param value the zipCode - ZIP Code.
	 */
	public void setZipCode(final SessionContext ctx, final int value)
	{
		setZipCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.zipCode</code> attribute. 
	 * @param value the zipCode - ZIP Code.
	 */
	public void setZipCode(final int value)
	{
		setZipCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.zipCode</code> attribute. 
	 * @param value the zipCode - ZIP Code.
	 */
	public void setAllZipCode(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,ZIPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.zipCode</code> attribute. 
	 * @param value the zipCode - ZIP Code.
	 */
	public void setAllZipCode(final Map<Language,Integer> value)
	{
		setAllZipCode( getSession().getSessionContext(), value );
	}
	
}
