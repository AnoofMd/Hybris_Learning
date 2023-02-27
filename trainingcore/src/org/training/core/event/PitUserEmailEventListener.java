package org.training.core.event;

import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.training.core.model.PitUserEmailProcessModel;

public class PitUserEmailEventListener extends AbstractEventListener<PitUserEmailEvent> {

    private ModelService modelService;
    private BusinessProcessService businessProcessService;


    @Override
    protected void onEvent(PitUserEmailEvent pitUserEmailEvent) {
        final PitUserEmailProcessModel processModel = getBusinessProcessService()
                .createProcess("pitUserEmail-" + pitUserEmailEvent.getProcessModel().getPitUser().getId() + "-" + System.currentTimeMillis(),
                        "pitUserEmailProcess");
        processModel.setPitUser(pitUserEmailEvent.getProcessModel().getPitUser());
        processModel.setSite(pitUserEmailEvent.getProcessModel().getSite());
        processModel.setLanguage(pitUserEmailEvent.getProcessModel().getLanguage());
        processModel.setCustomer(pitUserEmailEvent.getProcessModel().getCustomer());
        getModelService().save(processModel);
        getBusinessProcessService().startProcess(processModel);
    }


    public ModelService getModelService() {
        return modelService;
    }

    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public BusinessProcessService getBusinessProcessService() {
        return businessProcessService;
    }

    public void setBusinessProcessService(BusinessProcessService businessProcessService) {
        this.businessProcessService = businessProcessService;
    }

}
