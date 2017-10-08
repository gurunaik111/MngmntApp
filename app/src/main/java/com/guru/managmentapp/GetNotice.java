package com.guru.managmentapp;



public class GetNotice {
    private String noticeText;
    private String noticeNo;

   public GetNotice(String noticeText,String noticeNo)
    {
       this.noticeText=noticeText;
        this.noticeNo=noticeNo;
    }

    public String getNoticeText() {
        return noticeText;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public void setNoticText(String notice) {
        this.noticeText = noticeText;
    }
}
