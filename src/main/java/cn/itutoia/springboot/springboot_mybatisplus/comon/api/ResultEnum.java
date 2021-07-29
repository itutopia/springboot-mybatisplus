package cn.itutoia.springboot.springboot_mybatisplus.comon.api;

/**
 *
 * @author junchao_lee
 */
public enum ResultEnum {
    /**
     * 成功
     */
    SUCCESS(0, "success"),
    ERROR(10001, "save error"),
    FAILED(50001,"error"),
    ;

    private long code;
    private String msg;

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public long getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsg(long code) {
        ResultEnum[] carTypeEnums = values();
        for (ResultEnum resultCode : carTypeEnums) {
            if (resultCode.getCode() == code) {
                return resultCode.getMsg();
            }
        }
        return null;
    }
}

