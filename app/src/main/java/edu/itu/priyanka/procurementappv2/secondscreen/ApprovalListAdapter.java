package edu.itu.priyanka.procurementappv2.secondscreen;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.itu.priyanka.procurementappv2.R;
import edu.itu.priyanka.procurementappv2.thirdscreen.ThirdActivity;

public class ApprovalListAdapter extends BaseAdapter {
    private List<ApprovalItemModel> approvalItemModelList = new ArrayList<>();

    private Context context;

    public ApprovalListAdapter(Context context) {
        this.context = context;
        setupApprovalList();
    }

    private void setupApprovalList() {
        ApprovalItemModel approvalItemModel1 = new ApprovalItemModel("PR100001", "2450", "05-16-2018", "$ USD", "Best Company", "High", "Past Due");
        ApprovalItemModel approvalItemModel2 = new ApprovalItemModel("PR100002", "560", "02-12-2018", "$ USD", "Best Company", "High", "Past Due");
        ApprovalItemModel approvalItemModel3 = new ApprovalItemModel("PR100003", "2100", "10-16-2017", "$ USD", "Best Company", "High", "Past Due");
        ApprovalItemModel approvalItemModel4 = new ApprovalItemModel("PR100004", "2090", "05-13-2017", "$ USD", "Best Company", "High", "Pending");
        ApprovalItemModel approvalItemModel5 = new ApprovalItemModel("PR100005", "5640", "02-17-2017", "$ USD", "Best Company", "High", "Pending");

        approvalItemModelList.add(approvalItemModel1);
        approvalItemModelList.add(approvalItemModel2);
        approvalItemModelList.add(approvalItemModel3);
        approvalItemModelList.add(approvalItemModel4);
        approvalItemModelList.add(approvalItemModel5);
    }

    @Override
    public int getCount() {
        return approvalItemModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return approvalItemModelList.get(position);
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


        final ApprovalItemModel model = approvalItemModelList.get(position);
        amount.setText(model.getApprovalAmount());
        approvalNumberTextView.setText(model.getApprovalId());
        approvalDate.setText(model.getApprovalDate());
        approvalCurrency.setText(model.getApprovalCurrency());
        approvalCompanyName.setText(model.getApprovalCompany());
        approvalPriorityStatus.setText(model.getApprovalPriority());
        pastDueStatus.setText("Priority : High");

        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ThirdActivity.class);
                intent.putExtra("ApprovalModel",model);
                context.startActivity(intent);
            }
        });

        return listItem;
    }
}
