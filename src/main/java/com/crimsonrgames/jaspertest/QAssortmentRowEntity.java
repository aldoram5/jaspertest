/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crimsonrgames.jaspertest;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author aldo
 */

public class QAssortmentRowEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer qassortmentRowId;
    
    private Integer qassortmentId;
    
    private String product;
    
    private String description;
    
    private String materials;
    
    private Integer cOrdered;
    
    private Integer cFound;
    
    private Float wFound;
    
    private Float wOrdered;
    
    private Date createdTime;
    
    private Integer photoId;
    
    private String comment;

    public Integer getQassortmentRowId() {
        return qassortmentRowId;
    }

    public void setQassortmentRowId(Integer qassortmentRowId) {
        this.qassortmentRowId = qassortmentRowId;
    }

    public Integer getQassortmentId() {
        return qassortmentId;
    }

    public void setQassortmentId(Integer qassortmentId) {
        this.qassortmentId = qassortmentId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public Integer getcOrdered() {
        return cOrdered;
    }

    public void setcOrdered(Integer cOrdered) {
        this.cOrdered = cOrdered;
    }

    public Integer getcFound() {
        return cFound;
    }

    public void setcFound(Integer cFound) {
        this.cFound = cFound;
    }

    public Float getwFound() {
        return wFound;
    }

    public void setwFound(Float wFound) {
        this.wFound = wFound;
    }

    public Float getwOrdered() {
        return wOrdered;
    }

    public void setwOrdered(Float wOrdered) {
        this.wOrdered = wOrdered;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        int prime = 31;
        hash = prime * hash + Objects.hashCode(this.qassortmentRowId);
        hash = prime * hash + Objects.hashCode(this.qassortmentId);
        hash = prime * hash + Objects.hashCode(this.product);
        hash = prime * hash + Objects.hashCode(this.description);
        hash = prime * hash + Objects.hashCode(this.materials);
        hash = prime * hash + Objects.hashCode(this.cOrdered);
        hash = prime * hash + Objects.hashCode(this.cFound);
        hash = prime * hash + Objects.hashCode(this.wFound);
        hash = prime * hash + Objects.hashCode(this.wOrdered);
        hash = prime * hash + Objects.hashCode(this.createdTime);
        hash = prime * hash + Objects.hashCode(this.photoId);
        hash = prime * hash + Objects.hashCode(this.comment);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final QAssortmentRowEntity other = (QAssortmentRowEntity) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.materials, other.materials)) {
            return false;
        }
        if (!Objects.equals(this.qassortmentRowId, other.qassortmentRowId)) {
            return false;
        }
        if (!Objects.equals(this.qassortmentId, other.qassortmentId)) {
            return false;
        }
        if (!Objects.equals(this.cOrdered, other.cOrdered)) {
            return false;
        }
        if (!Objects.equals(this.cFound, other.cFound)) {
            return false;
        }
        if (!Objects.equals(this.wFound, other.wFound)) {
            return false;
        }
        if (!Objects.equals(this.wOrdered, other.wOrdered)) {
            return false;
        }
        if (!Objects.equals(this.createdTime, other.createdTime)) {
            return false;
        }
        if (!Objects.equals(this.photoId, other.photoId)) {
            return false;
        }
        if (!Objects.equals(this.comment, other.comment)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QAssortmentRowEntity{" + "qassortmentRowId=" + qassortmentRowId + ", qassortmentId=" + qassortmentId + ", product=" + product + ", description=" + description + ", materials=" + materials + ", cOrdered=" + cOrdered + ", cFound=" + cFound + ", wFound=" + wFound + ", wOrdered=" + wOrdered + ", createdTime=" + createdTime + ", photoId=" + photoId + ", comment=" + comment + '}';
    }

}