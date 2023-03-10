package org.training.core.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.store.BaseStoreModel;


/**
 * Listener for "forgotten password" functionality event.
 */
public class HybrisTubeEmailEvent extends AbstractCommerceUserEvent
{

    private AbstractOrderModel cart;


    public HybrisTubeEmailEvent(final AbstractOrderModel cart, final BaseStoreModel baseStore, final BaseSiteModel site,
                                final CurrencyModel currency)
    {

        this.cart = cart;
        setBaseStore(baseStore);
        setSite(site);
        setCurrency(currency);
        setLanguage(cart.getUser().getSessionLanguage());

    }

    /**
     * @return the cart
     */
    public AbstractOrderModel getCart()
    {
        return cart;
    }

    /**
     * @param cart
     *           the cart to set
     */
    public void setCart(final AbstractOrderModel cart)
    {
        this.cart = cart;
    }




}