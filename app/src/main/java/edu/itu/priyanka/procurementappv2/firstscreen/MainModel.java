package edu.itu.priyanka.procurementappv2.firstscreen;

public class MainModel {
    private String header, title, approval, pending;

    public MainModel(String header, String title, String approval, String pending) {
        this.header = header;
        this.title = title;
        this.approval = approval;
        this.pending = pending;
    }

    public String getHeader() {
        return header;
    }

    public String getTitle() {
        return title;
    }

    public String getApproval() {
        return approval;
    }

    public String getPending() {
        return pending;
    }
}
