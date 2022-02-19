package com.food_services_backend.codegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AddressRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-19T16:22:16.652181-05:00[America/Detroit]")

public class AddressRequest   {
  @JsonProperty("formattedAddress")
  private String formattedAddress;

  public AddressRequest formattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  /**
   * Get formattedAddress
   * @return formattedAddress
  */
  @ApiModelProperty(value = "")


  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressRequest addressRequest = (AddressRequest) o;
    return Objects.equals(this.formattedAddress, addressRequest.formattedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formattedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressRequest {\n");
    
    sb.append("    formattedAddress: ").append(toIndentedString(formattedAddress)).append("\n");
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

