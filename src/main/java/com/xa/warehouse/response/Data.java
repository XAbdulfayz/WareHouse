package com.xa.warehouse.response;

public class Data <T>{


    protected T body;
    protected Long totalCount;
    protected boolean isSuccess;

    protected APIErrorDTO error;

    public Data(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Data(T body) {
        this.isSuccess = true;
        this.body = body;
    }

    public Data(T body, Long totalCount) {
        this.isSuccess = true;
        this.body = body;
        this.totalCount = totalCount;
    }

    public Data(APIErrorDTO error) {
        this.isSuccess = false;
        this.error = error;
    }

}
