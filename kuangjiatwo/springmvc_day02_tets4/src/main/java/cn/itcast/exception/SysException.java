package cn.itcast.exception;

public class SysException extends Exception{
    //存储提示信息
    private String message;


    public SysException(String s) {
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
