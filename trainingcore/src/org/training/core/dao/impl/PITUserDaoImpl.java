package org.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.dao.PITUserDao;
import org.training.core.model.PITUserModel;
import org.training.core.service.impl.PITUserServiceImpl;
import org.training.facades.product.data.PITUserData;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class PITUserDaoImpl extends AbstractItemDao implements PITUserDao {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PITUserDaoImpl.class));
    private static final String GET_ALL_QUERY = "SELECT {" + PITUserModel.PK + "} FROM {" + PITUserModel._TYPECODE + "}";

    private static final String GET_PITUSER = "SELECT {" + PITUserModel.PK + "} FROM {" + PITUserModel._TYPECODE + "} WHERE {" + PITUserModel.ID + "} = ?id";

    @Override
    public List<PITUserModel> getAllPITUsers() {
        LOGGER.info(String.valueOf(getFlexibleSearchService().search(GET_ALL_QUERY).getClass()));
        final SearchResult<PITUserModel> pitUserModelSearchResult = getFlexibleSearchService().search(GET_ALL_QUERY);
        return pitUserModelSearchResult.getResult() == null ? Collections.emptyList() : pitUserModelSearchResult.getResult();

    }

    @Override
    public PITUserModel getPitUserByCode(int id) {
        final Map<String, Integer> queryParams = new HashMap<String, Integer>();
        queryParams.put("id", id);
        final SearchResult<PITUserModel> searchResult = getFlexibleSearchService().search(GET_PITUSER, queryParams);
        return searchResult.getResult().isEmpty() ? null : searchResult.getResult().get(0);
    }
}
