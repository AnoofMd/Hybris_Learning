package org.training.facades.pits;

import de.hybris.platform.commercefacades.product.ProductFacade;

public interface CustomProductFacade extends ProductFacade {
    void saveCompanyName(String productCode, String companyName);
}
