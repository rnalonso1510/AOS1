package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.SchemasTrabajoYml;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contenido de una factura
 */
@Schema(description = "Contenido de una factura")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-08T20:36:10.229245+02:00[Europe/Madrid]")


public class Factura   {
  @JsonProperty("facturaId")
  private Integer facturaId = null;

  @JsonProperty("idCliente")
  private Integer idCliente = null;

  @JsonProperty("Conceptos")
  @Valid
  private List<SchemasTrabajoYml> conceptos = null;

  @JsonProperty("fechaEmision")
  private OffsetDateTime fechaEmision = null;

  @JsonProperty("importe")
  private Double importe = null;

  @JsonProperty("links")
  private Object links = null;

  public Factura facturaId(Integer facturaId) {
    this.facturaId = facturaId;
    return this;
  }

  /**
   * Identificador de la factura
   * @return facturaId
   **/
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "Identificador de la factura")
  
    public Integer getFacturaId() {
    return facturaId;
  }

  public void setFacturaId(Integer facturaId) {
    this.facturaId = facturaId;
  }

  public Factura idCliente(Integer idCliente) {
    this.idCliente = idCliente;
    return this;
  }

  /**
   * Identificador del cliente a facturar
   * @return idCliente
   **/
  @Schema(description = "Identificador del cliente a facturar")
  
    public Integer getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(Integer idCliente) {
    this.idCliente = idCliente;
  }

  public Factura conceptos(List<SchemasTrabajoYml> conceptos) {
    this.conceptos = conceptos;
    return this;
  }

  public Factura addConceptosItem(SchemasTrabajoYml conceptosItem) {
    if (this.conceptos == null) {
      this.conceptos = new ArrayList<SchemasTrabajoYml>();
    }
    this.conceptos.add(conceptosItem);
    return this;
  }

  /**
   * Trabajos pertenecientes a la factura
   * @return conceptos
   **/
  @Schema(description = "Trabajos pertenecientes a la factura")
      @Valid
    public List<SchemasTrabajoYml> getConceptos() {
    return conceptos;
  }

  public void setConceptos(List<SchemasTrabajoYml> conceptos) {
    this.conceptos = conceptos;
  }

  public Factura fechaEmision(OffsetDateTime fechaEmision) {
    this.fechaEmision = fechaEmision;
    return this;
  }

  /**
   * Fecha de emisión de la factura
   * @return fechaEmision
   **/
  @Schema(description = "Fecha de emisión de la factura")
  
    @Valid
    public OffsetDateTime getFechaEmision() {
    return fechaEmision;
  }

  public void setFechaEmision(OffsetDateTime fechaEmision) {
    this.fechaEmision = fechaEmision;
  }

  public Factura importe(Double importe) {
    this.importe = importe;
    return this;
  }

  /**
   * Importe total de la factura. Suma de todos los importes.
   * @return importe
   **/
  @Schema(description = "Importe total de la factura. Suma de todos los importes.")
  
    public Double getImporte() {
    return importe;
  }

  public void setImporte(Double importe) {
    this.importe = importe;
  }

  public Factura links(Object links) {
    this.links = links;
    return this;
  }

  /**
   * Enlaces de relación
   * @return links
   **/
  @Schema(description = "Enlaces de relación")
  
    public Object getLinks() {
    return links;
  }

  public void setLinks(Object links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Factura factura = (Factura) o;
    return Objects.equals(this.facturaId, factura.facturaId) &&
        Objects.equals(this.idCliente, factura.idCliente) &&
        Objects.equals(this.conceptos, factura.conceptos) &&
        Objects.equals(this.fechaEmision, factura.fechaEmision) &&
        Objects.equals(this.importe, factura.importe) &&
        Objects.equals(this.links, factura.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facturaId, idCliente, conceptos, fechaEmision, importe, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Factura {\n");
    
    sb.append("    facturaId: ").append(toIndentedString(facturaId)).append("\n");
    sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
    sb.append("    conceptos: ").append(toIndentedString(conceptos)).append("\n");
    sb.append("    fechaEmision: ").append(toIndentedString(fechaEmision)).append("\n");
    sb.append("    importe: ").append(toIndentedString(importe)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
