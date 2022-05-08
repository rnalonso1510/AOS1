package io.swagger.api;

import io.swagger.model.Factura;
import io.swagger.model.HTTPProblem;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-08T20:36:10.229245+02:00[Europe/Madrid]")
@RestController
public class FacturasApiController implements FacturasApi {

    private static final Logger log = LoggerFactory.getLogger(FacturasApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FacturasApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> apiFacturasCget() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{\n  \"facturas\" : [ {\n    \"Conceptos\" : [ \"{}\", \"{}\" ],\n    \"facturaId\" : 0,\n    \"idCliente\" : 6,\n    \"fechaEmision\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"links\" : {\n      \"clientes\" : \"{}\"\n    },\n    \"importe\" : 1.4658129805029452\n  }, {\n    \"Conceptos\" : [ \"{}\", \"{}\" ],\n    \"facturaId\" : 0,\n    \"idCliente\" : 6,\n    \"fechaEmision\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"links\" : {\n      \"clientes\" : \"{}\"\n    },\n    \"importe\" : 1.4658129805029452\n  } ]\n}", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiFacturasCoptions() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiFacturasDelete(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "**ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Factura> apiFacturasGet(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "**ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Factura>(objectMapper.readValue("{\n  \"Conceptos\" : [ \"{}\", \"{}\" ],\n  \"facturaId\" : 0,\n  \"idCliente\" : 6,\n  \"fechaEmision\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"links\" : {\n    \"clientes\" : \"{}\"\n  },\n  \"importe\" : 1.4658129805029452\n}", Factura.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Factura>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Factura>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiFacturasOptionsId(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "**ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> apiFacturasPost() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Factura> apiFacturasPut(@Pattern(regexp="^\\d+$") @Parameter(in = ParameterIn.PATH, description = "**ID**.   ID de la factura.   La API responde con la factura. type: number format: uuid", required=true, schema=@Schema()) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Factura>(objectMapper.readValue("{\n  \"Conceptos\" : [ \"{}\", \"{}\" ],\n  \"facturaId\" : 0,\n  \"idCliente\" : 6,\n  \"fechaEmision\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"links\" : {\n    \"clientes\" : \"{}\"\n  },\n  \"importe\" : 1.4658129805029452\n}", Factura.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Factura>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Factura>(HttpStatus.NOT_IMPLEMENTED);
    }

}
