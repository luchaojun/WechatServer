package com.example.springbootdemo.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class ProductProgress {
    private String customer_no;
    private String customer_nane;
    private String sale_order;
    private String mono;
    private Integer assy_quantity;
    private Integer pack_quantity;
    private Integer pick_quantity;
    private Integer pick_real_quantity;
    private Timestamp create_date;
    private String part_no;
    private String order_quantity;

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getCustomer_nane() {
        return customer_nane;
    }

    public void setCustomer_nane(String customer_nane) {
        this.customer_nane = customer_nane;
    }

    public String getSale_order() {
        return sale_order;
    }

    public void setSale_order(String sale_order) {
        this.sale_order = sale_order;
    }

    public String getMono() {
        return mono;
    }

    public void setMono(String mono) {
        this.mono = mono;
    }

    public Integer getAssy_quantity() {
        return assy_quantity;
    }

    public void setAssy_quantity(Integer assy_quantity) {
        this.assy_quantity = assy_quantity;
    }

    public Integer getPack_quantity() {
        return pack_quantity;
    }

    public void setPack_quantity(Integer pack_quantity) {
        this.pack_quantity = pack_quantity;
    }

    public Integer getPick_quantity() {
        return pick_quantity;
    }

    public void setPick_quantity(Integer pick_quantity) {
        this.pick_quantity = pick_quantity;
    }

    public Integer getPick_real_quantity() {
        return pick_real_quantity;
    }

    public void setPick_real_quantity(Integer pick_real_quantity) {
        this.pick_real_quantity = pick_real_quantity;
    }

    public  Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public String getPart_no() {
        return part_no;
    }

    public void setPart_no(String part_no) {
        this.part_no = part_no;
    }

    public String getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(String order_quantity) {
        this.order_quantity = order_quantity;
    }

    @Override
    public String toString() {
        return "ProductProcess{" +
                "customer_no='" + customer_no + '\'' +
                ", customer_nane='" + customer_nane + '\'' +
                ", sale_order='" + sale_order + '\'' +
                ", mono='" + mono + '\'' +
                ", assy_quantity=" + assy_quantity +
                ", pack_quantity=" + pack_quantity +
                ", pick_quantity=" + pick_quantity +
                ", pick_real_quantity=" + pick_real_quantity +
                ", create_date=" + create_date +
                ", part_no='" + part_no + '\'' +
                ", order_quantity='" + order_quantity + '\'' +
                '}';
    }
}