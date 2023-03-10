/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.training.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import org.training.core.model.PITUserModel;
import org.training.facades.product.data.PITUserData;


public class PITUserPopulator implements Populator<PITUserModel, PITUserData> {
    @Override
    public void populate(final PITUserModel source, final PITUserData target)
            throws ConversionException {

        target.setId(source.getId());
        target.setName(source.getName());
        target.setJob_title(source.getJob_title());
        target.setUser_since(source.getUser_since());
    }

}
