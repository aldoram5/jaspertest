/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrgames.jaspertest;

import java.util.List;

/**
 *
 * @author aldo
 */
public class Report {
    private String reportNumber;
    private String departureTime;
    private String arrivalTime;
    private String po;
    private String onsiteWeather;
    private String clientName;
    private String supplierName;
    private String inspectionDate;
    private String inspectionLocation;
    private String factoryDepartureTime;
    
    private List<Test> summary;
    private List<QAssortmentRowEntity> assortmentRows;

    public Report() {
    }

    public Report(String reportNumber, String departureTime, String arrivalTime, String po, String onsiteWeather, String clientName, String supplierName, String inspectionDate, String inspectionLocation, String factoryDepartureTime) {
        this.reportNumber = reportNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.po = po;
        this.onsiteWeather = onsiteWeather;
        this.clientName = clientName;
        this.supplierName = supplierName;
        this.inspectionDate = inspectionDate;
        this.inspectionLocation = inspectionLocation;
        this.factoryDepartureTime = factoryDepartureTime;
    }

    public String getFactoryDepartureTime() {
        return factoryDepartureTime;
    }

    public void setFactoryDepartureTime(String factoryDepartureTime) {
        this.factoryDepartureTime = factoryDepartureTime;
    }

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }

    public String getOnsiteWeather() {
        return onsiteWeather;
    }

    public void setOnsiteWeather(String onsiteWeather) {
        this.onsiteWeather = onsiteWeather;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getInspectionLocation() {
        return inspectionLocation;
    }

    public void setInspectionLocation(String inspectionLocation) {
        this.inspectionLocation = inspectionLocation;
    }

    public List<Test> getSummary() {
        return summary;
    }

    public void setSummary(List<Test> summary) {
        this.summary = summary;
    }

    public List<QAssortmentRowEntity> getAssortmentRows() {
        return assortmentRows;
    }

    public void setAssortmentRows(List<QAssortmentRowEntity> assortmentRows) {
        this.assortmentRows = assortmentRows;
    }
    
    
}
