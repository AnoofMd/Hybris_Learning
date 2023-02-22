package org.training.core.service.impl;

import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.dao.PITUserDao;

import org.training.core.model.ColumnUpdateProcessModel;
import org.training.core.model.PITUserModel;
import org.training.core.service.PITUserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

public class PITUserServiceImpl implements PITUserService {
    @Resource
    private PITUserDao pitUserDao;
    @Resource
    private BusinessProcessService businessProcessService;
    private static final Logger LOG = Logger.getLogger(String.valueOf(PITUserServiceImpl.class));

    private ModelService modelService;
    @Override
    public List<PITUserModel> getAllPITUsers() {
        return pitUserDao.getAllPITUsers();
    }
    public PITUserModel getPitUserByCode(int id){
        return pitUserDao.getPitUserByCode(id);
    }

    @Override
    public void createColumnUpdateBusinessProcess(PITUserModel pitUserModel) {
        final String fulfilmentProcessDefinitionName = "updatePitUser-process";
        final String processCode = fulfilmentProcessDefinitionName + "-" +pitUserModel.getId() + "-" +System.currentTimeMillis();
        final ColumnUpdateProcessModel businessProcessModel = getBusinessProcessService().createProcess(processCode, fulfilmentProcessDefinitionName);
        businessProcessModel.setPitUser(pitUserModel);
        //getModelService().save(businessProcessModel);
        getBusinessProcessService().startProcess(businessProcessModel);
        LOG.info(String.format("Started process %s", processCode));
    }

    public PITUserDao getPitUserDao() {
        return pitUserDao;
    }

    public void setPitUserDao(PITUserDao pitUserDao) {
        this.pitUserDao = pitUserDao;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}
