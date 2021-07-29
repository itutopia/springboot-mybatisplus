package cn.itutoia.springboot.springboot_mybatisplus.comon.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private long code;
    private String msg;
    private T data;

    /**
     * 成功返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(),data);
    }

    /**
     * 成功返回结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data, String msg){
        return new Result<T>(ResultCode.SUCCESS.getCode(), msg,data);
    }

    /**
     * 失败返回结果
     * @param  msg
     * @param <T>
     * @return
     */
    public static <T> Result<T> failed(String msg){
        return new Result<T>(ResultCode.FAILED.getCode(), msg, null);
    }

}