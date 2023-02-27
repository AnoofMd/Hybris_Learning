package org.training.core.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.training.core.model.PitUserEmailProcessModel;
import org.training.core.dao.PITUserDao;

import org.training.core.event.PitUserEmailEvent;
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
    private UserService userService;
    @Resource
    private BusinessProcessService businessProcessService;
    private static final Logger LOG = Logger.getLogger(String.valueOf(PITUserServiceImpl.class));

    private ModelService modelService;
    private BaseSiteService baseSiteService;
    private EventService eventService;
    private CommonI18NService commonI18NService;
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

    public void sendEmailToPitUser(PITUserModel pitUserModel){
        PitUserEmailProcessModel pitUserEmailProcessModel=new PitUserEmailProcessModel();
        pitUserEmailProcessModel.setPitUser(pitUserModel);
        pitUserEmailProcessModel.setCustomer((CustomerModel) userService.getCurrentUser());
        pitUserEmailProcessModel.setSite(getBaseSiteService().getCurrentBaseSite());
        pitUserEmailProcessModel.setLanguage(getCommonI18NService().getLanguage("en"));
        PitUserEmailEvent pitUserEmailEvent=new PitUserEmailEvent(pitUserEmailProcessModel);
        getEventService().publishEvent(pitUserEmailEvent);
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

    public EventService getEventService() {
        return eventService;
    }

    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public BaseSiteService getBaseSiteService() {
        return baseSiteService;
    }

    public void setBaseSiteService(BaseSiteService baseSiteService) {
        this.baseSiteService = baseSiteService;
    }

    public CommonI18NService getCommonI18NService() {
        return commonI18NService;
    }

    public void setCommonI18NService(CommonI18NService commonI18NService) {
        this.commonI18NService = commonI18NService;
    }
}
