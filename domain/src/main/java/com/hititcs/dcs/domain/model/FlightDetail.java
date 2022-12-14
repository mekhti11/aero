/*
 * Airport REST API
 * Airport Mobile Middleware
 *
 * OpenAPI spec version: v1
 * Contact: onur.yardimci@pinsoft.ist
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hititcs.dcs.domain.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * FlightDetail
 */

public class FlightDetail {

  @SerializedName("aircraftInfo")
  private AircraftInfo aircraftInfo = null;

  @SerializedName("available")
  private List<KeyValue> available = null;

  @SerializedName("booked")
  private List<KeyValue> booked = null;

  @SerializedName("checkedIn")
  private List<KeyValue> checkedIn = null;

  @SerializedName("flightSummary")
  private FlightSummary flightSummary = null;

  @SerializedName("portInfo")
  private PortInfo portInfo = null;

  @SerializedName("standBy")
  private List<KeyValue> standBy = null;

  @SerializedName("staff")
  private List<KeyValue> staff = null;

  @SerializedName("capacity")
  private List<KeyValue> capacity = null;

  @SerializedName("boarded")
  private List<KeyValue> boarded = null;

  @SerializedName("unboarded")
  private List<KeyValue> unboarded = null;

  public FlightDetail aircraftInfo(AircraftInfo aircraftInfo) {
    this.aircraftInfo = aircraftInfo;
    return this;
  }


  public AircraftInfo getAircraftInfo() {
    return aircraftInfo;
  }

  public void setAircraftInfo(AircraftInfo aircraftInfo) {
    this.aircraftInfo = aircraftInfo;
  }

  public FlightDetail available(List<KeyValue> available) {
    this.available = available;
    return this;
  }

  public List<KeyValue> getAvailable() {
    return available;
  }

  public void setAvailable(List<KeyValue> available) {
    this.available = available;
  }

  public FlightDetail booked(List<KeyValue> booked) {
    this.booked = booked;
    return this;
  }

  public List<KeyValue> getBooked() {
    return booked;
  }

  public void setBooked(List<KeyValue> booked) {
    this.booked = booked;
  }

  public FlightDetail checkedIn(List<KeyValue> checkedIn) {
    this.checkedIn = checkedIn;
    return this;
  }

  public List<KeyValue> getCheckedIn() {
    return checkedIn;
  }

  public void setCheckedIn(List<KeyValue> checkedIn) {
    this.checkedIn = checkedIn;
  }

  public FlightDetail flightSummary(FlightSummary flightSummary) {
    this.flightSummary = flightSummary;
    return this;
  }

  public FlightSummary getFlightSummary() {
    return flightSummary;
  }

  public void setFlightSummary(FlightSummary flightSummary) {
    this.flightSummary = flightSummary;
  }

  public FlightDetail portInfo(PortInfo portInfo) {
    this.portInfo = portInfo;
    return this;
  }

  public PortInfo getPortInfo() {
    return portInfo;
  }

  public void setPortInfo(PortInfo portInfo) {
    this.portInfo = portInfo;
  }

  public FlightDetail standBy(List<KeyValue> standBy) {
    this.standBy = standBy;
    return this;
  }

  public List<KeyValue> getStandBy() {
    return standBy;
  }

  public void setStandBy(List<KeyValue> standBy) {
    this.standBy = standBy;
  }

  public List<KeyValue> getStaff() {
    return staff;
  }

  public void setStaff(List<KeyValue> staff) {
    this.staff = staff;
  }

  public List<KeyValue> getCapacity() {
    return capacity;
  }

  public void setCapacity(List<KeyValue> capacity) {
    this.capacity = capacity;
  }

  public List<KeyValue> getBoarded() {
    return boarded;
  }

  public void setBoarded(List<KeyValue> boarded) {
    this.boarded = boarded;
  }

  public List<KeyValue> getUnboarded() {
    return unboarded;
  }

  public void setUnboarded(List<KeyValue> unboarded) {
    this.unboarded = unboarded;
  }
}

