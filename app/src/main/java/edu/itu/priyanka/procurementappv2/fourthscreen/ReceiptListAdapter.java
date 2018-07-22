package edu.itu.priyanka.procurementappv2.fourthscreen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.itu.priyanka.procurementappv2.R;
import edu.itu.priyanka.procurementappv2.thirdscreen.ThirdActivity;


public class ReceiptListAdapter extends BaseAdapter {

    private List<ReceiptItemModel> receiptItemModelList = new ArrayList<>();

    private Context context;

    public ReceiptListAdapter(Context context) {
        this.context = context;
        setupReceiptList();
    }

    private void setupReceiptList() {
        ReceiptItemModel receiptItemModel1 = new ReceiptItemModel("PR100001", "2450", "05-16-2018", "$ USD", "Best Company", "High", "Past Due");
        ReceiptItemModel receiptItemModel2 = new ReceiptItemModel("PR100002", "560", "02-12-2018", "$ USD", "Best Company", "High", "Past Due");
        ReceiptItemModel receiptItemModel3 = new ReceiptItemModel("PR100003", "2100", "10-16-2017", "$ USD", "Best Company", "High", "Past Due");
        ReceiptItemModel receiptItemModel4 = new ReceiptItemModel("PR100004", "2090", "05-13-2017", "$ USD", "Best Company", "High", "Pending");
        ReceiptItemModel receiptItemModel5 = new ReceiptItemModel("PR100005", "5640", "02-17-2017", "$ USD", "Best Company", "High", "Pending");

        receiptItemModelList.add(receiptItemModel1);
        receiptItemModelList.add(receiptItemModel2);
        receiptItemModelList.add(receiptItemModel3);
        receiptItemModelList.add(receiptItemModel4);
        receiptItemModelList.add(receiptItemModel5);
    }
    @Override
    public int getCount() {
        return receiptItemModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return receiptItemModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.approval_item, parent, false);
        TextView approvalNumberTextView  = listItem.findViewById(R.id.approvalId);
        TextView amount = listItem.findViewById(R.id.amount);
        TextView approvalDate  = listItem.findViewById(R.id.approvalDate);
        TextView approvalCurrency  = listItem.findViewById(R.id.approvalCurrency);
        TextView approvalCompanyName  = listItem.findViewById(R.id.approvalCompanyName);
        TextView approvalPriorityStatus  = listItem.findViewById(R.id.approvalPriorityStatus);
        TextView pastDueStatus  = listItem.findViewById(R.id.pastDueStatus);
        listItem.findViewById(R.id.approvalButton).setVisibility(View.GONE);
        listItem.findViewById(R.id.rejectButton).setVisibility(View.GONE);


        final ReceiptItemModel model = receiptItemModelList.get(position);
        amount.setText(model.getReceiptAmount());
        approvalNumberTextView.setText(model.getReceiptId());
        approvalDate.setText(model.getReceiptDate());
        approvalCurrency.setText(model.getReceiptCurrency());
        approvalCompanyName.setText(model.getReceiptCompany());
        approvalPriorityStatus.setText(model.getReceiptPriority());
        pastDueStatus.setText("Priority : High");


        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ThirdActivity.class);
                intent.putExtra("ReceiptModel",model);
                context.startActivity(intent);
            }
        });

        return listItem;
    }
}
