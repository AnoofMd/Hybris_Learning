package org.training.facades.pits.impl;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.commercefacades.product.impl.DefaultProductFacade;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.facades.pits.CustomProductFacade;

public class DefaultCustomProductFacade extends DefaultProductFacade implements CustomProductFacade {
    private ProductService productService;
    private ModelService modelService;
    private CatalogVersionService catalogVersionService;

    @Override
    public ProductService getProductService() {
        return productService;
    }

    @Override
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ModelService getModelService() {
        return modelService;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }

    public CatalogVersionService getCatalogVersionService() {
        return catalogVersionService;
    }

    public void setCatalogVersionService(CatalogVersionService catalogVersionService) {
        this.catalogVersionService = catalogVersionService;
    }

    public void saveCompanyName(String productCode, String companyName){
        CatalogVersionModel catalogVersionModel=catalogVersionService.getCatalogVersion("electronicsProductCatalog","Online");
        var productModel=productService.getProductForCode(catalogVersionModel,productCode);
        productModel.setCompanyName(companyName);
        modelService.save(productModel);
    }
}
