package cn.itutoia.springboot.springboot_mybatisplus.comon.base;


public enum ResultCode {
    SUCCESS(200, "success"),
    FAILED(500, "fail"),
    VALIDATE_FAILED(404, "参数校验失败")
    ;

    private long code;
    private String msg;

    ResultCode(long code, String msg){
        this.code = code;
        this.msg = msg;
    }
    public long getCode(){
        return code;
    }
    public String getMsg(){
        return msg;
    }
}


