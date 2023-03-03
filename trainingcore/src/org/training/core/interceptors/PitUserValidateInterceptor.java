package org.training.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.training.core.model.PITUserModel;

public class PitUserValidateInterceptor implements ValidateInterceptor<PITUserModel> {

    @Override
    public void onValidate(PITUserModel pitUserModel, InterceptorContext interceptorContext) throws InterceptorException {
        System.out.println("Validation Successful !");
    }
}
