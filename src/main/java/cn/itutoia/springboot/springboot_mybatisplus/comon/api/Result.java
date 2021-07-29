package cn.itutoia.springboot.springboot_mybatisplus.comon.api;

import lombok.Data;

/**
 * 结果对象
 * @author junchao_lee
 * @param <T>
 */
@Data
public class Result<T> {
    private long code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(long code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> success() {
        return new Result<T>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMsg(), data);
    }

    public static <T> Result<T> failed(String msg) {
        return new Result<T>(ResultEnum.FAILED.getCode(), msg, null);
    }

}
