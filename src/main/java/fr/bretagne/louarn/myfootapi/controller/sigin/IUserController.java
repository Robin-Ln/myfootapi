package fr.bretagne.louarn.myfootapi.controller.sigin;

import fr.bretagne.louarn.myfootapi.dto.sigin.request.SiginRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

@Api("Controller d'enregistrement")
public interface IUserController {

    @ApiOperation(value = "inscription")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "inscription ok")
    })
    ResponseEntity<Void> sigin(SiginRequest request);

}
