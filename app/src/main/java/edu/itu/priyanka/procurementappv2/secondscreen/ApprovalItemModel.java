package edu.itu.priyanka.procurementappv2.secondscreen;

import android.os.Parcel;
import android.os.Parcelable;

public class ApprovalItemModel implements Parcelable {
    private String approvalId, approvalAmount, approvalDate, approvalCurrency, approvalCompany, approvalPriority;

    public ApprovalItemModel(String approvalId, String approvalAmount, String approvalDate, String approvalCurrency, String approvalCompany, String approvalPriority) {
        this.approvalId = approvalId;
        this.approvalAmount = approvalAmount;
        this.approvalDate = approvalDate;
        this.approvalCurrency = approvalCurrency;
        this.approvalCompany = approvalCompany;
        this.approvalPriority = approvalPriority;
    }

    protected ApprovalItemModel(Parcel in) {
        approvalId = in.readString();
        approvalAmount = in.readString();
        approvalDate = in.readString();
        approvalCurrency = in.readString();
        approvalCompany = in.readString();
        approvalPriority = in.readString();
    }

    public static final Creator<ApprovalItemModel> CREATOR = new Creator<ApprovalItemModel>() {
        @Override
        public ApprovalItemModel createFromParcel(Parcel in) {
            return new ApprovalItemModel(in);
        }

        @Override
        public ApprovalItemModel[] newArray(int size) {
            return new ApprovalItemModel[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(approvalId);
        dest.writeString(approvalAmount);
        dest.writeString(approvalDate);
        dest.writeString(approvalCurrency);
        dest.writeString(approvalCompany);
        dest.writeString(approvalPriority);
    }
}
