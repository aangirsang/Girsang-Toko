/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aangirsang.girsang.toko.model.master;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ifnu
 */
@Entity
@Table(name="RUNNINGNUMBERMASTER")
public class RunningNumber implements Serializable{

    @Id
    @Column(name="ID_RUNNINGNUMBERMASTER")
    private String id;

    @Column(name="NUMBER")
    private Integer number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


}
