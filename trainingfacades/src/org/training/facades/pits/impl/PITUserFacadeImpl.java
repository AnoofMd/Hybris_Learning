package org.training.facades.pits.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.model.PITAddressModel;
import org.training.core.model.PITUserModel;
import org.training.core.service.PITUserService;
import org.training.facades.pits.PITUserFacade;
import org.training.facades.product.data.PITAddressData;
import org.training.facades.product.data.PITUserData;

import javax.annotation.Resource;
import java.util.List;

public class PITUserFacadeImpl implements PITUserFacade {
    @Resource
    private PITUserService pitUserService;
    private Converter<PITUserModel, PITUserData> pitUserConverter;
    private Converter<PITUserData, PITUserModel> pitUserReverseConverter;
    private Converter<PITAddressData, PITAddressModel> pitAddressReverseConverter;

    private ModelService modelService;

    @Override
    public List<PITUserData> getAllPITUsers() {

        final List<PITUserModel> pitUserModels = pitUserService.getAllPITUsers();
        return Converters.convertAll(pitUserModels, getPitUserConverter());
    }

    @Override
    public void savePITUser(PITUserData pitUserData) {
        PITUserModel pitUserModel = pitUserReverseConverter.convert(pitUserData);
        if (pitUserData != null) {
            modelService.save(pitUserModel);
        }
    }

    @Override
    public void updatePitUser(int id) {
        final PITUserModel pitUserModel = pitUserService.getPitUserByCode(id);
        pitUserService.createColumnUpdateBusinessProcess(pitUserModel);
    }

    @Override
    public void sendEmailToPitUser(int id) {
        final PITUserModel pitUserModel = pitUserService.getPitUserByCode(id);
        pitUserService.sendEmailToPitUser(pitUserModel);
    }

    @Override
    public void savePitAddress(PITAddressData pitAddressData) {
        PITAddressModel pitAddressModel = pitAddressReverseConverter.convert(pitAddressData);
            modelService.save(pitAddressModel);
    }

    public void deletePitUserById(int id){
        modelService.remove(pitUserService.getPitUserByCode(id).getPk());
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

    public Converter<PITUserData, PITUserModel> getPitUserReverseConverter() {
        return pitUserReverseConverter;
    }

    public void setPitUserReverseConverter(Converter<PITUserData, PITUserModel> pitUserReverseConverter) {
        this.pitUserReverseConverter = pitUserReverseConverter;
    }

    public Converter<PITAddressData, PITAddressModel> getPitAddressReverseConverter() {
        return pitAddressReverseConverter;
    }

    public void setPitAddressReverseConverter(Converter<PITAddressData, PITAddressModel> pitAddressReverseConverter) {
        this.pitAddressReverseConverter = pitAddressReverseConverter;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}