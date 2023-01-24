package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.PITUserModel;
import org.training.facades.product.data.PITUserData;

public class PITUserReversePopulator implements Populator<PITUserData, PITUserModel> {

    @Override
    public void populate(PITUserData source, PITUserModel target) throws ConversionException {

        target.setId(source.getId());
        target.setName(source.getName());
        target.setJob_title(source.getJob_title());
    }
}
