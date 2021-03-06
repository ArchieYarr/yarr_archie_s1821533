//<!--Archie Yarr S1821533-->

package com.example.yarr_archie_s1821533;

import java.util.Date;

// for each Item in xml feed
public class TsItem
{
    private String title;
    private String desc;
    private String desc0;
    private String link;
    private String georss;
    private String author;
    private String comments;
    private String pubDate;
    private Date date;
    private Date endDate;
    private Date startDate;
    private long duration;
    public String period;
    public String period2;
    public Boolean inc;
    private String colour;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }


    public Boolean getInc() {return inc;}
    public void setInc(Boolean inc){this.inc = inc;}

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDesc0() {
        return desc0;
    }
    public void setDesc0(String desc0){
        this.desc0 = desc0;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link){
        this.link = link;
    }

    public String getGeoRss() {
        return georss;
    }
    public void setGeoRss(String georss){
        this.georss = georss;
    }

    public String getPubDate() {
        return pubDate;
    }
    public void setPubDate(String pubDate){
        this.pubDate = pubDate;
    }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date sdate){ this.startDate = sdate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date edate){ this.endDate = edate; }

    public String getPeriod() { return period; }
    public void setPeriod(String p){ this.period = p; }

    public String getPeriod2() { return period2; }
    public void setPeriod2(String p2){ this.period2 = p2; }

    public long getDuration() { return duration; }
    public void setDuration(long dur){ this.duration = dur; this.colour = calcColour(dur); }

    public String getColour() { return colour; }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getComments() {
        return comments;
    }
    public void setComments(String comments){
        this.comments = comments;
    }


    private String calcColour(Long d){
        String colour = "";
        int duration = d.intValue();
//        Log.e("MyTag","--");
//        Log.e("MyTag",""+duration);

        if (duration >= 336){
            colour = "0400";
        } else if (duration >= 168) {
            colour = "322F";
        } else if (duration >= 72) {
            colour = "7969";
        } else if (duration >= 48) {
            colour = "B96A";
        } else if (duration >= 24) {
            colour = "E786";
        } else {
            colour = "F3EB";
        }

//        Log.e("MyTag",""+colour);
        return "#FF"+colour;
    }



}
