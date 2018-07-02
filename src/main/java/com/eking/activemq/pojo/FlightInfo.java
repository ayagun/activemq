package com.eking.activemq.pojo;

import java.util.Date;

public class FlightInfo {
    private Integer id;

    private Date scheDate;

    private String flightNo;

    private String carrierFlightNo;

    private String flightFrom;

    private String flightTo;

    private String stops;

    private String model;

    private Date scheTime;

    private String flightStatus;

    private String dataSource;

    private String recordStatus;

    private Date createTime;

    private String createPerson;

    private Date updateTime;

    private String updatePerson;

    private Integer isManualEdit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getScheDate() {
        return scheDate;
    }

    public void setScheDate(Date scheDate) {
        this.scheDate = scheDate;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getCarrierFlightNo() {
        return carrierFlightNo;
    }

    public void setCarrierFlightNo(String carrierFlightNo) {
        this.carrierFlightNo = carrierFlightNo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public void setFlightTo(String flightTo) {
        this.flightTo = flightTo;
    }

    public String getStops() {
        return stops;
    }

    public void setStops(String stops) {
        this.stops = stops;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getScheTime() {
        return scheTime;
    }

    public void setScheTime(Date scheTime) {
        this.scheTime = scheTime;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson;
    }

    public Integer getIsManualEdit() {
        return isManualEdit;
    }

    public void setIsManualEdit(Integer isManualEdit) {
        this.isManualEdit = isManualEdit;
    }
}