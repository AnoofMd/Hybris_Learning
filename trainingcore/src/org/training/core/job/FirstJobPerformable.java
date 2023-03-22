package org.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.util.logging.Logger;

public class FirstJobPerformable extends AbstractJobPerformable<CronJobModel> {
    private static final Logger LOG = Logger.getLogger(FirstJobPerformable.class.getName());
    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        LOG.info("Hello, Welcome !!");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
