package org.training.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;
import de.hybris.training.core.model.PitUserEmailProcessModel;

public class PitUserEmailEvent extends AbstractEvent {
    private PitUserEmailProcessModel processModel;

    public PitUserEmailEvent(final PitUserEmailProcessModel processModel) {
        this.processModel=processModel;
    }

    public PitUserEmailProcessModel getProcessModel() {
        return processModel;
    }
}
