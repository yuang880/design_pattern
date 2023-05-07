package com.zhangxd.demo.design;

public class Result {

    private String code;
    private String info;

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static Result success(){
        return new Result("000000", "变更状态成功");
    }

    public static Result success(String info){
        return new Result("000000", info);
    }

    public static Result fail(){
        return new Result("000001", "变更状态拒绝");
    }

    public static Result fail(String info){
        return new Result("000001", info);
    }

}
