package org.training.core.service;



import org.training.core.model.PITUserModel;

import java.util.List;

public interface PITUserService {
    List<PITUserModel> getAllPITUsers();

    void createColumnUpdateBusinessProcess(PITUserModel pitUserModel);
    PITUserModel getPitUserByCode(int id);

}
