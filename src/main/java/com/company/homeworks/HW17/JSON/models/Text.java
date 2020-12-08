package com.company.homeworks.HW17.JSON.models;

public class Text {
    private String data;
    private Integer size;
    private String style;
    private String name;
    private Integer hOffset;
    private Integer vOffset;
    private String alignment;
    private String onMouseUp;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer gethOffset() {
        return hOffset;
    }

    public void sethOffset(Integer hOffset) {
        this.hOffset = hOffset;
    }

    public Integer getvOffset() {
        return vOffset;
    }

    public void setvOffset(Integer vOffset) {
        this.vOffset = vOffset;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getOnMouseUp() {
        return onMouseUp;
    }

    public void setOnMouseUp(String onMouseUp) {
        this.onMouseUp = onMouseUp;
    }
}
