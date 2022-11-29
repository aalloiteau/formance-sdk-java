/*
 * Formance Stack API
 * Open, modular foundation for unique payments flows  # Introduction This API is documented in **OpenAPI format**.  # Authentication Formance Stack offers one forms of authentication:   - OAuth2 OAuth2 - an open protocol to allow secure authorization in a simple and standard method from web, mobile and desktop applications. <SecurityDefinitions /> 
 *
 * The version of the OpenAPI document: v0.2.2
 * Contact: support@formance.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.formance.formance.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Stats
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-29T21:27:45.106116Z[Etc/UTC]")
public class Stats {
  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private Integer accounts;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private Integer transactions;

  public Stats() {
  }

  public Stats accounts(Integer accounts) {
    
    this.accounts = accounts;
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nonnull

  public Integer getAccounts() {
    return accounts;
  }


  public void setAccounts(Integer accounts) {
    this.accounts = accounts;
  }


  public Stats transactions(Integer transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * Get transactions
   * @return transactions
  **/
  @javax.annotation.Nonnull

  public Integer getTransactions() {
    return transactions;
  }


  public void setTransactions(Integer transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stats stats = (Stats) o;
    return Objects.equals(this.accounts, stats.accounts) &&
        Objects.equals(this.transactions, stats.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accounts, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stats {\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

