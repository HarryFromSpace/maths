package com.project.maths.entity;

public class ResponseData<T>
{
    private String status;
    private String message;
    private T data;


    public ResponseData(String status, String message, T data)
    {
        super();
        this.status = status;
        this.message = message;
        this.data = data;
    }


    public void setStatus(String status)
    {
        this.status = status;
    }


    public void setMessage(String message)
    {
        this.message = message;
    }


    public void setData(T data)
    {
        this.data = data;
    }


    @Override
    public String toString()
    {
        return "ResponseData [status=" + status + ", message=" + message + ", data=" + data + "]";
    }

}
