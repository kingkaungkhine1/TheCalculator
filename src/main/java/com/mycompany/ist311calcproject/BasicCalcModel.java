/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ist311calcproject;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author game
 */
@Entity
@Table(name = "BasicCalcModel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BasicCalcModel.findAll", query = "SELECT b FROM BasicCalcModel b"),
    @NamedQuery(name = "BasicCalcModel.findByPrimKey", query = "SELECT b FROM BasicCalcModel b WHERE b.primKey = :primKey"),
    @NamedQuery(name = "BasicCalcModel.findByNum1", query = "SELECT b FROM BasicCalcModel b WHERE b.num1 = :num1"),
    @NamedQuery(name = "BasicCalcModel.findByNum2", query = "SELECT b FROM BasicCalcModel b WHERE b.num2 = :num2"),
    @NamedQuery(name = "BasicCalcModel.findByTotal", query = "SELECT b FROM BasicCalcModel b WHERE b.total = :total"),
    @NamedQuery(name = "BasicCalcModel.findByOperator", query = "SELECT b FROM BasicCalcModel b WHERE b.operator = :operator")})
public class BasicCalcModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "primKey")
    private Integer primKey;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "num1")
    private Float num1;
    @Column(name = "num2")
    private Float num2;
    @Column(name = "total")
    private Float total;
    @Column(name = "operator")
    private Character operator;

    public BasicCalcModel() {
    }

    public BasicCalcModel(Integer primKey) {
        this.primKey = primKey;
    }

    public Integer getPrimKey() {
        return primKey;
    }

    public void setPrimKey(Integer primKey) {
        this.primKey = primKey;
    }

    public Float getNum1() {
        return num1;
    }

    public void setNum1(Float num1) {
        this.num1 = num1;
    }

    public Float getNum2() {
        return num2;
    }

    public void setNum2(Float num2) {
        this.num2 = num2;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (primKey != null ? primKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BasicCalcModel)) {
            return false;
        }
        BasicCalcModel other = (BasicCalcModel) object;
        if ((this.primKey == null && other.primKey != null) || (this.primKey != null && !this.primKey.equals(other.primKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ist311calcproject.BasicCalcModel[ primKey=" + primKey + " ]";
    }
    
}
