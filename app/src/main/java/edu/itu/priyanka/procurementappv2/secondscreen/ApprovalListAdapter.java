package edu.itu.priyanka.procurementappv2.secondscreen;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class ApprovalListAdapter extends BaseAdapter {
    private List<ApprovalItemModel> approvalItemModelList = new ArrayList<>();

    private Context context;

    public ApprovalListAdapter(Context context) {
        this.context = context;
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
        return null;
    }
}
