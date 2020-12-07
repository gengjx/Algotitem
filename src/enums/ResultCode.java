package enums;

/**
 * @Auther: gjx
 * @Date: 2020/12/7 - 12 - 07 - 17:29
 * @Description: enums
 * @version: 1.0
 */
public enum ResultCode {
    BANK_RECEIVE("01", "预付款按比例支付"),
    /** 02 按协议约束支付*/
    BILL_AGREEMENT("02", "按协议约束支付"),
    /** 03 按账期支付*/
    BILL_RECEIVE("03", "按账期支付");


    private String code;
    private String message;
    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
