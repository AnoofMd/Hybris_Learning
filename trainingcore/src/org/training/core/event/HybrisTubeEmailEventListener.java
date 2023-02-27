package org.training.core.event;

import de.hybris.platform.acceleratorservices.site.AbstractAcceleratorSiteEventListener;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;
import de.hybris.training.core.model.HybrisTubeEmailProcessModel;

import org.springframework.beans.factory.annotation.Required;


/**
 * Listener for Gold Customer cart Functionality event.
 */
public class HybrisTubeEmailEventListener extends AbstractAcceleratorSiteEventListener<HybrisTubeEmailEvent>
{

    private ModelService modelService;
    private BusinessProcessService businessProcessService;

    protected BusinessProcessService getBusinessProcessService()
    {
        return businessProcessService;
    }

    @Required
    public void setBusinessProcessService(final BusinessProcessService businessProcessService)
    {
        this.businessProcessService = businessProcessService;
    }

    /**
     * @return the modelService
     */
    protected ModelService getModelService()
    {
        return modelService;
    }

    /**
     * @param modelService
     *           the modelService to set
     */
    @Required
    public void setModelService(final ModelService modelService)
    {
        this.modelService = modelService;
    }

    @Override
    protected void onSiteEvent(final HybrisTubeEmailEvent event)
    {
        final HybrisTubeEmailProcessModel hybrisTubeEmailProcessModel = (HybrisTubeEmailProcessModel) getBusinessProcessService()
                .createProcess("hybrisTubeEmail-" + event.getCart().getCode() + "-" + System.currentTimeMillis(),
                        "hybrisTubeEmailProcess");

        hybrisTubeEmailProcessModel.setCart(event.getCart());
        hybrisTubeEmailProcessModel.setCurrency(event.getCurrency());
        hybrisTubeEmailProcessModel.setStore(event.getBaseStore());
        hybrisTubeEmailProcessModel.setSite(event.getSite());
        hybrisTubeEmailProcessModel.setLanguage(event.getLanguage());
        getModelService().save(hybrisTubeEmailProcessModel);
        getBusinessProcessService().startProcess(hybrisTubeEmailProcessModel);
    }

    @Override
    protected SiteChannel getSiteChannelForEvent(final HybrisTubeEmailEvent event)
    {
        final BaseSiteModel site = event.getSite();
        ServicesUtil.validateParameterNotNullStandardMessage("event.site", site);
        return site.getChannel();
    }
}