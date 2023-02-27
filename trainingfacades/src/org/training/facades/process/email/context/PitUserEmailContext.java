package org.training.facades.process.email.context;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.training.core.model.PitUserEmailProcessModel;

public class PitUserEmailContext extends AbstractEmailContext<PitUserEmailProcessModel>{

    public void init(final PitUserEmailProcessModel processModel, final EmailPageModel emailPageModel){
        super.init(processModel, emailPageModel);
        put(EMAIL,"anoofmhmda@gmail.com");
        put(DISPLAY_NAME, processModel.getPitUser().getName());
    }

    @Override
    protected BaseSiteModel getSite(PitUserEmailProcessModel businessProcessModel) {
        return businessProcessModel.getSite();
    }

    @Override
    protected CustomerModel getCustomer(PitUserEmailProcessModel businessProcessModel) {
        return businessProcessModel.getCustomer();
    }

    @Override
    protected LanguageModel getEmailLanguage(PitUserEmailProcessModel businessProcessModel) {
        return businessProcessModel.getLanguage();
    }
}
