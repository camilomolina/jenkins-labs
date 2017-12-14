package cl.bennu.jenkinslabs.commons.dto;

import cl.bennu.jenkinslabs.commons.dto.base.BaseDTO;

import java.util.Date;
import java.util.List;

public class PaymentDTO extends BaseDTO {

    private String name;
    private String description;
    private String address;
    private Date date;
    private List itemPaymentList;
    private Double amount;
    private Boolean active;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List getItemPaymentList() {
        return itemPaymentList;
    }

    public void setItemPaymentList(List itemPaymentList) {
        this.itemPaymentList = itemPaymentList;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
