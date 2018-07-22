package edu.itu.priyanka.procurementappv2.fourthscreen;

import android.os.Parcel;
import android.os.Parcelable;

public class ReceiptItemModel implements Parcelable{
    private String receiptId, receiptAmount, receiptDate, receiptCurrency, receiptCompany, receiptPriority, receiptStatus;

    public ReceiptItemModel(String receiptId, String receiptAmount, String receiptDate, String receiptCurrency, String receiptCompany, String receiptPriority, String receiptStatus) {
        this.receiptId = receiptId;
        this.receiptAmount = receiptAmount;
        this.receiptDate = receiptDate;
        this.receiptCurrency = receiptCurrency;
        this.receiptCompany = receiptCompany;
        this.receiptPriority = receiptPriority;
        this.receiptStatus = receiptStatus;
    }

    protected ReceiptItemModel(Parcel in) {
        receiptId = in.readString();
        receiptAmount = in.readString();
        receiptDate = in.readString();
        receiptCurrency = in.readString();
        receiptCompany = in.readString();
        receiptPriority = in.readString();
        receiptStatus = in.readString();
    }

    public static final Creator<ReceiptItemModel> CREATOR = new Creator<ReceiptItemModel>() {
        @Override
        public ReceiptItemModel createFromParcel(Parcel in) {
            return new ReceiptItemModel(in);
        }

        @Override
        public ReceiptItemModel[] newArray(int size) {
            return new ReceiptItemModel[size];
        }
    };

    public String getReceiptId() {
        return receiptId;
    }

    public String getReceiptAmount() {
        return receiptAmount;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public String getReceiptCurrency() {
        return receiptCurrency;
    }

    public String getReceiptCompany() {
        return receiptCompany;
    }

    public String getReceiptPriority() {
        return receiptPriority;
    }

    public String getReceiptStatus() {
        return receiptStatus;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(receiptId);
        dest.writeString(receiptAmount);
        dest.writeString(receiptDate);
        dest.writeString(receiptCurrency);
        dest.writeString(receiptCompany);
        dest.writeString(receiptPriority);
        dest.writeString(receiptStatus);
    }
}
