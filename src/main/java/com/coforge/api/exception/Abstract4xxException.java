package com.coforge.api.exception;

import com.coforge.api.exception.dto.Error;
import org.springframework.http.HttpStatus;

public abstract class Abstract4xxException extends RuntimeException {
    private String responseStatus;

    private Object data;

    private String databaseSave;

    private String queryType;

    Error error;

    public Abstract4xxException(String responseStatus, Object data, String databaseSave, String queryType, Error error) {
        this.responseStatus = responseStatus;
        this.data = data;
        this.databaseSave = databaseSave;
        this.queryType = queryType;
        this.error = error;
    }

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
}
