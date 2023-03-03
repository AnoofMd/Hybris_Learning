package org.training.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.training.core.model.PITAddressModel;

public class PitAddressValidateInterceptor implements ValidateInterceptor<PITAddressModel> {

    @Override
    public void onValidate(PITAddressModel pitAddressModel, InterceptorContext interceptorContext) throws InterceptorException {
        System.out.println("Validation Successful !");
    }
}
