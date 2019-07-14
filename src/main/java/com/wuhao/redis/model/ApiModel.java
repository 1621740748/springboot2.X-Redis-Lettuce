package com.wuhao.redis.model;

import lombok.Data;

import java.util.Map;

@Data
public class ApiModel {
    private Integer code;
    private String message;
    private Map<String,Object> map;

    public ApiModel(String message){
        this.message = message;
        this.code=1;
    }
    public ApiModel(){
        this.message = "";
        this.code = 0;
    }
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

}
