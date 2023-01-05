package org.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.training.core.model.HelloWorldCronJobModel;

import java.util.logging.Logger;

public class MyJobPerformable extends AbstractJobPerformable<HelloWorldCronJobModel>
{
    private static final Logger LOG = Logger.getLogger(MyJobPerformable.class.getName());

    @Override
    public PerformResult perform(final HelloWorldCronJobModel cronJobModel)
    {
        LOG.info("**********************************");
        LOG.info("Greeting from MyJobPerformable!!!");
        LOG.info("**********************************");

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}