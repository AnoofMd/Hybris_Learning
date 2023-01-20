package org.training.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.dao.PITUserDao;
import org.training.core.model.PITUserModel;


import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class PITUserDaoImpl extends AbstractItemDao implements PITUserDao {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(PITUserDaoImpl.class));
    private static final String GET_ALL_QUERY="SELECT {" + PITUserModel.PK + "} FROM {" + PITUserModel._TYPECODE + "}";
    @Override
    public List<PITUserModel> getAllPITUsers() {
        LOGGER.info(String.valueOf(getFlexibleSearchService().search(GET_ALL_QUERY).getClass()));
        final SearchResult<PITUserModel> pitUserModelSearchResult=getFlexibleSearchService().search(GET_ALL_QUERY);
        return pitUserModelSearchResult.getResult()==null?Collections.emptyList():pitUserModelSearchResult.getResult();
       /* searchQuery.setResultClassList(Collections.singletonList(PITUsersModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        List<PITUsersModel> userList = searchResult.getResult();
        return userList;*/
    }
}
