package org.training.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class TrainingProductPopulator extends ProductPopulator {

    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
        super.populate(source,target);
        target.setSubHeadline(source.getSubHeadline());
    }
}
