package org.training.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import org.training.core.model.PITAddressModel;
import org.training.core.model.PITUserModel;
import org.training.core.service.PITUserService;

import javax.annotation.Resource;
import java.util.Optional;

public class PitAddressValidateInterceptor implements ValidateInterceptor<PITAddressModel> {
    @Resource
    PITUserService pitUserService;

    @Override
    public void onValidate(PITAddressModel pitAddressModel, InterceptorContext interceptorContext) throws InterceptorException {

        try {
            Optional<PITUserModel> pitUserByCode = Optional.of(pitUserService.getPitUserByCode(pitAddressModel.getUser().getId()));
            if (pitUserByCode.isPresent())
            {
            System.out.println("Validate Successful !");
            }
        }
        catch (Exception interceptorException){
            System.out.println("PITUser Not Found !");
        }

    }

    public PITUserService getPitUserService() {
        return pitUserService;
    }

    public void setPitUserService(PITUserService pitUserService) {
        this.pitUserService = pitUserService;
    }
}
