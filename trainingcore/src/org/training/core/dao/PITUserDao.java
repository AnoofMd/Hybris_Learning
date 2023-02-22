package org.training.core.dao;



import de.hybris.platform.servicelayer.internal.dao.Dao;
import org.training.core.model.PITUserModel;

import java.util.List;

public interface PITUserDao extends Dao {
    List<PITUserModel> getAllPITUsers();

    PITUserModel getPitUserByCode(int id);
}
