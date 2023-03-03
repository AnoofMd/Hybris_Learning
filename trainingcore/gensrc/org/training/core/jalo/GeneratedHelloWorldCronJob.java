/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 02-Mar-2023, 5:45:20 pm                     ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link org.training.core.jalo.HelloWorldCronJob HelloWorldCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedHelloWorldCronJob extends CronJob
{
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
}
