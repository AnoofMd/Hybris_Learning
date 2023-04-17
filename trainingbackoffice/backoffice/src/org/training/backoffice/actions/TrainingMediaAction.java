package org.training.backoffice.actions;

import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;
import com.hybris.cockpitng.engine.impl.AbstractComponentWidgetAdapterAware;
import de.hybris.platform.core.model.media.MediaModel;
import org.zkoss.zul.Messagebox;


public class TrainingMediaAction extends AbstractComponentWidgetAdapterAware implements CockpitAction<MediaModel, Object> {
    public static String finalUrl=" ";
    String title="Media URL";
    String icon="z-messagebox-icon z-messagebox-information";
    @Override
    public ActionResult perform(ActionContext<MediaModel> ctx) {
        String urlForMedia=ctx.getData().getURL();
        finalUrl="https://localhost:9002/"+urlForMedia;
        Messagebox.show(finalUrl, title, 1, icon);
        return new ActionResult<Object>("success", finalUrl);
    }
}
