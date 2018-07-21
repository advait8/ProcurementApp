package edu.itu.priyanka.procurementappv2.secondscreen;

public class ApprovalItemModel {
    private String approvalId, approvalAmount, approvalDate, approvalCurrency, approvalCompany, approvalPriority;

    public ApprovalItemModel(String approvalId, String approvalAmount, String approvalDate, String approvalCurrency, String approvalCompany, String approvalPriority) {
        this.approvalId = approvalId;
        this.approvalAmount = approvalAmount;
        this.approvalDate = approvalDate;
        this.approvalCurrency = approvalCurrency;
        this.approvalCompany = approvalCompany;
        this.approvalPriority = approvalPriority;
    }

    public String getApprovalId() {
        return approvalId;
    }

    public String getApprovalAmount() {
        return approvalAmount;
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public String getApprovalCurrency() {
        return approvalCurrency;
    }

    public String getApprovalCompany() {
        return approvalCompany;
    }

    public String getApprovalPriority() {
        return approvalPriority;
    }
}
