package com.example.histoquique;

public class Story {

    String title;
    String subtitle;
    String subtitle2;
    String textLeft;
    String subTextLeft;

    public Story(String title, String subtitle, String subtitle2, String textLeft, String subTextLeft) {
        this.title = title;
        this.subtitle = subtitle;
        this.subtitle2 = subtitle2;
        this.textLeft = textLeft;
        this.subTextLeft = subTextLeft;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSubtitle2() {
        return subtitle2;
    }

    public void setSubtitle2(String subtitle2) {
        this.subtitle2 = subtitle2;
    }

    public String getTextLeft() {
        return textLeft;
    }

    public void setTextLeft(String textLeft) {
        this.textLeft = textLeft;
    }

    public String getSubTextLeft() {
        return subTextLeft;
    }

    public void setSubTextLeft(String subTextLeft) {
        this.subTextLeft = subTextLeft;
    }
}
