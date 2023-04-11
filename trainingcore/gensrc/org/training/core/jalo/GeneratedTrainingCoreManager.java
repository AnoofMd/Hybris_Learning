/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11-Apr-2023, 12:50:57 pm                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.training.core.jalo.HybrisTubeEmailProcess;
import de.hybris.training.core.jalo.PitUserEmailProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.ApparelProduct;
import org.training.core.jalo.ApparelSizeVariantProduct;
import org.training.core.jalo.ApparelStyleVariantProduct;
import org.training.core.jalo.ColumnUpdateProcess;
import org.training.core.jalo.ElectronicsColorVariantProduct;
import org.training.core.jalo.HelloWorldCronJob;
import org.training.core.jalo.PITAddress;
import org.training.core.jalo.PITUser;
import org.training.core.jalo.PitUserCronJob;
import org.training.core.jalo.ServiceProvider;
import org.training.core.jalo.Vehicle;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("companyName", AttributeMode.INITIAL);
		tmp.put("pitPrice", AttributeMode.INITIAL);
		tmp.put("subHeadline", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.companyName</code> attribute.
	 * @return the companyName - company Name of the Product
	 */
	public String getCompanyName(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.COMPANYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.companyName</code> attribute.
	 * @return the companyName - company Name of the Product
	 */
	public String getCompanyName(final Product item)
	{
		return getCompanyName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.companyName</code> attribute. 
	 * @param value the companyName - company Name of the Product
	 */
	public void setCompanyName(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.COMPANYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.companyName</code> attribute. 
	 * @param value the companyName - company Name of the Product
	 */
	public void setCompanyName(final Product item, final String value)
	{
		setCompanyName( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ColumnUpdateProcess createColumnUpdateProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.COLUMNUPDATEPROCESS );
			return (ColumnUpdateProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ColumnUpdateProcess : "+e.getMessage(), 0 );
		}
	}
	
	public ColumnUpdateProcess createColumnUpdateProcess(final Map attributeValues)
	{
		return createColumnUpdateProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public HelloWorldCronJob createHelloWorldCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.HELLOWORLDCRONJOB );
			return (HelloWorldCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HelloWorldCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public HelloWorldCronJob createHelloWorldCronJob(final Map attributeValues)
	{
		return createHelloWorldCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public HybrisTubeEmailProcess createHybrisTubeEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.HYBRISTUBEEMAILPROCESS );
			return (HybrisTubeEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating HybrisTubeEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public HybrisTubeEmailProcess createHybrisTubeEmailProcess(final Map attributeValues)
	{
		return createHybrisTubeEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public PITAddress createPITAddress(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.PITADDRESS );
			return (PITAddress)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PITAddress : "+e.getMessage(), 0 );
		}
	}
	
	public PITAddress createPITAddress(final Map attributeValues)
	{
		return createPITAddress( getSession().getSessionContext(), attributeValues );
	}
	
	public PITUser createPITUser(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.PITUSER );
			return (PITUser)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PITUser : "+e.getMessage(), 0 );
		}
	}
	
	public PITUser createPITUser(final Map attributeValues)
	{
		return createPITUser( getSession().getSessionContext(), attributeValues );
	}
	
	public PitUserCronJob createPitUserCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.PITUSERCRONJOB );
			return (PitUserCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PitUserCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public PitUserCronJob createPitUserCronJob(final Map attributeValues)
	{
		return createPitUserCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public PitUserEmailProcess createPitUserEmailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.PITUSEREMAILPROCESS );
			return (PitUserEmailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PitUserEmailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public PitUserEmailProcess createPitUserEmailProcess(final Map attributeValues)
	{
		return createPitUserEmailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceProvider createServiceProvider(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.SERVICEPROVIDER );
			return (ServiceProvider)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ServiceProvider : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceProvider createServiceProvider(final Map attributeValues)
	{
		return createServiceProvider( getSession().getSessionContext(), attributeValues );
	}
	
	public Vehicle createVehicle(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.VEHICLE );
			return (Vehicle)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Vehicle : "+e.getMessage(), 0 );
		}
	}
	
	public Vehicle createVehicle(final Map attributeValues)
	{
		return createVehicle( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.pitPrice</code> attribute.
	 * @return the pitPrice - PITS Price of the Product
	 */
	public Double getPitPrice(final SessionContext ctx, final Product item)
	{
		return (Double)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.PITPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.pitPrice</code> attribute.
	 * @return the pitPrice - PITS Price of the Product
	 */
	public Double getPitPrice(final Product item)
	{
		return getPitPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.pitPrice</code> attribute. 
	 * @return the pitPrice - PITS Price of the Product
	 */
	public double getPitPriceAsPrimitive(final SessionContext ctx, final Product item)
	{
		Double value = getPitPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.pitPrice</code> attribute. 
	 * @return the pitPrice - PITS Price of the Product
	 */
	public double getPitPriceAsPrimitive(final Product item)
	{
		return getPitPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.pitPrice</code> attribute. 
	 * @param value the pitPrice - PITS Price of the Product
	 */
	public void setPitPrice(final SessionContext ctx, final Product item, final Double value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.PITPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.pitPrice</code> attribute. 
	 * @param value the pitPrice - PITS Price of the Product
	 */
	public void setPitPrice(final Product item, final Double value)
	{
		setPitPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.pitPrice</code> attribute. 
	 * @param value the pitPrice - PITS Price of the Product
	 */
	public void setPitPrice(final SessionContext ctx, final Product item, final double value)
	{
		setPitPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.pitPrice</code> attribute. 
	 * @param value the pitPrice - PITS Price of the Product
	 */
	public void setPitPrice(final Product item, final double value)
	{
		setPitPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.subHeadline</code> attribute.
	 * @return the subHeadline - Sub Headline of the Product
	 */
	public String getSubHeadline(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getSubHeadline requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, TrainingCoreConstants.Attributes.Product.SUBHEADLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.subHeadline</code> attribute.
	 * @return the subHeadline - Sub Headline of the Product
	 */
	public String getSubHeadline(final Product item)
	{
		return getSubHeadline( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.subHeadline</code> attribute. 
	 * @return the localized subHeadline - Sub Headline of the Product
	 */
	public Map<Language,String> getAllSubHeadline(final SessionContext ctx, final Product item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,TrainingCoreConstants.Attributes.Product.SUBHEADLINE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.subHeadline</code> attribute. 
	 * @return the localized subHeadline - Sub Headline of the Product
	 */
	public Map<Language,String> getAllSubHeadline(final Product item)
	{
		return getAllSubHeadline( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.subHeadline</code> attribute. 
	 * @param value the subHeadline - Sub Headline of the Product
	 */
	public void setSubHeadline(final SessionContext ctx, final Product item, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setSubHeadline requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, TrainingCoreConstants.Attributes.Product.SUBHEADLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.subHeadline</code> attribute. 
	 * @param value the subHeadline - Sub Headline of the Product
	 */
	public void setSubHeadline(final Product item, final String value)
	{
		setSubHeadline( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.subHeadline</code> attribute. 
	 * @param value the subHeadline - Sub Headline of the Product
	 */
	public void setAllSubHeadline(final SessionContext ctx, final Product item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,TrainingCoreConstants.Attributes.Product.SUBHEADLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.subHeadline</code> attribute. 
	 * @param value the subHeadline - Sub Headline of the Product
	 */
	public void setAllSubHeadline(final Product item, final Map<Language,String> value)
	{
		setAllSubHeadline( getSession().getSessionContext(), item, value );
	}
	
}
