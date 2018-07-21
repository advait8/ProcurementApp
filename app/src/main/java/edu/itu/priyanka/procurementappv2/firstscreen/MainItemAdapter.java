package edu.itu.priyanka.procurementappv2.firstscreen;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.itu.priyanka.procurementappv2.R;

public class MainItemAdapter extends BaseAdapter {
    private Context mContext;
    private List<MainModel> itemList = new ArrayList<>();
    public MainItemAdapter(@NonNull Context context) {
        setupMainItemList();
        mContext = context;
    }

    private void setupMainItemList() {
        MainModel myApprovalItem = new MainModel("MY APPROVALS", "22" , "4 PAST DUE", "11 PENDING");
        MainModel myReceiptsItem = new MainModel("MY RECEIPTS", "77" , "6 PAST DUE", "");
        MainModel myActivityItem = new MainModel("MY ACTIVITY", "66" , "", "");
        MainModel shopNowItem = new MainModel("", "SHOP NOW" , "CLICK HERE", "");

        itemList.add(myApprovalItem);
        itemList.add(myReceiptsItem);
        itemList.add(myActivityItem);
        itemList.add(shopNowItem);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.main_listview_item,parent,false);

        MainModel currentItem = itemList.get(position);

        TextView headerTextView = listItem.findViewById(R.id.headingTextView);
        headerTextView.setText(currentItem.getHeader());

        TextView titleTextView = listItem.findViewById(R.id.titleTextView);
        titleTextView.setText(currentItem.getTitle());

        TextView approvalTextView = listItem.findViewById(R.id.approvalTextView);
        approvalTextView.setText(currentItem.getApproval());

        TextView pendingTextView = listItem.findViewById(R.id.pendingTextView);
        pendingTextView.setText(currentItem.getPending());

        return listItem;

    }

}
