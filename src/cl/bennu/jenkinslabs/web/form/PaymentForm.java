package cl.bennu.jenkinslabs.web.form;

import java.util.Date;
import java.util.List;

public class PaymentForm extends BaseForm {

    private String name;
    private String desc;
    private Date date;
    private List items;
    private List paymentList;

    private Long paymentId;


    public List getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List paymentList) {
        this.paymentList = paymentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }
}
