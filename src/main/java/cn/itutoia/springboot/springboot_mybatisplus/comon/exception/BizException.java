package cn.itutoia.springboot.springboot_mybatisplus.comon.exception;

/**
 * 业务异常类
 * @author junchao_lee
 */
public class BizException extends RuntimeException{

    public BizException() {
        super();
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }
}
