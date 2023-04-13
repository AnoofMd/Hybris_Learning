/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 13-Apr-2023, 3:28:09 am                     ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
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
	/** Qualifier of the <code>PITAddress.addressId</code> attribute **/
	public static final String ADDRESSID = "addressId";
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
		tmp.put(ADDRESSID, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>PITAddress.addressId</code> attribute.
	 * @return the addressId - Address ID of PITUser.
	 */
	public Integer getAddressId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ADDRESSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.addressId</code> attribute.
	 * @return the addressId - Address ID of PITUser.
	 */
	public Integer getAddressId()
	{
		return getAddressId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.addressId</code> attribute. 
	 * @return the addressId - Address ID of PITUser.
	 */
	public int getAddressIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAddressId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.addressId</code> attribute. 
	 * @return the addressId - Address ID of PITUser.
	 */
	public int getAddressIdAsPrimitive()
	{
		return getAddressIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.addressId</code> attribute. 
	 * @param value the addressId - Address ID of PITUser.
	 */
	public void setAddressId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ADDRESSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.addressId</code> attribute. 
	 * @param value the addressId - Address ID of PITUser.
	 */
	public void setAddressId(final Integer value)
	{
		setAddressId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.addressId</code> attribute. 
	 * @param value the addressId - Address ID of PITUser.
	 */
	public void setAddressId(final SessionContext ctx, final int value)
	{
		setAddressId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.addressId</code> attribute. 
	 * @param value the addressId - Address ID of PITUser.
	 */
	public void setAddressId(final int value)
	{
		setAddressId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PITAddress.city</code> attribute.
	 * @return the city - City Name.
	 */
	public String getCity(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CITY);
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
	 * <i>Generated method</i> - Setter of the <code>PITAddress.city</code> attribute. 
	 * @param value the city - City Name.
	 */
	public void setCity(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PITAddress.city</code> attribute. 
	 * @param value the city - City Name.
	 */
	public void setCity(final String value)
	{
		setCity( getSession().getSessionContext(), value );
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
		return (String)getProperty( ctx, LINE1);
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
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line1</code> attribute. 
	 * @param value the line1 - 1st Line.
	 */
	public void setLine1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINE1,value);
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
	 * <i>Generated method</i> - Getter of the <code>PITAddress.line2</code> attribute.
	 * @return the line2 - Line 2.
	 */
	public String getLine2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LINE2);
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
	 * <i>Generated method</i> - Setter of the <code>PITAddress.line2</code> attribute. 
	 * @param value the line2 - Line 2.
	 */
	public void setLine2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LINE2,value);
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
		return (Integer)getProperty( ctx, ZIPCODE);
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
	 * <i>Generated method</i> - Setter of the <code>PITAddress.zipCode</code> attribute. 
	 * @param value the zipCode - ZIP Code.
	 */
	public void setZipCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ZIPCODE,value);
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
	
}
