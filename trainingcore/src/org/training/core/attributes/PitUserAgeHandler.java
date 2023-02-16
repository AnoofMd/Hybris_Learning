package org.training.core.attributes;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.training.core.model.PITUserModel;

import java.util.Calendar;
import java.util.Date;

public class PitUserAgeHandler extends
        AbstractDynamicAttributeHandler<Integer, PITUserModel> {
    public Integer get(final PITUserModel model)
    {
        int pituserAge = 0;
        try
        {
            final Date pitUserRegisteredDate = model.getCreationtime();
            final Calendar cal = Calendar.getInstance();
            cal.setTime(pitUserRegisteredDate);
            final int registeredYear = cal.get(Calendar.YEAR);
            final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            pituserAge = currentYear - registeredYear;
        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }
        return pituserAge;
    }
}
