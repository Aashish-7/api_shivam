package com.coforge.api.exception.dto;


import com.coforge.api.exception.Abstract4xxException;

public class ResponseStatusDto {

    String responseStatus;

    Object data;

    String databaseSave;

    String queryType;

    Error error;

    public ResponseStatusDto() {
    }

    public ResponseStatusDto(Abstract4xxException exception){
        this.responseStatus = exception.getResponseStatus();
        this.data = exception.getData();
        this.databaseSave = exception.getDatabaseSave();
        this.queryType = exception.getQueryType();
        this.error = exception.getError();
    }

    public ResponseStatusDto(String responseStatus, Object data, String databaseSave, String queryType, Error error) {
        this.responseStatus = responseStatus;
        this.data = data;
        this.databaseSave = databaseSave;
        this.queryType = queryType;
        this.error = error;
    }

//    public ResponseStatusDto(BadRequest400Exception exception) {
//        this.httpStatus = httpStatus;
//        this.responseStatus = responseStatus;
//        this.data = data;
//        this.databaseSave = databaseSave;
//        this.queryType = queryType;
//        this.errorCode = errorCode;
//        this.errorDescription = errorDescription;
//    }
    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getDatabaseSave() {
        return databaseSave;
    }

    public void setDatabaseSave(String databaseSave) {
        this.databaseSave = databaseSave;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ResponseStatusDto{" +
                ", responseStatus='" + this.responseStatus + '\'' +
                ", data=" + data +
                ", databaseSave='" + databaseSave + '\'' +
                ", queryType='" + queryType + '\'' +
                ", error=" + error +
                '}';
    }
}
