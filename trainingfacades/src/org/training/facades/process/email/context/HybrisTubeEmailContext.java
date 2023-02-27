package org.training.facades.process.email.context;

import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.training.core.model.HybrisTubeEmailProcessModel;

import org.springframework.beans.factory.annotation.Required;


/**
 * Velocity context for a customer email.
 */
public class HybrisTubeEmailContext extends AbstractEmailContext<HybrisTubeEmailProcessModel>
{
    private Converter<UserModel, CustomerData> customerConverter;
    private CustomerData customerData;

    @Override
    public void init(final HybrisTubeEmailProcessModel hybrisTubeEmailProcessModel, final EmailPageModel emailPageModel)
    {
        super.init(hybrisTubeEmailProcessModel, emailPageModel);
        put(EMAIL, getCustomerEmailResolutionService().getEmailForCustomer(getCustomer(hybrisTubeEmailProcessModel)));
        put(DISPLAY_NAME, getCustomer(hybrisTubeEmailProcessModel).getDisplayName());
    }

    @Override
    protected BaseSiteModel getSite(final HybrisTubeEmailProcessModel storeFrontCustomerProcessModel)
    {
        return storeFrontCustomerProcessModel.getCart().getSite();
    }

    @Override
    protected CustomerModel getCustomer(final HybrisTubeEmailProcessModel storeFrontCustomerProcessModel)
    {
        return (CustomerModel) storeFrontCustomerProcessModel.getCart().getUser();
    }

    protected Converter<UserModel, CustomerData> getCustomerConverter()
    {
        return customerConverter;
    }

    @Required
    public void setCustomerConverter(final Converter<UserModel, CustomerData> customerConverter)
    {
        this.customerConverter = customerConverter;
    }

    public CustomerData getCustomer()
    {
        return customerData;
    }

    @Override
    protected LanguageModel getEmailLanguage(final HybrisTubeEmailProcessModel businessProcessModel)
    {
        return businessProcessModel.getCart().getUser().getSessionLanguage();
    }
}