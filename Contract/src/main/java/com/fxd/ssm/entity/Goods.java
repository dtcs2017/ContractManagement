package com.fxd.ssm.entity;

public class Goods {
    private Integer goodsId;

    private String contracGoodsName;

    private String measureUnit;

    private String goodsDescription;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getContracGoodsName() {
        return contracGoodsName;
    }

    public void setContracGoodsName(String contracGoodsName) {
        this.contracGoodsName = contracGoodsName == null ? null : contracGoodsName.trim();
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit == null ? null : measureUnit.trim();
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription == null ? null : goodsDescription.trim();
    }
}