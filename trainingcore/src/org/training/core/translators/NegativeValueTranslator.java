package org.training.core.translators;

import de.hybris.platform.impex.jalo.translators.AbstractValueTranslator;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import org.apache.commons.lang.StringUtils;

public class NegativeValueTranslator extends AbstractValueTranslator
{
    @Override
    public Object importValue(final String valueExpr,
                              final Item toItem) throws
            JaloInvalidParameterException
    {
        clearStatus();
        Double result = null;
        if (!StringUtils.isBlank(valueExpr))
        {
            try
            {
                result = Double.valueOf(valueExpr);
            }
            catch (final NumberFormatException exc)
            {
                setError();
            }
            if (result != null && result.doubleValue() <
                    0.0)
            {
                setError();
            }
        }
        return result;
    }
    @Override
    public String exportValue(final Object value)
            throws JaloInvalidParameterException
    {
        return value == null ? "" : value.toString();
    }
}
