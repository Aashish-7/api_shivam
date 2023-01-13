package com.coforge.api.exception;

import com.coforge.api.exception.dto.Error;

public class BadRequest400Exception extends Abstract4xxException {
    public BadRequest400Exception(String responseStatus, Object data, String databaseSave, String queryType, Error error) {
        super(responseStatus, data, databaseSave, queryType, error);
    }
}
