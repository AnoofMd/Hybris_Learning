package org.training.fulfilmentprocess.actions.pits;

import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import org.training.core.model.ColumnUpdateProcessModel;
import org.training.core.model.PITUserModel;

import java.util.logging.Logger;

public class ColumnUpdateAction extends AbstractSimpleDecisionAction<ColumnUpdateProcessModel> {
    private static final Logger LOG = Logger.getLogger(String.valueOf(ColumnUpdateAction.class));

    public Transition executeAction(final ColumnUpdateProcessModel processModel){
        final PITUserModel pitUserModel=processModel.getPitUser();
        if (processModel==null){
            LOG.info("Missing details");
            return Transition.NOK;
        }
        else {
            pitUserModel.setJob_title("Engineer");
            getModelService().save(pitUserModel);
            LOG.info("Updated Successfully");
            return Transition.OK;
        }
    }


}
