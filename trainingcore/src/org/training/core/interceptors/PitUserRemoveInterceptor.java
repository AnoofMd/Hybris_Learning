package org.training.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;
import org.training.core.model.PITUserModel;

public class PitUserRemoveInterceptor implements RemoveInterceptor<PITUserModel> {

    @Override
    public void onRemove(PITUserModel pitUserModel, InterceptorContext interceptorContext) throws InterceptorException {
        System.out.println("Remove Successful !");
    }
}
