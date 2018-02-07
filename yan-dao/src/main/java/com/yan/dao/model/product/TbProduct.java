package com.yan.dao.model.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbProduct implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_PRODUCT.PRODUCT_CODE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    /**
     * 产品代码（主键）
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private String productCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_PRODUCT.PRODUCT_NAME
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    /**
     * 产品名称
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_PRODUCT.PRODUCT_PRICE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    /**
     * 产品价格
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private BigDecimal productPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_PRODUCT.PRODUCT_NUM
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    /**
     * 产品库存
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private Integer productNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_PRODUCT.PRODUCT_USER
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    /**
     * 操作人员
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private String productUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_PRODUCT.PRODUCT_DATE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    /**
     * 操作时间
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private Date productDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_PRODUCT.PRODUCT_TYPE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    /**
     * 产品类型
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private String productType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_PRODUCT.PRODUCT_STATUS
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    /**
     * 产品状态
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private Boolean productStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_PRODUCT.PRODUCT_CODE
     *
     * @return the value of TB_PRODUCT.PRODUCT_CODE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_PRODUCT.PRODUCT_CODE
     *
     * @param productCode the value for TB_PRODUCT.PRODUCT_CODE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_PRODUCT.PRODUCT_NAME
     *
     * @return the value of TB_PRODUCT.PRODUCT_NAME
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_PRODUCT.PRODUCT_NAME
     *
     * @param productName the value for TB_PRODUCT.PRODUCT_NAME
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_PRODUCT.PRODUCT_PRICE
     *
     * @return the value of TB_PRODUCT.PRODUCT_PRICE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_PRODUCT.PRODUCT_PRICE
     *
     * @param productPrice the value for TB_PRODUCT.PRODUCT_PRICE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_PRODUCT.PRODUCT_NUM
     *
     * @return the value of TB_PRODUCT.PRODUCT_NUM
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_PRODUCT.PRODUCT_NUM
     *
     * @param productNum the value for TB_PRODUCT.PRODUCT_NUM
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_PRODUCT.PRODUCT_USER
     *
     * @return the value of TB_PRODUCT.PRODUCT_USER
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public String getProductUser() {
        return productUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_PRODUCT.PRODUCT_USER
     *
     * @param productUser the value for TB_PRODUCT.PRODUCT_USER
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setProductUser(String productUser) {
        this.productUser = productUser == null ? null : productUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_PRODUCT.PRODUCT_DATE
     *
     * @return the value of TB_PRODUCT.PRODUCT_DATE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public Date getProductDate() {
        return productDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_PRODUCT.PRODUCT_DATE
     *
     * @param productDate the value for TB_PRODUCT.PRODUCT_DATE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_PRODUCT.PRODUCT_TYPE
     *
     * @return the value of TB_PRODUCT.PRODUCT_TYPE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public String getProductType() {
        return productType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_PRODUCT.PRODUCT_TYPE
     *
     * @param productType the value for TB_PRODUCT.PRODUCT_TYPE
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_PRODUCT.PRODUCT_STATUS
     *
     * @return the value of TB_PRODUCT.PRODUCT_STATUS
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public Boolean getProductStatus() {
        return productStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_PRODUCT.PRODUCT_STATUS
     *
     * @param productStatus the value for TB_PRODUCT.PRODUCT_STATUS
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_PRODUCT
     *
     * @mbg.generated Wed Feb 07 16:06:43 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productCode=").append(productCode);
        sb.append(", productName=").append(productName);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productNum=").append(productNum);
        sb.append(", productUser=").append(productUser);
        sb.append(", productDate=").append(productDate);
        sb.append(", productType=").append(productType);
        sb.append(", productStatus=").append(productStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}