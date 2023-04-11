package org.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.training.core.model.PITUserModel;
import org.training.core.model.PitUserCronJobModel;
import org.training.core.service.PITUserService;

public class TrainingJobPerformable extends AbstractJobPerformable<PitUserCronJobModel> {

    private PITUserService pitUserService;

    @Override
    public PerformResult perform(PitUserCronJobModel pitUserCronJobModel) {
        PITUserModel pitUserModel=pitUserService.getPitUserByCode(1);
        System.out.println("User's Name is : "+pitUserModel.getName());
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    public TrainingJobPerformable(PITUserService pitUserService) {
        this.pitUserService = pitUserService;
    }

    public PITUserService getPitUserService() {
        return pitUserService;
    }

    public void setPitUserService(PITUserService pitUserService) {
        this.pitUserService = pitUserService;
    }
}
