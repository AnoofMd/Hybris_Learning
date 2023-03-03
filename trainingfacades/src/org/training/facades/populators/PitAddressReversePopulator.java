package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.model.PITAddressModel;
import org.training.core.model.PITUserModel;
import org.training.core.service.PITUserService;
import org.training.facades.product.data.PITAddressData;
import org.training.facades.product.data.PITUserData;

import javax.annotation.Resource;

public class PitAddressReversePopulator implements Populator<PITAddressData, PITAddressModel> {
    @Resource
    private PITUserService pitUserService;
    @Override
    public void populate(PITAddressData source, PITAddressModel target) throws ConversionException {
        target.setAddressId(source.getAddressId());
        target.setLine1(source.getLine1());
        target.setLine2(source.getLine2());
        target.setCity(source.getCity());
        target.setZipCode(source.getZipCode());
        target.setUser(pitUserService.getPitUserByCode(source.getUser().getId()));
    }

    public PITUserService getPitUserService() {
        return pitUserService;
    }

    public void setPitUserService(PITUserService pitUserService) {
        this.pitUserService = pitUserService;
    }
}
