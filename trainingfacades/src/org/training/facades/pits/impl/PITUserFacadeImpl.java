package org.training.facades.pits.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.model.PITUserModel;
import org.training.core.service.PITUserService;
import org.training.facades.pits.PITUserFacade;
import org.training.facades.product.data.PITUserData;

import javax.annotation.Resource;
import java.util.List;

public class PITUserFacadeImpl implements PITUserFacade {
    @Resource
    private PITUserService pitUserService;
    private Converter<PITUserModel, PITUserData> pitUserConverter;

    @Override
    public List<PITUserData> getAllPITUsers() {

        final List<PITUserModel> pitUserModels = pitUserService.getAllPITUsers();

        return Converters.convertAll(pitUserModels, getPitUserConverter());
    }

    public PITUserService getPitUserService() {
        return pitUserService;
    }

    public void setPitUserService(final PITUserService pitUserService) {
        this.pitUserService = pitUserService;
    }

    public Converter<PITUserModel, PITUserData> getPitUserConverter() {
        return pitUserConverter;
    }

    public void setPitUserConverter(final Converter<PITUserModel, PITUserData> pitUserConverter) {
        this.pitUserConverter = pitUserConverter;
    }

}