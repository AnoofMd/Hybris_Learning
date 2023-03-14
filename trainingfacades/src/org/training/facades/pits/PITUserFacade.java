package org.training.facades.pits;


import org.training.facades.product.data.PITAddressData;
import org.training.facades.product.data.PITUserData;
import org.training.facades.product.data.ResponseData;

import java.util.List;

public interface PITUserFacade {
    List<PITUserData> getAllPITUsers();
    void savePITUser(PITUserData pitUserData);

    void updatePitUser(int id);
    void sendEmailToPitUser(int id);
    void deletePitUserById(int id);

    void savePitAddress(PITAddressData pitAddressData);
    ResponseData getResponse();
}
