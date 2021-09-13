/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-13T10:32:00.178516900+05:30[Asia/Calcutta]")
@Validated
public interface UserApi {

    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/user",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createUser(@Parameter(in = ParameterIn.DEFAULT, description = "Created user object", required=true, schema=@Schema()) @Valid @RequestBody User body);


    @Operation(summary = "Creates list of users with given input array", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/user/createWithArray",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createUsersWithArrayInput(@Parameter(in = ParameterIn.DEFAULT, description = "List of user object", required=true, schema=@Schema()) @Valid @RequestBody List<User> body);


    @Operation(summary = "Creates list of users with given input array", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/user/createWithList",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> createUsersWithListInput(@Parameter(in = ParameterIn.DEFAULT, description = "List of user object", required=true, schema=@Schema()) @Valid @RequestBody List<User> body);


    @Operation(summary = "Delete user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be deleted", required=true, schema=@Schema()) @PathVariable("username") String username);


    @Operation(summary = "Get user by user name", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserByName(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be fetched. Use user1 for testing. ", required=true, schema=@Schema()) @PathVariable("username") String username);


    @Operation(summary = "Logs user into the system", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid username/password supplied") })
    @RequestMapping(value = "/user/login",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> loginUser(@NotNull @Parameter(in = ParameterIn.QUERY, description = "The user name for login" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "username", required = true) String username, @NotNull @Parameter(in = ParameterIn.QUERY, description = "The password for login in clear text" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "password", required = true) String password);


    @Operation(summary = "Logs out current logged in user session", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    @RequestMapping(value = "/user/logout",
        method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser();


    @Operation(summary = "Updated user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid user supplied"),
        
        @ApiResponse(responseCode = "404", description = "User not found") })
    @RequestMapping(value = "/user/{username}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.PATH, description = "name that need to be updated", required=true, schema=@Schema()) @PathVariable("username") String username, @Parameter(in = ParameterIn.DEFAULT, description = "Updated user object", required=true, schema=@Schema()) @Valid @RequestBody User body);

}

