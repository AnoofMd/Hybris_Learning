package sample.webservice.v2.controller;


import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdParam;

import javax.annotation.Resource;

import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.annotations.ApiParam;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import org.training.facades.pits.PITUserFacade;
import org.training.facades.product.data.PITUserData;
import org.training.facades.product.data.PITUserDataListWSDTO;
import sample.webservice.queues.data.PITUserDataList;


@Controller

@RequestMapping(value = "/{baseSiteId}/pit")

@Api(tags = "PIT User")
public class PITUserController extends BaseCommerceController {

    private static final Logger LOGGER = Logger.getLogger(PITUserController.class);

    @Resource(name = "pitUserFacade")

    private PITUserFacade pitUserFacade;

    @RequestMapping(value = "/getallpituser", method = RequestMethod.GET)
    @ResponseBody
    @ApiBaseSiteIdParam
    public PITUserDataListWSDTO getAllPITUser(@ApiParam(value="Response Configuration. This is the list of fields that should be returned in the response body",allowableValues="BASIC,DEFAULT,FULL")
                                                  @RequestParam(defaultValue=DEFAULT_FIELD_SET)
                                                  final String fields) {
        final PITUserDataList pitUserDataList = new PITUserDataList();
        pitUserDataList.setPitUser(pitUserFacade.getAllPITUsers());
        return getDataMapper().map(pitUserDataList, PITUserDataListWSDTO.class, fields);

    }
    @RequestMapping(value = "/savePITUser", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
    public void savePITUser(@RequestBody PITUserData pitUserData){
        pitUserFacade.savePITUser(pitUserData);
    }

    @RequestMapping(value = "/updatePITUser/{id}", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
    public void updatePitUser(@PathVariable final int id){
        pitUserFacade.updatePitUser(id);
    }

}
